package com.zw.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zw.annotation.GPAutowired;
import com.zw.annotation.GPController;
import com.zw.annotation.GPRequestMapping;
import com.zw.annotation.GPRequestParam;
import com.zw.service.IDemoService;

@GPController
@GPRequestMapping("/demo")
public class DemoAction {
	
	@GPAutowired
	private IDemoService demoService;
	
	
	@GPRequestMapping("query")
	public void query(HttpServletRequest request,HttpServletResponse response,@GPRequestParam("name") String name) {
		String result=demoService.get(name);
		try {
			response.getWriter().write(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
