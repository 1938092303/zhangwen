package com.suneee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suneee.entity.GatewayRoute;
import com.suneee.entity.GatewayRouteExample;
import com.suneee.entity.GatewayRouteExample.Criteria;
import com.suneee.entity.ZuulRouteVO;
import com.suneee.mapper.GatewayRouteMapper;
import com.suneee.service.GatewayRouteService;

@Service
public class GatewayRouteServiceImpl implements GatewayRouteService{
	
	@Autowired
	private GatewayRouteMapper gatewayRouteMapper;

	@Override
	public List<ZuulRouteVO> queryList(Boolean enable) {
		// TODO Auto-generated method stub
		GatewayRouteExample example=new GatewayRouteExample();
		Criteria criteria=example.createCriteria();
		criteria.andEnabledEqualTo(enable);
		List<GatewayRoute> list=gatewayRouteMapper.selectByExample(example);
		List<ZuulRouteVO> zuulList=new ArrayList<ZuulRouteVO>();
		if (list.size()>0) {
			for (GatewayRoute gatewayRoute : list) {
				ZuulRouteVO zuulRouteVO=new ZuulRouteVO();
				BeanUtils.copyProperties(gatewayRoute,zuulRouteVO);
				zuulList.add(zuulRouteVO);
			}
		}
		return zuulList;
	}

}
