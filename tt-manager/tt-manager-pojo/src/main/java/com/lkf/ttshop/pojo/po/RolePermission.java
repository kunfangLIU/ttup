package com.lkf.ttshop.pojo.po;

import java.math.BigDecimal;

public class RolePermission {
    private BigDecimal id;

    private BigDecimal roleid;

    private BigDecimal perid;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getRoleid() {
        return roleid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public BigDecimal getPerid() {
        return perid;
    }

    public void setPerid(BigDecimal perid) {
        this.perid = perid;
    }
}