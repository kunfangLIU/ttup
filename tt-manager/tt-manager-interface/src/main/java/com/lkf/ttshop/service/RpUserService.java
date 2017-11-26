package com.lkf.ttshop.service;

import com.lkf.ttshop.dto.Order;
import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rpuser;
import com.lkf.ttshop.pojo.vo.RpUserCustom;
import com.lkf.ttshop.pojo.vo.RpUserQuery;

import java.util.List;

/**
 * User: CTKJ-0106
 * Date: 2017/11/23
 * Time: 10:03
 * Version:V1.0
 */
public interface RpUserService {
    /**
     * 按id查询
     * @param rpUserId
     * @return
     */
    Rpuser getByUserId(String rpUserId);

    /**
     * 分页查询出用户集合
     * @param page
     * @param query
     * @return
     */
    Result<RpUserCustom> listUsers(Page page, RpUserQuery query, Order order);
    /**
     * 通过是否删除批量修改用户的状态
     * @param ids
     * @return
     */
    int removeUserByIds(String b,List<Long> ids);
    /**
     * 保存用户集合
     * @param rpuser
     * @return
     */
    int saveUser(Rpuser rpuser );
}
