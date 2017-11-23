package com.lkf.ttshop.pojo.po;

import java.math.BigDecimal;

public class UserRole {
    private BigDecimal id;

    private BigDecimal userid;

    private BigDecimal roleid;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public BigDecimal getRoleid() {
        return roleid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }
}