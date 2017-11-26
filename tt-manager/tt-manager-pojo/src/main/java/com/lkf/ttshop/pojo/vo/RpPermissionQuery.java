package com.lkf.ttshop.pojo.vo;

/**
 * User: CTKJ-0106
 * Date: 2017/11/26
 * Time: 16:00
 * Version:V1.0
 */
public class RpPermissionQuery {
    private String permissionname;

    private Long permissionlevel;

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public Long getPermissionlevel() {
        return permissionlevel;
    }

    public void setPermissionlevel(Long permissionlevel) {
        this.permissionlevel = permissionlevel;
    }
}
