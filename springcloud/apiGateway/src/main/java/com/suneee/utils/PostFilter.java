package com.suneee.utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.suneee.entity.AlgorithmPath;
import com.suneee.entity.RuleLimit;
import com.suneee.service.AlgorithmPathService;
import com.suneee.service.RuleLimitService;

@Component
public class PostFilter extends ZuulFilter{
	
	@Autowired
	private RuleLimitService ruleLimitServiceImpl;
	
	@Autowired
	private AlgorithmPathService algorithmPathServiceImpl;

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
        RequestContext ctx = RequestContext.getCurrentContext();
        InputStream stream = ctx.getResponseDataStream();
        String body=null;
        try {
			 body = StreamUtils.copyToString(stream, Charset.forName("UTF-8"));
             JSONObject result=JSONObject.parseObject(body);
             String message=result.get("message").toString();
             if("success".equals(message)){
            	 Map params=ctx.getRequestQueryParams();
            	 String compCode=params.get("compCode").toString().replace("[", "");
            	 compCode=compCode.replaceAll("]", "");
            	 String url=ctx.getRequest().getRequestURI();
            	 AlgorithmPath algorithmPath=algorithmPathServiceImpl.queryAlgorithmPathByPath(url);
            	 RuleLimit ruleLimit=ruleLimitServiceImpl.queryByAlgorithm(algorithmPath.getAlgorithmId(),compCode);
            	 ruleLimit.setSurplusNum(ruleLimit.getSurplusNum()-1);
				 ruleLimitServiceImpl.update(ruleLimit);
             }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return null;
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
		return "post";
	}

}
