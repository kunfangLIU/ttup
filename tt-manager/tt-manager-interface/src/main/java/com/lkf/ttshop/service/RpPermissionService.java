package com.lkf.ttshop.service;

import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rppermission;
import com.lkf.ttshop.pojo.vo.RpPermissionCustom;
import com.lkf.ttshop.pojo.vo.RpPermissionQuery;

/**
 * User: CTKJ-0106
 * Date: 2017/11/26
 * Time: 16:17
 * Version:V1.0
 */
public interface RpPermissionService {
    /**
     * 按id查询权限信息
     * @param rpPermissionId
     * @return
     */
    Rppermission getByPermissionId(String rpPermissionId);

    /**
     * 分页查询权限集合
     * @param query
     * @param page
     * @return
     */
    Result<RpPermissionCustom> listByPermissionPage(RpPermissionQuery query, Page page);
}
