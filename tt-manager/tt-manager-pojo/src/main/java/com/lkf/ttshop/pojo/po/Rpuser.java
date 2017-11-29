package com.lkf.ttshop.pojo.po;

import java.math.BigDecimal;
import java.util.List;

public class Rpuser {
    private BigDecimal id;

    private String useraccount;

    private String password;

    private String username;

    private String sex;

    private String mobile;

    private String email;

    private String userstatus;

    private BigDecimal deptid;

    private String deleted;

    private String userremark;

    private List<Rprole> roles;

    public List<Rprole> getRoles() {
        return roles;
    }

    public void setRoles(List<Rprole> roles) {
        this.roles = roles;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount == null ? null : useraccount.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus == null ? null : userstatus.trim();
    }

    public BigDecimal getDeptid() {
        return deptid;
    }

    public void setDeptid(BigDecimal deptid) {
        this.deptid = deptid;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted ;
    }

    public String getUserremark() {
        return userremark;
    }

    public void setUserremark(String userremark) {
        this.userremark = userremark == null ? null : userremark.trim();
    }
}