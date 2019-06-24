package com.suneee.utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.RefreshableRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.util.StringUtils;

import com.suneee.entity.ZuulRouteVO;
import com.suneee.service.GatewayRouteService;

public class CustomRouteLocator extends SimpleRouteLocator implements RefreshableRouteLocator {

	private final static Logger log = LoggerFactory.getLogger(CustomRouteLocator.class);

	private ZuulProperties properties;

	private List<ZuulRouteVO> jdbcData;

	public void setJdbcData(List<ZuulRouteVO> jdbcData) {
		this.jdbcData = jdbcData;
	}

	@Autowired
	private GatewayRouteService gatewayRouteServiceImpl;

	public CustomRouteLocator(String servletPath, ZuulProperties properties) {
		super(servletPath, properties);
		this.properties = properties;
		log.info("servletPath:{}", servletPath);
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		doRefresh();
	}

	protected Map<String, ZuulProperties.ZuulRoute> locateRoutes() {
		LinkedHashMap<String, ZuulProperties.ZuulRoute> routesMap = new LinkedHashMap<>();
		// 从application.properties中加载路由信息
		routesMap.putAll(super.locateRoutes());
		// 从db中加载路由信息
		routesMap.putAll(locateRoutesFromDB());
		// 优化一下配置
		LinkedHashMap<String, ZuulProperties.ZuulRoute> values = new LinkedHashMap<>();
		for (Map.Entry<String, ZuulProperties.ZuulRoute> entry : routesMap.entrySet()) {
			String path = entry.getKey();
			// Prepend with slash if not already present.
			if (!path.startsWith("/")) {
				path = "/" + path;
			}
			if (StringUtils.hasText(this.properties.getPrefix())) {
				path = this.properties.getPrefix() + path;
				if (!path.startsWith("/")) {
					path = "/" + path;
				}
			}
			values.put(path, entry.getValue());
		}
		return values;
	}

	private Map<String, ZuulProperties.ZuulRoute> locateRoutesFromDB() {
		Map<String, ZuulProperties.ZuulRoute> routes = new LinkedHashMap<>();
		List<ZuulRouteVO> results = gatewayRouteServiceImpl.queryList(true);
		for (ZuulRouteVO result : results) {
			if (StringUtils.isEmpty(result.getPath())) {
				continue;
			}
			if (StringUtils.isEmpty(result.getServiceId()) && StringUtils.isEmpty(result.getUrl())) {
				continue;
			}
			ZuulProperties.ZuulRoute zuulRoute = new ZuulProperties.ZuulRoute();
			try {
				BeanUtils.copyProperties(result, zuulRoute);
			} catch (Exception e) {
				log.error("=============load zuul route info from db with error==============", e);
			}
			routes.put(zuulRoute.getPath(), zuulRoute);
		}
		return routes;
	}

}
