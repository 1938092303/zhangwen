package com.suneee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suneee.entity.AlgorithmInfo;
import com.suneee.entity.RuleLimit;
import com.suneee.entity.RuleLimitExample;
import com.suneee.entity.RuleLimitExample.Criteria;
import com.suneee.entity.RuleLimitVo;
import com.suneee.entity.TaskInfo;
import com.suneee.entity.TaskInfoExample;
import com.suneee.mapper.AlgorithmInfoMapper;
import com.suneee.mapper.RuleLimitMapper;
import com.suneee.mapper.TaskInfoMapper;
import com.suneee.service.RuleLimitService;
import com.suneee.utils.Pager;
import com.suneee.utils.ValueJudgment;

/**
 * 
 * @author zmd
 *
 */
@Service
public class RuleLimitServiceImpl implements RuleLimitService{

	@Autowired
	private RuleLimitMapper ruleLimitMapper;
	
	@Autowired
	private AlgorithmInfoMapper algorithmInfoMapper;
	
	@Autowired
	private TaskInfoMapper taskInfoMapper;
	
	@Override
	public int add(RuleLimit ruleLimit) {
		// TODO Auto-generated method stub
		return ruleLimitMapper.insert(ruleLimit);
	}

	@Override
	public RuleLimit query(Integer id) {
		// TODO Auto-generated method stub
		return ruleLimitMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(RuleLimit ruleLimit) {
		// TODO Auto-generated method stub
		RuleLimitExample example=new RuleLimitExample();
		Criteria criteria=example.createCriteria();
		criteria.andIdEqualTo(ruleLimit.getId());
		return ruleLimitMapper.updateByExampleSelective(ruleLimit, example) ;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		ruleLimitMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<RuleLimit> queryList(RuleLimit ruleLimit, Pager page) {
		// TODO Auto-generated method stub
		RuleLimitExample example=new RuleLimitExample();
		example.setOrderByClause("create_time");
		Criteria criteria=example.createCriteria();
		int sdkNum=ruleLimit.getSdkNum();
		if(sdkNum!=0){
			criteria.andSdkNumEqualTo(ruleLimit.getSdkNum());
		}
		long totalRow=ruleLimitMapper.countByExample(example);
		page.setTalPage(totalRow);
		BeanUtils.copyProperties(page, example);
		return ruleLimitMapper.selectByExample(example);
	}
	
	

	@Override
	public RuleLimit queryByAlgorithm(Integer id,String compCode) {
		// TODO Auto-generated method stub
		RuleLimitExample example=new RuleLimitExample();
		Criteria criteria=example.createCriteria();
		if(id!=0){
			criteria.andSdkNumEqualTo(id);
		}
		if(compCode!=null&&!"".equals(compCode)){
			criteria.andCompCodeEqualTo(compCode);
		}
		criteria.andTypeEqualTo("0");
		List<RuleLimit> list=ruleLimitMapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	@Override
	public List<RuleLimitVo> queryRecord(RuleLimit ruleLimit, Pager page) {
		RuleLimitExample example=new RuleLimitExample();
		example.setOrderByClause("create_time desc");
		Criteria criteria=example.createCriteria();
		String compCode = ruleLimit.getCompCode();
		if(ValueJudgment.stringIsNotNull(compCode)){
			criteria.andCompCodeEqualTo(compCode);
		}
		Integer algorithmId=ruleLimit.getSdkNum();
		if(algorithmId!=null){
			criteria.andSdkNumEqualTo(algorithmId);
		}
		criteria.andTypeEqualTo(ruleLimit.getType());
		long totalRow=ruleLimitMapper.countByExample(example);
		if(page!=null){
			page.setTalPage(totalRow);
			BeanUtils.copyProperties(page, example);
		}
		List<RuleLimit> ruleLimitlist=ruleLimitMapper.selectByExample(example);
		List<RuleLimitVo> ruleLimitVoList=new ArrayList<>();
		for(int i=0;i<ruleLimitlist.size();i++){
			RuleLimit limit=ruleLimitlist.get(i);
			RuleLimitVo vo=new RuleLimitVo();
			AlgorithmInfo info=algorithmInfoMapper.selectByPrimaryKey(limit.getSdkNum());
			vo.setId(limit.getId());
			vo.setSdkNum(limit.getSdkNum());
			vo.setAddNum(limit.getAddNum());
			vo.setAddDay(limit.getAddDay());
			vo.setCompName(limit.getCompName());
			vo.setAlgoName(info.getName());
			vo.setDesc(info.getDescption());
			vo.setCreateTime(limit.getCreateTime());
			vo.setCompCode(limit.getCompCode());
			TaskInfoExample taskexample = new TaskInfoExample();
			taskexample.createCriteria().andRelationIdEqualTo(limit.getId()).andRelationTypeEqualTo("4");
			List<TaskInfo> tasks = taskInfoMapper.selectByExample(taskexample);
			if(tasks.size()>0){
				vo.setStatus(tasks.get(0).getStatus());
				vo.setRefuseReason(tasks.get(0).getRefuseReason());
				vo.setUpdateTime(tasks.get(0).getUpdateTime());
			}
			ruleLimitVoList.add(vo);
		}
		return ruleLimitVoList;
	}

}
