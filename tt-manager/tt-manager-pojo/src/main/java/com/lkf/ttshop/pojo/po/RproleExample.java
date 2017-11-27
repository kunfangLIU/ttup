package com.lkf.ttshop.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RproleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RproleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("rolename is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("rolename is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("rolename =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("rolename <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("rolename >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("rolename >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("rolename <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("rolename <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("rolename like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("rolename not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("rolename in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("rolename not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("rolename between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("rolename not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolestatusIsNull() {
            addCriterion("rolestatus is null");
            return (Criteria) this;
        }

        public Criteria andRolestatusIsNotNull() {
            addCriterion("rolestatus is not null");
            return (Criteria) this;
        }

        public Criteria andRolestatusEqualTo(String value) {
            addCriterion("rolestatus =", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusNotEqualTo(String value) {
            addCriterion("rolestatus <>", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusGreaterThan(String value) {
            addCriterion("rolestatus >", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusGreaterThanOrEqualTo(String value) {
            addCriterion("rolestatus >=", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusLessThan(String value) {
            addCriterion("rolestatus <", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusLessThanOrEqualTo(String value) {
            addCriterion("rolestatus <=", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusLike(String value) {
            addCriterion("rolestatus like", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusNotLike(String value) {
            addCriterion("rolestatus not like", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusIn(List<String> values) {
            addCriterion("rolestatus in", values, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusNotIn(List<String> values) {
            addCriterion("rolestatus not in", values, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusBetween(String value1, String value2) {
            addCriterion("rolestatus between", value1, value2, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusNotBetween(String value1, String value2) {
            addCriterion("rolestatus not between", value1, value2, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("Deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("Deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("Deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("Deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("Deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("Deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("Deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("Deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("Deleted like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("Deleted not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("Deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("Deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("Deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("Deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andRoleremarkIsNull() {
            addCriterion("roleremark is null");
            return (Criteria) this;
        }

        public Criteria andRoleremarkIsNotNull() {
            addCriterion("roleremark is not null");
            return (Criteria) this;
        }

        public Criteria andRoleremarkEqualTo(String value) {
            addCriterion("roleremark =", value, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkNotEqualTo(String value) {
            addCriterion("roleremark <>", value, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkGreaterThan(String value) {
            addCriterion("roleremark >", value, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkGreaterThanOrEqualTo(String value) {
            addCriterion("roleremark >=", value, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkLessThan(String value) {
            addCriterion("roleremark <", value, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkLessThanOrEqualTo(String value) {
            addCriterion("roleremark <=", value, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkLike(String value) {
            addCriterion("roleremark like", value, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkNotLike(String value) {
            addCriterion("roleremark not like", value, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkIn(List<String> values) {
            addCriterion("roleremark in", values, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkNotIn(List<String> values) {
            addCriterion("roleremark not in", values, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkBetween(String value1, String value2) {
            addCriterion("roleremark between", value1, value2, "roleremark");
            return (Criteria) this;
        }

        public Criteria andRoleremarkNotBetween(String value1, String value2) {
            addCriterion("roleremark not between", value1, value2, "roleremark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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