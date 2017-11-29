package com.lkf.ttshop.pojo.po;

import java.math.BigDecimal;
import java.util.List;

public class Rprole {
    private BigDecimal id;

    private String rolename;

    private String rolestatus;

    private String deleted;

    private String roleremark;
    private List<Rpuser> rpusers;
    private List<Rppermission> rppermissions;

    public List<Rppermission> getRppermissions() {
        return rppermissions;
    }

    public void setRppermissions(List<Rppermission> rppermissions) {
        this.rppermissions = rppermissions;
    }

    public List<Rpuser> getRpusers() {
        return rpusers;
    }

    public void setRpusers(List<Rpuser> rpusers) {
        this.rpusers = rpusers;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal rpRoleId) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolestatus() {
        return rolestatus;
    }

    public void setRolestatus(String rolestatus) {
        this.rolestatus = rolestatus == null ? null : rolestatus.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public String getRoleremark() {
        return roleremark;
    }

    public void setRoleremark(String roleremark) {
        this.roleremark = roleremark == null ? null : roleremark.trim();
    }
}