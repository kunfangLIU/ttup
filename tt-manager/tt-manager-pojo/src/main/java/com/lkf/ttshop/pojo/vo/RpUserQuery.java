package com.lkf.ttshop.pojo.vo;

/**
 * User: CTKJ-0106
 * Date: 2017/11/23
 * Time: 10:07
 * Version:V1.0
 */
public class RpUserQuery {
    private String username;
    private String useraccount;
    private String mobile;
    private String userstatus;

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
