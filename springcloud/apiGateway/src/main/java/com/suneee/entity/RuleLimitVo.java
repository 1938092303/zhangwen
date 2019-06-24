package com.suneee.entity;

public class RuleLimitVo extends RuleLimit{


	/**
	 * 算法名称
	 */
	private String algoName;

	/**
	 * 算法描述
	 */
	private String desc;
	/**
	 * 拒绝原因
	 */
	private String refuseReason;
	/**
	 * 
	 * 申请次数
	 */
	private Integer addNum;
	/**
	 * 剩余次数
	 */
	private Integer surplusNum;
	/**
	 * 剩余使用天数
	 */
	private String surplusDay;
	
	private String status;

	public String getAlgoName() {
		return algoName;
	}

	public void setAlgoName(String algoName) {
		this.algoName = algoName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public Integer getAddNum() {
		return addNum;
	}

	public void setAddNum(Integer addNum) {
		this.addNum = addNum;
	}

	public Integer getSurplusNum() {
		return surplusNum;
	}

	public void setSurplusNum(Integer surplusNum) {
		this.surplusNum = surplusNum;
	}

	public String getSurplusDay() {
		return surplusDay;
	}

	public void setSurplusDay(String surplusDay) {
		this.surplusDay = surplusDay;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
