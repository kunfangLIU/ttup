package com.lkf.ttshop.dao;

import com.lkf.ttshop.pojo.vo.RpUserCustom;

import java.util.List;
import java.util.Map;

public interface RpuserCustomMapper {
    /**
     * 查询总记录数
     * @param map
     * @return
     */
   long couontUsers(Map<String ,Object> map);

    /**
     * 分页查询用户集合
     * @param map
     * @return
     */
   List<RpUserCustom> listUserByPage(Map<String ,Object> map);

}