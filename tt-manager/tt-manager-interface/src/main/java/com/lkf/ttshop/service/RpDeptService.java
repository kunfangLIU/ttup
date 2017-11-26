package com.lkf.ttshop.service;

import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rpdept;
import com.lkf.ttshop.pojo.vo.RpDeptCustom;
import com.lkf.ttshop.pojo.vo.RpDeptQuery;

import java.util.List;

/**
 * User: CTKJ-0106
 * Date: 2017/11/24
 * Time: 17:06
 * Version:V1.0
 */
public interface RpDeptService {
    /**
     * 按id查询部门集合
     * @param rpDeptId
     * @return
     */
    Rpdept getByDeptId(String rpDeptId);

    /**
     * 分页查询出部门集合
     * @param page
     * @param query
     * @return
     */
    Result<RpDeptCustom> listDepts(Page page, RpDeptQuery query);

    /**
     * 批量删除部门
     * @param b
     * @param ids
     * @return
     */
    int removeDeptIds(String b , List<Long> ids);

    /**
     * 添加部门资料
     * @param rpdept
     * @return
     */
    int saveDept(Rpdept rpdept);
}
