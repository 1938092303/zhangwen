package com.zw.servlet;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zw.annotation.GPAutowired;
import com.zw.annotation.GPController;
import com.zw.annotation.GPRequestMapping;
import com.zw.annotation.GPService;


public class GPDispatcherServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6129108677939646677L;
	
	private static final String LOCATION="contextConfigLocation";
	
	private Properties properties=new Properties();
	
	private List<String> classNames=new ArrayList<String>();
	
	private Map<String, Object> ioc=new HashMap<String, Object>();
	
	private Map<String, Method> handlerMapping=new HashMap<String, Method>();
	
	
	
	public GPDispatcherServlet() {super();}
	
	public void init(ServletConfig config) throws ServletException{
		doLoadConfig(config.getInitParameter(LOCATION));
		
		doScanner(properties.getProperty("scanPackage"));
		
		doInstance();
		
		doAutowired();
		
		initHandlerMapping();
		
		System.out.println("mvc is init");
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		this.doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		try {
			doDispatch(request, response);
		} catch (Exception e) {
			response.getWriter().write("500 Server Exception"+Arrays.toString(e.getStackTrace()).replaceAll("\\[|\\]", "")
					.replaceAll(",\\s", "\r\n"));
		}
	}
	
	private void doDispatch(HttpServletRequest request,HttpServletResponse response) throws IOException {
		if(this.handlerMapping.isEmpty())
			return;
		
		String url=request.getRequestURI();
		String contextPath=request.getContextPath();
		url=url.replace(contextPath, "").replaceAll("/+", "/");
		
		if(!this.handlerMapping.containsKey(url)) {
			response.getWriter().write("404 not found");
			return;
		}
		
		Map<String, String[]> params=request.getParameterMap();
		Method method=this.handlerMapping.get(url);
		Class<?>[] parameterTypes=method.getParameterTypes();
		
		Map<String, String[]> parameterMap=request.getParameterMap();
		Object[] paramValues=new Object[parameterTypes.length];
		
		for(int i=0;i<parameterTypes.length;i++) {
			Class<?> paramType=parameterTypes[i];
			if(paramType==HttpServletRequest.class) {
				paramValues[i]=request;
				continue;
			}else if(paramType==HttpServletResponse.class) {
				paramValues[i]=response;
				continue;
			}else if(paramType==String.class) {
				for(Entry<String, String[]> param:parameterMap.entrySet()) {
					String value=Arrays.toString(param.getValue())
							.replaceAll("\\[|\\]", "")
							.replaceAll(",\\s", "");
					paramValues[i]=value;
							
				}
			}
		}
		
		try {
			String beanName=lowerFirstCase(method.getDeclaringClass().getSimpleName());
			method.invoke(ioc.get(beanName), paramValues);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void doLoadConfig(String location) {
		InputStream in=null;
		try {
			in=this.getClass().getClassLoader().getResourceAsStream(location);
			properties.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(null!=in) {
					in.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
	
	private void doScanner(String packageName) {
		URL url=this.getClass().getClassLoader().getResource("/"+packageName.replaceAll("\\.","/"));
		File dir=new File(url.getFile());
		for(File file:dir.listFiles()) {
			if(file.isDirectory()) {
				doScanner(packageName+"."+file.getName());
			}else {
				classNames.add(packageName+"."+file.getName().replace(".class", "").trim());
			}
		}
	}
	
	private String lowerFirstCase(String str) {
		char[] chars=str.toCharArray();
		chars[0]+=32;
		return String.valueOf(chars);
	}
	
	private void doInstance() {
		if(classNames.size()==0)
			return;
		try {
			for(String className:classNames) {
				Class<?> clazz=Class.forName(className);
				if(clazz.isAnnotationPresent(GPController.class)) {
					String beanName=lowerFirstCase(clazz.getSimpleName());
					ioc.put(beanName, clazz.newInstance());
				}else if(clazz.isAnnotationPresent(GPService.class)) {
					GPService service=clazz.getAnnotation(GPService.class);
					String beanName=service.value();
					if(!"".equals(beanName)) {
						ioc.put(beanName, clazz.newInstance());
						continue;
					}
					
					Class<?>[] interfaces=clazz.getInterfaces();
					for(Class<?> i:interfaces) {
						ioc.put(i.getName(), clazz.newInstance());
					}
				}else {
					continue;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void doAutowired() {
		if(ioc.isEmpty())
			return;
		for (Entry<String, Object> entry:ioc.entrySet()) {
			Field[] fields=entry.getValue().getClass().getDeclaredFields();
			for(Field field:fields) {
				if(!field.isAnnotationPresent(GPAutowired.class)) {
					continue;
				}
				
				GPAutowired autowired=field.getAnnotation(GPAutowired.class);
				String beanName=autowired.value().trim();
				if("".equals(beanName)) {
					beanName=field.getType().getName();
				}
				field.setAccessible(true);
				try {
					field.set(entry.getValue(), ioc.get(beanName));
				} catch (Exception e) {
					e.printStackTrace();
					continue;
				}
			}
		}
	}
	
	private void initHandlerMapping() {
		if(ioc.isEmpty())
			return;
		
		for (Entry<String, Object> entry:ioc.entrySet()) {
			Class<?> clazz=entry.getValue().getClass();
			if(!clazz.isAnnotationPresent(GPController.class)) {
				continue;
			}
			
			String baseUrl="";
			if(clazz.isAnnotationPresent(GPRequestMapping.class)) {
				GPRequestMapping requestMapping=clazz.getAnnotation(GPRequestMapping.class);
				baseUrl=requestMapping.value();
			}
			
			Method[] methods=clazz.getMethods();
			for(Method method:methods) {
				if(!method.isAnnotationPresent(GPRequestMapping.class)) {
					continue;
				}
				
				GPRequestMapping requestMapping=method.getAnnotation(GPRequestMapping.class);
				String url=(baseUrl+"/"+requestMapping.value().replaceAll("/+","/"));
				handlerMapping.put(url, method);
				System.out.println("mapped"+url+","+method);
			}
		}
	}

}
