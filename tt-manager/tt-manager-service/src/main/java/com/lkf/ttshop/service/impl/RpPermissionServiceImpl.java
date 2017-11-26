package com.lkf.ttshop.service.impl;

import com.lkf.ttshop.dao.RppermissionCustomMapper;
import com.lkf.ttshop.dao.RppermissionMapper;
import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rppermission;
import com.lkf.ttshop.pojo.vo.RpPermissionCustom;
import com.lkf.ttshop.pojo.vo.RpPermissionQuery;
import com.lkf.ttshop.service.RpPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: CTKJ-0106
 * Date: 2017/11/26
 * Time: 16:20
 * Version:V1.0
 * 权限集合业务逻辑层实现类
 */
@Service
public class RpPermissionServiceImpl implements RpPermissionService {
    @Autowired
    RppermissionMapper rppermissionDao;
    @Autowired
    RppermissionCustomMapper rppermissionCustomDao;

    /**
     * 按id查询权限集合
     * @param rpPermissionId
     * @return
     */
    @Override
    public Rppermission getByPermissionId(String rpPermissionId) {
        return rppermissionDao.selectByPrimaryKey(rpPermissionId);
    }

    /**
     * 分页查询出权限集合
     * @param query
     * @param page
     * @return
     */
    @Override
    public Result<RpPermissionCustom> listByPermissionPage(RpPermissionQuery query, Page page) {
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("query",query);
        long total = rppermissionCustomDao.countPermission(map);
        List<RpPermissionCustom> rows = rppermissionCustomDao.listByPermissionByPage(map);
        Result<RpPermissionCustom> rs = new Result<>();
        rs.setRows(rows);
        rs.setTotal(total);
        return rs;
    }
}
