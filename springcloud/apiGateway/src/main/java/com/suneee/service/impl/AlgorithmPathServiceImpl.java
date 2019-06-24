package com.suneee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suneee.entity.AlgorithmPath;
import com.suneee.mapper.AlgorithmPathMapper;
import com.suneee.service.AlgorithmPathService;

@Service
public class AlgorithmPathServiceImpl implements AlgorithmPathService{
	
	@Autowired
	private AlgorithmPathMapper algorithmPathMapper;

	@Override
	public AlgorithmPath queryAlgorithmPathByPath(String path) {
		// TODO Auto-generated method stub
		return algorithmPathMapper.selectByPath(path);
	}

}
