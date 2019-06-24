package com.suneee.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.suneee.service.GatewayRouteService;
import com.suneee.utils.AccessTokenFilter;
import com.suneee.utils.CustomRouteLocator;


@SpringBootApplication
@EnableZuulProxy
@ComponentScan(basePackages={"com.suneee"})
@MapperScan("com.suneee.mapper")
public class ApiGatewayApplication {
	
	@Autowired  
    ZuulProperties zuulProperties;  
    @Autowired  
    ServerProperties server;
    
    @Autowired
	private GatewayRouteService gatewayRouteServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
	/**
	 * 
	 * @return
	 */
	@Bean
    public AccessTokenFilter accessFilter() {
        return new AccessTokenFilter();
    }
	
	@Bean  
    public CustomRouteLocator routeLocator() {  
        CustomRouteLocator routeLocator = new CustomRouteLocator(this.server.getServlet().getServletPrefix(), this.zuulProperties);    
        routeLocator.setJdbcData(gatewayRouteServiceImpl.queryList(true));
        return routeLocator;  
    }
}
