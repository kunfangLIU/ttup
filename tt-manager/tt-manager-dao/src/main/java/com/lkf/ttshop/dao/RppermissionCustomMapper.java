package com.lkf.ttshop.dao;

import com.lkf.ttshop.pojo.vo.RpPermissionCustom;

import java.util.List;
import java.util.Map;

public interface RppermissionCustomMapper {
    /**
     * 查询总记录数
     * @param map
     * @return
     */
   long countPermission(Map<String,Object> map);

    /**
     * 分页查询权限集合
     * @param map
     * @return
     */
   List<RpPermissionCustom> listByPermissionByPage(Map<String,Object> map);
}