package com.suneee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suneee.entity.AlgorithmCompany;
import com.suneee.entity.AlgorithmCompanyExample;
import com.suneee.entity.AlgorithmCompanyExample.Criteria;
import com.suneee.mapper.AlgorithmCompanyMapper;
import com.suneee.service.AlgorithmCompanyService;
@Service
public class AlgorithmCompanyServiceImpl implements AlgorithmCompanyService{
	
	@Autowired
	private AlgorithmCompanyMapper algorithmCompanyMapper;

	@Override
	public List<AlgorithmCompany> queryList(String compCode) {
		// TODO Auto-generated method stub
		AlgorithmCompanyExample example=new AlgorithmCompanyExample();
		Criteria criteria=example.createCriteria();
		criteria.andCompCodeEqualTo(compCode);
		return algorithmCompanyMapper.selectByExample(example);
	}

}
