package com.suneee.utils;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.suneee.entity.AlgorithmCompany;
import com.suneee.entity.AlgorithmPath;
import com.suneee.entity.RuleLimit;
import com.suneee.entity.SecretKeyInfo;
import com.suneee.service.AlgorithmCompanyService;
import com.suneee.service.AlgorithmPathService;
import com.suneee.service.RuleLimitService;
import com.suneee.service.SecretKeyInfoService;

public class AccessTokenFilter extends ZuulFilter{

	@Autowired
	private AlgorithmCompanyService algorithmCompanyServiceImpl;
	
	@Autowired
	private SecretKeyInfoService secretKeyInfoServiceImpl;
	
	@Autowired
	private AlgorithmPathService algorithmPathServiceImpl;
	
	@Autowired
	private RuleLimitService ruleLimitServiceImpl;
	
	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext context=RequestContext.getCurrentContext();
		context.getResponse().setContentType("text/html;charset=UTF-8");
		HttpServletRequest request=context.getRequest();
		String appid=request.getParameter("appid");
		String appkey=request.getParameter("appkey");
		String compCode=request.getParameter("compCode");
		String path=request.getServletPath();
		SecretKeyInfo secretKeyInfo=new SecretKeyInfo();
		secretKeyInfo.setAppid(appid);
		secretKeyInfo.setAppkey(appkey);
		secretKeyInfo.setCompCode(compCode);
		SecretKeyInfo secretKeyInfo1=secretKeyInfoServiceImpl.query(secretKeyInfo);
		Boolean permission=false;
		if(null!=secretKeyInfo1){
				AlgorithmPath algorithmPath=algorithmPathServiceImpl.queryAlgorithmPathByPath(path);
				if(null!=algorithmPath){
						List<AlgorithmCompany>list=algorithmCompanyServiceImpl.queryList(compCode);
						if(list.size()>0){
							for(int i=0;i<list.size();i++){
								if(algorithmPath.getAlgorithmId().equals(list.get(i).getAlgorithmId())){
									permission=true;
								}
							}
						}
						if(permission==true){
							RuleLimit ruleLimit=ruleLimitServiceImpl.queryByAlgorithm(algorithmPath.getAlgorithmId(),compCode);
							if(ruleLimit==null)
								try {
									throw new Exception("数据异常！");
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							int surplusNum=ruleLimit.getSurplusNum();
							int surplusDay=ruleLimit.getAddDay()-DateUtils.differentDaysByMillisecond(ruleLimit.getCreateTime(), new Date());
							
							if(surplusNum<1){
								context.setSendZuulResponse(false);
								context.setResponseStatusCode(200);	
								context.setResponseBody("{\"status\":\"200\",\"message\":\"算法可用次数已使用完，请续签后继续使用！\",\"code\":\"0\",\"data\":null,\"page\":null}");
								context.set("isSuccess", false);
								return null;
							}else if(surplusDay<1){
								context.setSendZuulResponse(false);
								context.setResponseStatusCode(200);	
								context.setResponseBody("{\"status\":\"200\",\"message\":\"算法使用时间已到期，请续签后继续使用！\",\"code\":\"0\",\"data\":null,\"page\":null}");
								context.set("isSuccess", false);
								return null;
							}else{
								context.setSendZuulResponse(true);
								context.setResponseStatusCode(200);
								context.set("isSuccess", true);
								return null;
							}
						}else{
							context.setSendZuulResponse(false);
							context.setResponseStatusCode(200);	
							context.setResponseBody("{\"status\":\"200\",\"message\":\"您未订购此算法！\",\"code\":\"0\",\"data\":null,\"page\":null}");
							context.set("isSuccess", false);
							return null;
						}	
				}else{
					context.setSendZuulResponse(false);
					context.setResponseStatusCode(200);
					context.setResponseBody("{\"status\":\"200\",\"message\":\"接口不存在！\",\"code\":\"0\",\"data\":null,\"page\":null}");
					context.set("isSuccess", false);
					return null;
				}
		}else{
			context.setSendZuulResponse(false);
			context.setResponseStatusCode(200);
			context.setResponseBody("{\"status\":\"200\",\"message\":\"密钥信息有误，请确认密钥和企业编码以及应用id无误！\",\"code\":\"0\",\"data\":null,\"page\":null}");
			context.set("isSuccess", false);
			return null;
		}
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
