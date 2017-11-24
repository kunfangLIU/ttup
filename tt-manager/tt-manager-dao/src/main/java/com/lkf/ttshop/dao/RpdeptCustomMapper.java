package com.lkf.ttshop.dao;

import com.lkf.ttshop.pojo.vo.RpDeptCustom;

import java.util.List;
import java.util.Map;

public interface RpdeptCustomMapper {
    /**
     * 查询总记录数
     * @param map
     * @return
     */
    long couontDepts(Map<String ,Object> map);

    /**
     * 分页查询用户集合
     * @param map
     * @return
     */
    List<RpDeptCustom> listDeptByPage(Map<String ,Object> map);
}