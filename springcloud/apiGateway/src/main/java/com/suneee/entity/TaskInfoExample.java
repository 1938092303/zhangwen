package com.suneee.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.suneee.utils.Pager;

/**
 * 
 * @author zmd
 *
 */
public class TaskInfoExample extends Pager{
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public TaskInfoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andTaskNameIsNull() {
			addCriterion("task_name is null");
			return (Criteria) this;
		}

		public Criteria andTaskNameIsNotNull() {
			addCriterion("task_name is not null");
			return (Criteria) this;
		}

		public Criteria andTaskNameEqualTo(String value) {
			addCriterion("task_name =", value, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameNotEqualTo(String value) {
			addCriterion("task_name <>", value, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameGreaterThan(String value) {
			addCriterion("task_name >", value, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
			addCriterion("task_name >=", value, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameLessThan(String value) {
			addCriterion("task_name <", value, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameLessThanOrEqualTo(String value) {
			addCriterion("task_name <=", value, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameLike(String value) {
			addCriterion("task_name like", value, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameNotLike(String value) {
			addCriterion("task_name not like", value, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameIn(List<String> values) {
			addCriterion("task_name in", values, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameNotIn(List<String> values) {
			addCriterion("task_name not in", values, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameBetween(String value1, String value2) {
			addCriterion("task_name between", value1, value2, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskNameNotBetween(String value1, String value2) {
			addCriterion("task_name not between", value1, value2, "taskName");
			return (Criteria) this;
		}

		public Criteria andTaskDescIsNull() {
			addCriterion("task_desc is null");
			return (Criteria) this;
		}

		public Criteria andTaskDescIsNotNull() {
			addCriterion("task_desc is not null");
			return (Criteria) this;
		}

		public Criteria andTaskDescEqualTo(String value) {
			addCriterion("task_desc =", value, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescNotEqualTo(String value) {
			addCriterion("task_desc <>", value, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescGreaterThan(String value) {
			addCriterion("task_desc >", value, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescGreaterThanOrEqualTo(String value) {
			addCriterion("task_desc >=", value, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescLessThan(String value) {
			addCriterion("task_desc <", value, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescLessThanOrEqualTo(String value) {
			addCriterion("task_desc <=", value, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescLike(String value) {
			addCriterion("task_desc like", value, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescNotLike(String value) {
			addCriterion("task_desc not like", value, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescIn(List<String> values) {
			addCriterion("task_desc in", values, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescNotIn(List<String> values) {
			addCriterion("task_desc not in", values, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescBetween(String value1, String value2) {
			addCriterion("task_desc between", value1, value2, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andTaskDescNotBetween(String value1, String value2) {
			addCriterion("task_desc not between", value1, value2, "taskDesc");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andErrorInfoIsNull() {
			addCriterion("error_info is null");
			return (Criteria) this;
		}

		public Criteria andErrorInfoIsNotNull() {
			addCriterion("error_info is not null");
			return (Criteria) this;
		}

		public Criteria andErrorInfoEqualTo(String value) {
			addCriterion("error_info =", value, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoNotEqualTo(String value) {
			addCriterion("error_info <>", value, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoGreaterThan(String value) {
			addCriterion("error_info >", value, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoGreaterThanOrEqualTo(String value) {
			addCriterion("error_info >=", value, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoLessThan(String value) {
			addCriterion("error_info <", value, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoLessThanOrEqualTo(String value) {
			addCriterion("error_info <=", value, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoLike(String value) {
			addCriterion("error_info like", value, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoNotLike(String value) {
			addCriterion("error_info not like", value, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoIn(List<String> values) {
			addCriterion("error_info in", values, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoNotIn(List<String> values) {
			addCriterion("error_info not in", values, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoBetween(String value1, String value2) {
			addCriterion("error_info between", value1, value2, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andErrorInfoNotBetween(String value1, String value2) {
			addCriterion("error_info not between", value1, value2, "errorInfo");
			return (Criteria) this;
		}

		public Criteria andApplicantIsNull() {
			addCriterion("applicant is null");
			return (Criteria) this;
		}

		public Criteria andApplicantIsNotNull() {
			addCriterion("applicant is not null");
			return (Criteria) this;
		}

		public Criteria andApplicantEqualTo(String value) {
			addCriterion("applicant =", value, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantNotEqualTo(String value) {
			addCriterion("applicant <>", value, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantGreaterThan(String value) {
			addCriterion("applicant >", value, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantGreaterThanOrEqualTo(String value) {
			addCriterion("applicant >=", value, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantLessThan(String value) {
			addCriterion("applicant <", value, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantLessThanOrEqualTo(String value) {
			addCriterion("applicant <=", value, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantLike(String value) {
			addCriterion("applicant like", value, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantNotLike(String value) {
			addCriterion("applicant not like", value, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantIn(List<String> values) {
			addCriterion("applicant in", values, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantNotIn(List<String> values) {
			addCriterion("applicant not in", values, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantBetween(String value1, String value2) {
			addCriterion("applicant between", value1, value2, "applicant");
			return (Criteria) this;
		}

		public Criteria andApplicantNotBetween(String value1, String value2) {
			addCriterion("applicant not between", value1, value2, "applicant");
			return (Criteria) this;
		}

		public Criteria andExecutorIsNull() {
			addCriterion("executor is null");
			return (Criteria) this;
		}

		public Criteria andExecutorIsNotNull() {
			addCriterion("executor is not null");
			return (Criteria) this;
		}

		public Criteria andExecutorEqualTo(String value) {
			addCriterion("executor =", value, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorNotEqualTo(String value) {
			addCriterion("executor <>", value, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorGreaterThan(String value) {
			addCriterion("executor >", value, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorGreaterThanOrEqualTo(String value) {
			addCriterion("executor >=", value, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorLessThan(String value) {
			addCriterion("executor <", value, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorLessThanOrEqualTo(String value) {
			addCriterion("executor <=", value, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorLike(String value) {
			addCriterion("executor like", value, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorNotLike(String value) {
			addCriterion("executor not like", value, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorIn(List<String> values) {
			addCriterion("executor in", values, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorNotIn(List<String> values) {
			addCriterion("executor not in", values, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorBetween(String value1, String value2) {
			addCriterion("executor between", value1, value2, "executor");
			return (Criteria) this;
		}

		public Criteria andExecutorNotBetween(String value1, String value2) {
			addCriterion("executor not between", value1, value2, "executor");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(Integer value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andRelationIdIsNull() {
			addCriterion("relation_id is null");
			return (Criteria) this;
		}

		public Criteria andRelationIdIsNotNull() {
			addCriterion("relation_id is not null");
			return (Criteria) this;
		}

		public Criteria andRelationIdEqualTo(Integer value) {
			addCriterion("relation_id =", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdNotEqualTo(Integer value) {
			addCriterion("relation_id <>", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdGreaterThan(Integer value) {
			addCriterion("relation_id >", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("relation_id >=", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdLessThan(Integer value) {
			addCriterion("relation_id <", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdLessThanOrEqualTo(Integer value) {
			addCriterion("relation_id <=", value, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdIn(List<Integer> values) {
			addCriterion("relation_id in", values, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdNotIn(List<Integer> values) {
			addCriterion("relation_id not in", values, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdBetween(Integer value1, Integer value2) {
			addCriterion("relation_id between", value1, value2, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationIdNotBetween(Integer value1, Integer value2) {
			addCriterion("relation_id not between", value1, value2, "relationId");
			return (Criteria) this;
		}

		public Criteria andRelationTypeIsNull() {
			addCriterion("relation_type is null");
			return (Criteria) this;
		}

		public Criteria andRelationTypeIsNotNull() {
			addCriterion("relation_type is not null");
			return (Criteria) this;
		}

		public Criteria andRelationTypeEqualTo(String value) {
			addCriterion("relation_type =", value, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeNotEqualTo(String value) {
			addCriterion("relation_type <>", value, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeGreaterThan(String value) {
			addCriterion("relation_type >", value, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeGreaterThanOrEqualTo(String value) {
			addCriterion("relation_type >=", value, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeLessThan(String value) {
			addCriterion("relation_type <", value, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeLessThanOrEqualTo(String value) {
			addCriterion("relation_type <=", value, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeLike(String value) {
			addCriterion("relation_type like", value, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeNotLike(String value) {
			addCriterion("relation_type not like", value, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeIn(List<String> values) {
			addCriterion("relation_type in", values, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeNotIn(List<String> values) {
			addCriterion("relation_type not in", values, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeBetween(String value1, String value2) {
			addCriterion("relation_type between", value1, value2, "relationType");
			return (Criteria) this;
		}

		public Criteria andRelationTypeNotBetween(String value1, String value2) {
			addCriterion("relation_type not between", value1, value2, "relationType");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonIsNull() {
			addCriterion("refuse_reason is null");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonIsNotNull() {
			addCriterion("refuse_reason is not null");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonEqualTo(String value) {
			addCriterion("refuse_reason =", value, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonNotEqualTo(String value) {
			addCriterion("refuse_reason <>", value, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonGreaterThan(String value) {
			addCriterion("refuse_reason >", value, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonGreaterThanOrEqualTo(String value) {
			addCriterion("refuse_reason >=", value, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonLessThan(String value) {
			addCriterion("refuse_reason <", value, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonLessThanOrEqualTo(String value) {
			addCriterion("refuse_reason <=", value, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonLike(String value) {
			addCriterion("refuse_reason like", value, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonNotLike(String value) {
			addCriterion("refuse_reason not like", value, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonIn(List<String> values) {
			addCriterion("refuse_reason in", values, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonNotIn(List<String> values) {
			addCriterion("refuse_reason not in", values, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonBetween(String value1, String value2) {
			addCriterion("refuse_reason between", value1, value2, "refuseReason");
			return (Criteria) this;
		}

		public Criteria andRefuseReasonNotBetween(String value1, String value2) {
			addCriterion("refuse_reason not between", value1, value2, "refuseReason");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table task_info
	 * @mbg.generated  Tue May 15 14:44:20 CST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task_info
     *
     * @mbg.generated do_not_delete_during_merge Sun Apr 22 15:38:37 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}