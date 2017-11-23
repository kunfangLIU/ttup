package com.lkf.ttshop.pojo.vo;

import com.lkf.ttshop.pojo.po.Rpuser;

/**
 * User: CTKJ-0106
 * Date: 2017/11/23
 * Time: 9:53
 * Version:V1.0
 * 用户对应页面的实体类
 */
public class RpUserCustom extends Rpuser{
    private String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
