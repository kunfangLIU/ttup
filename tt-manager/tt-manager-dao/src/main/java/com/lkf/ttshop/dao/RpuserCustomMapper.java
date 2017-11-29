package com.lkf.ttshop.dao;

import com.lkf.ttshop.pojo.po.Rpuser;
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

    /**
     * 修改用户信息dao层接口
     * @param rpuser
     */
    void updateUser(Rpuser rpuser);

    /**
     * 按名字查询获得登录信息
     * @param rpuser
     * @return
     */
    Rpuser  selectByUserName(Rpuser rpuser);

}