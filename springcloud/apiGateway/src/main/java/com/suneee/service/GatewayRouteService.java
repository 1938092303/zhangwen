package com.suneee.service;

import java.util.List;


import com.suneee.entity.ZuulRouteVO;

public interface GatewayRouteService {
	
	public List<ZuulRouteVO> queryList(Boolean enable);

}
