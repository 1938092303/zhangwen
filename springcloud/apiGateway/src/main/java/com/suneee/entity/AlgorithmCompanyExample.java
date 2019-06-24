package com.suneee.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlgorithmCompanyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    public AlgorithmCompanyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
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

        public Criteria andAlgorithmIdIsNull() {
            addCriterion("algorithm_id is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdIsNotNull() {
            addCriterion("algorithm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdEqualTo(Integer value) {
            addCriterion("algorithm_id =", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdNotEqualTo(Integer value) {
            addCriterion("algorithm_id <>", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdGreaterThan(Integer value) {
            addCriterion("algorithm_id >", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("algorithm_id >=", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdLessThan(Integer value) {
            addCriterion("algorithm_id <", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdLessThanOrEqualTo(Integer value) {
            addCriterion("algorithm_id <=", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdIn(List<Integer> values) {
            addCriterion("algorithm_id in", values, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdNotIn(List<Integer> values) {
            addCriterion("algorithm_id not in", values, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdBetween(Integer value1, Integer value2) {
            addCriterion("algorithm_id between", value1, value2, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("algorithm_id not between", value1, value2, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andCompCodeIsNull() {
            addCriterion("comp_code is null");
            return (Criteria) this;
        }

        public Criteria andCompCodeIsNotNull() {
            addCriterion("comp_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompCodeEqualTo(String value) {
            addCriterion("comp_code =", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeNotEqualTo(String value) {
            addCriterion("comp_code <>", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeGreaterThan(String value) {
            addCriterion("comp_code >", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeGreaterThanOrEqualTo(String value) {
            addCriterion("comp_code >=", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeLessThan(String value) {
            addCriterion("comp_code <", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeLessThanOrEqualTo(String value) {
            addCriterion("comp_code <=", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeLike(String value) {
            addCriterion("comp_code like", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeNotLike(String value) {
            addCriterion("comp_code not like", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeIn(List<String> values) {
            addCriterion("comp_code in", values, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeNotIn(List<String> values) {
            addCriterion("comp_code not in", values, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeBetween(String value1, String value2) {
            addCriterion("comp_code between", value1, value2, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeNotBetween(String value1, String value2) {
            addCriterion("comp_code not between", value1, value2, "compCode");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table algo_comp
     *
     * @mbg.generated do_not_delete_during_merge Thu Jun 21 17:29:05 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table algo_comp
     *
     * @mbg.generated Thu Jun 21 17:29:05 CST 2018
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
}