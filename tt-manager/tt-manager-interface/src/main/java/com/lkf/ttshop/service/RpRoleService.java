package com.lkf.ttshop.service;

import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rprole;
import com.lkf.ttshop.pojo.vo.RpRoleCustom;
import com.lkf.ttshop.pojo.vo.RpRoleQuery;

import java.util.List;

/**
 * User: CTKJ-0106
 * Date: 2017/11/27
 * Time: 11:17
 * Version:V1.0
 * 角色管理业务逻辑层接口
 */
public interface RpRoleService {
    /**
     * 按id查询
     * @param rpRoleId
     * @return
     */
    Rprole getByRoleId(String rpRoleId);

    /**
     * 分页查询
     * @param page
     * @param query
     * @return角色信息结果
     */
    Result<RpRoleCustom> listRoles(Page page, RpRoleQuery query);

    /**
     * 改变是否删除值来实现批量删除操作
     * @param b
     * @param ids
     * @return
     */
    int removeRoles(String b, List<Long> ids);

    /**
     * 添加角色信息集合
     * @param rprole
     * @return
     */
    int saveRole(Rprole rprole);

}
