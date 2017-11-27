package com.lkf.ttshop.dao;

import com.lkf.ttshop.pojo.vo.RpRoleCustom;

import java.util.List;
import java.util.Map;

public interface RproleCustomMapper {
    /**
     * 查询出集合的总记录数
     * @param map
     * @return
     */
    long countRoles(Map<String,Object> map);

    /**
     * 分页查询角色集合
     * @param map
     * @return
     */
    List<RpRoleCustom> listRoleByPage(Map<String,Object> map);
}