package com.lkf.ttshop.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RpuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RpuserExample() {
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

        public Criteria andIdIn(List<BigDecimal> values) {
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

        public Criteria andUseraccountIsNull() {
            addCriterion("useraccount is null");
            return (Criteria) this;
        }

        public Criteria andUseraccountIsNotNull() {
            addCriterion("useraccount is not null");
            return (Criteria) this;
        }

        public Criteria andUseraccountEqualTo(String value) {
            addCriterion("useraccount =", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotEqualTo(String value) {
            addCriterion("useraccount <>", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountGreaterThan(String value) {
            addCriterion("useraccount >", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountGreaterThanOrEqualTo(String value) {
            addCriterion("useraccount >=", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLessThan(String value) {
            addCriterion("useraccount <", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLessThanOrEqualTo(String value) {
            addCriterion("useraccount <=", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLike(String value) {
            addCriterion("useraccount like", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotLike(String value) {
            addCriterion("useraccount not like", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountIn(List<String> values) {
            addCriterion("useraccount in", values, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotIn(List<String> values) {
            addCriterion("useraccount not in", values, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountBetween(String value1, String value2) {
            addCriterion("useraccount between", value1, value2, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotBetween(String value1, String value2) {
            addCriterion("useraccount not between", value1, value2, "useraccount");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUserstatusIsNull() {
            addCriterion("userstatus is null");
            return (Criteria) this;
        }

        public Criteria andUserstatusIsNotNull() {
            addCriterion("userstatus is not null");
            return (Criteria) this;
        }

        public Criteria andUserstatusEqualTo(String value) {
            addCriterion("userstatus =", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotEqualTo(String value) {
            addCriterion("userstatus <>", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusGreaterThan(String value) {
            addCriterion("userstatus >", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusGreaterThanOrEqualTo(String value) {
            addCriterion("userstatus >=", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLessThan(String value) {
            addCriterion("userstatus <", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLessThanOrEqualTo(String value) {
            addCriterion("userstatus <=", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusLike(String value) {
            addCriterion("userstatus like", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotLike(String value) {
            addCriterion("userstatus not like", value, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusIn(List<String> values) {
            addCriterion("userstatus in", values, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotIn(List<String> values) {
            addCriterion("userstatus not in", values, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusBetween(String value1, String value2) {
            addCriterion("userstatus between", value1, value2, "userstatus");
            return (Criteria) this;
        }

        public Criteria andUserstatusNotBetween(String value1, String value2) {
            addCriterion("userstatus not between", value1, value2, "userstatus");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DeptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DeptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(BigDecimal value) {
            addCriterion("DeptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(BigDecimal value) {
            addCriterion("DeptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(BigDecimal value) {
            addCriterion("DeptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DeptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(BigDecimal value) {
            addCriterion("DeptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DeptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<BigDecimal> values) {
            addCriterion("DeptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<BigDecimal> values) {
            addCriterion("DeptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DeptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DeptId not between", value1, value2, "deptid");
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

        public Criteria andDeletedIn(List<Long> values) {
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

        public Criteria andUserremarkIsNull() {
            addCriterion("userremark is null");
            return (Criteria) this;
        }

        public Criteria andUserremarkIsNotNull() {
            addCriterion("userremark is not null");
            return (Criteria) this;
        }

        public Criteria andUserremarkEqualTo(String value) {
            addCriterion("userremark =", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkNotEqualTo(String value) {
            addCriterion("userremark <>", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkGreaterThan(String value) {
            addCriterion("userremark >", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkGreaterThanOrEqualTo(String value) {
            addCriterion("userremark >=", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkLessThan(String value) {
            addCriterion("userremark <", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkLessThanOrEqualTo(String value) {
            addCriterion("userremark <=", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkLike(String value) {
            addCriterion("userremark like", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkNotLike(String value) {
            addCriterion("userremark not like", value, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkIn(List<String> values) {
            addCriterion("userremark in", values, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkNotIn(List<String> values) {
            addCriterion("userremark not in", values, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkBetween(String value1, String value2) {
            addCriterion("userremark between", value1, value2, "userremark");
            return (Criteria) this;
        }

        public Criteria andUserremarkNotBetween(String value1, String value2) {
            addCriterion("userremark not between", value1, value2, "userremark");
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