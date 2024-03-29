package com.suneee.entity;

import java.util.Date;

/**
 * 
 * @author zmd
 *
 */
public class TaskInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.id
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.task_name
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private String taskName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.task_desc
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private String taskDesc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.status
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.error_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private String errorInfo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.applicant
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private String applicant;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.executor
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private String executor;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.type
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private Integer type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.relation_id
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private Integer relationId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.relation_type
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private String relationType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.create_time
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.update_time
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column task_info.refuse_reason
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	private String refuseReason;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.id
	 * @return  the value of task_info.id
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.id
	 * @param id  the value for task_info.id
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.task_name
	 * @return  the value of task_info.task_name
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.task_name
	 * @param taskName  the value for task_info.task_name
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.task_desc
	 * @return  the value of task_info.task_desc
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public String getTaskDesc() {
		return taskDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.task_desc
	 * @param taskDesc  the value for task_info.task_desc
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.status
	 * @return  the value of task_info.status
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.status
	 * @param status  the value for task_info.status
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.error_info
	 * @return  the value of task_info.error_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public String getErrorInfo() {
		return errorInfo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.error_info
	 * @param errorInfo  the value for task_info.error_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.applicant
	 * @return  the value of task_info.applicant
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public String getApplicant() {
		return applicant;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.applicant
	 * @param applicant  the value for task_info.applicant
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.executor
	 * @return  the value of task_info.executor
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public String getExecutor() {
		return executor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.executor
	 * @param executor  the value for task_info.executor
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setExecutor(String executor) {
		this.executor = executor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.type
	 * @return  the value of task_info.type
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.type
	 * @param type  the value for task_info.type
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.relation_id
	 * @return  the value of task_info.relation_id
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public Integer getRelationId() {
		return relationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.relation_id
	 * @param relationId  the value for task_info.relation_id
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.relation_type
	 * @return  the value of task_info.relation_type
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public String getRelationType() {
		return relationType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.relation_type
	 * @param relationType  the value for task_info.relation_type
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.create_time
	 * @return  the value of task_info.create_time
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.create_time
	 * @param createTime  the value for task_info.create_time
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.update_time
	 * @return  the value of task_info.update_time
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.update_time
	 * @param updateTime  the value for task_info.update_time
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column task_info.refuse_reason
	 * @return  the value of task_info.refuse_reason
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public String getRefuseReason() {
		return refuseReason;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column task_info.refuse_reason
	 * @param refuseReason  the value for task_info.refuse_reason
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
}