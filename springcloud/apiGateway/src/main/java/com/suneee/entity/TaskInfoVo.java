package com.suneee.entity;

/**
 * 
 * @author zmd
 *
 */
public class TaskInfoVo extends TaskInfo{
	
	private String sdkName;
	
	private String fileName;
	
	private String installPackageName;
	
	/**
	 * 负责人
	 */
	private String person;
	
	/**
	 * 公司Id
	 */
	private Integer companyInfoId;
	
	private String desc;
	
	/**
	 * 算法名称
	 */
	private String algorithmInfoName;
	
	/**
	 * 退订原因
	 */
	private String unsubscribeReason;
	
	/**
	 * 算法id
	 */
	private Integer algorithmId;
	
	/**
	 * 公司名称
	 */
	private String compName;
	
	/**
	 * 算法状态  0：正常  1：已删除
	 */
	private String algoStatus;
	
	private String compCode;
	
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
    /**
     * 申请天数
     */
    private Integer addDay;
	

	public String getAlgoStatus() {
		return algoStatus;
	}

	public void setAlgoStatus(String algoStatus) {
		this.algoStatus = algoStatus;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public Integer getAlgorithmId() {
		return algorithmId;
	}

	public void setAlgorithmId(Integer algorithmId) {
		this.algorithmId = algorithmId;
	}

	public String getUnsubscribeReason() {
		return unsubscribeReason;
	}

	public void setUnsubscribeReason(String unsubscribeReason) {
		this.unsubscribeReason = unsubscribeReason;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSdkName() {
		return sdkName;
	}

	public void setSdkName(String sdkName) {
		this.sdkName = sdkName;
	}

	public String getInstallPackageName() {
		return installPackageName;
	}

	public void setInstallPackageName(String installPackageName) {
		this.installPackageName = installPackageName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAlgorithmInfoName() {
		return algorithmInfoName;
	}

	public void setAlgorithmInfoName(String algorithmInfoName) {
		this.algorithmInfoName = algorithmInfoName;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public Integer getCompanyInfoId() {
		return companyInfoId;
	}

	public void setCompanyInfoId(Integer companyInfoId) {
		this.companyInfoId = companyInfoId;
	}

	public String getCompCode() {
		return compCode;
	}

	public void setCompCode(String compCode) {
		this.compCode = compCode;
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

	public Integer getAddDay() {
		return addDay;
	}

	public void setAddDay(Integer addDay) {
		this.addDay = addDay;
	}

}
