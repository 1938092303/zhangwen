package com.suneee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suneee.entity.SecretKeyInfo;
import com.suneee.entity.SecretKeyInfoExample;
import com.suneee.entity.SecretKeyInfoExample.Criteria;
import com.suneee.mapper.SecretKeyInfoMapper;
import com.suneee.service.SecretKeyInfoService;

@Service
public class SecretKeyInfoServiceImpl implements SecretKeyInfoService{
	
	@Autowired
	private SecretKeyInfoMapper secretKeyInfoMapper;

	@Override
	public SecretKeyInfo query(SecretKeyInfo secretKeyInfo) {
		// TODO Auto-generated method stub
		SecretKeyInfoExample example=new SecretKeyInfoExample();
		Criteria criteria=example.createCriteria();
		String appid=secretKeyInfo.getAppid();
		if(appid!=null&&!"".equals(appid)){
			criteria.andAppidEqualTo(appid);
		}
		String appkey=secretKeyInfo.getAppkey();
		if(appkey!=null&&!"".equals(appkey)){
			criteria.andAppkeyEqualTo(appkey);
		}
		String compCode=secretKeyInfo.getCompCode();
		if(compCode!=null&&!"".equals(compCode)){
			criteria.andCompCodeEqualTo(compCode);
		}
		criteria.andStateEqualTo("1");
		 List<SecretKeyInfo> list=secretKeyInfoMapper.selectByExample(example);
		 if(list.size()>0){
			 return list.get(0);
		 }else{
			 return null;
		 }
	}

}
