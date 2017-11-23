package com.lkf.ttshop.service.impl;

import com.lkf.ttshop.dao.RpuserCustomMapper;
import com.lkf.ttshop.dao.RpuserMapper;
import com.lkf.ttshop.dto.Order;
import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rpuser;
import com.lkf.ttshop.pojo.vo.RpUserCustom;
import com.lkf.ttshop.pojo.vo.RpUserQuery;
import com.lkf.ttshop.service.RpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: CTKJ-0106
 * Date: 2017/11/23
 * Time: 10:09
 * Version:V1.0
 */
@Service
public class RpUserServiceImpl implements RpUserService{
    @Autowired
    private RpuserMapper rpuserDao;
    @Autowired
    private RpuserCustomMapper rpuserCustomDao;
    @Override
    public Rpuser getByUserId(String rpUserId) {
        return rpuserDao.selectByPrimaryKey(rpUserId);
    }

    @Override
    public Result<RpUserCustom> listUsers(Page page, RpUserQuery query, Order order) {
        Map<String ,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("query",query);
        map.put("order",order);
        long total = rpuserCustomDao.couontUsers(map);
        List<RpUserCustom> rows = rpuserCustomDao.listUserByPage(map);
        Result<RpUserCustom> rs = new Result<>();
        rs.setRows(rows);
        rs.setTotal(total);
        return rs;
    }
}
