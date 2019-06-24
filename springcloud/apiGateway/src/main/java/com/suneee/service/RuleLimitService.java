package com.suneee.service;

import java.util.List;

import com.suneee.entity.RuleLimit;
import com.suneee.entity.RuleLimitVo;
import com.suneee.utils.Pager;

/**
 * 
 * @author zmd
 *
 */
public interface RuleLimitService {
	
	/**
	 * 添加
	 * @param ruleLimit
	 * @return
	 */
    public int add(RuleLimit ruleLimit);
	
    /**
     * 查询
     * @param id
     * @return
     */
	public RuleLimit query(Integer id);
	
	/**
	 * 修改
	 * @param ruleLimit
	 * @return
	 */
	public int update(RuleLimit ruleLimit);
	
	/**
	 * 删除
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * 查询列表
	 * @param ruleLimit
	 * @param page
	 * @return
	 */
	public List<RuleLimit> queryList(RuleLimit ruleLimit,Pager page);
	/**
	 * 根据算法id查询
	 * @param id
	 * @return
	 */
	public RuleLimit queryByAlgorithm(Integer id,String compCode);
	/**
	 * 
	 * @param ruleLimit
	 * @param page
	 * @return
	 */
	public List<RuleLimitVo> queryRecord(RuleLimit ruleLimit,Pager page);

}
