package com.lkf.ttshop.pojo.po;

import java.math.BigDecimal;

public class Rppermission {
    private BigDecimal id;

    private String permissionname;

    private String url;

    private Long permissionlevel;

    private BigDecimal parentid;

    private String type;

    private String icon;

    private String deleted;

    private Short ordernum;

    private String permissionremark;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getPermissionlevel() {
        return permissionlevel;
    }

    public void setPermissionlevel(Long permissionlevel) {
        this.permissionlevel = permissionlevel;
    }

    public BigDecimal getParentid() {
        return parentid;
    }

    public void setParentid(BigDecimal parentid) {
        this.parentid = parentid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public Short getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Short ordernum) {
        this.ordernum = ordernum;
    }

    public String getPermissionremark() {
        return permissionremark;
    }

    public void setPermissionremark(String permissionremark) {
        this.permissionremark = permissionremark == null ? null : permissionremark.trim();
    }
}