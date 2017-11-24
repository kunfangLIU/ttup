package com.lkf.ttshop.pojo.po;

import java.math.BigDecimal;

public class Rpdept {
    private BigDecimal id;

    private String deptname;

    private String deptcode;

    private Long parentid;

    private Short ordernum;

    private Boolean deptlevel;

    private String deleted;

    private String deptremark;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Short getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Short ordernum) {
        this.ordernum = ordernum;
    }

    public Boolean getDeptlevel() {
        return deptlevel;
    }

    public void setDeptlevel(Boolean deptlevel) {
        this.deptlevel = deptlevel;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted ;
    }

    public String getDeptremark() {
        return deptremark;
    }

    public void setDeptremark(String deptremark) {
        this.deptremark = deptremark == null ? null : deptremark.trim();
    }
}