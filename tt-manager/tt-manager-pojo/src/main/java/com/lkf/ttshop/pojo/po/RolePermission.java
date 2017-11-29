package com.lkf.ttshop.pojo.po;

import java.math.BigDecimal;
import java.util.List;

public class RolePermission {
    private BigDecimal id;

    private BigDecimal roleid;

    private BigDecimal perid;
    private List<Rprole> rproles;

    public List<Rprole> getRproles() {
        return rproles;
    }

    public void setRproles(List<Rprole> rproles) {
        this.rproles = rproles;
    }

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