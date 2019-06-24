package com.suneee.entity;

import java.util.Date;

/**
 * 
 * @author zmd
 *
 */
public class AlgorithmInfoVo extends AlgorithmInfo{
	
	/**
	 * 订购状态
	 */
	private int orderStatus;
	
	/**
	 * 订购时间
	 */
	private Date ordertime;
	
	private String typeName;
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
	 * 总天数
	 */
	private String totalDay;
	/**
	 * 剩余使用天数
	 */
    private String surplusDay;

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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

	public String getTotalDay() {
		return totalDay;
	}

	public void setTotalDay(String totalDay) {
		this.totalDay = totalDay;
	}


	
	
}
