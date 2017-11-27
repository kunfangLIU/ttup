package com.lkf.ttshop.service.impl;

import com.lkf.ttshop.dao.RproleCustomMapper;
import com.lkf.ttshop.dao.RproleMapper;
import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rprole;
import com.lkf.ttshop.pojo.po.RproleExample;
import com.lkf.ttshop.pojo.vo.RpRoleCustom;
import com.lkf.ttshop.pojo.vo.RpRoleQuery;
import com.lkf.ttshop.service.RpRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: CTKJ-0106
 * Date: 2017/11/27
 * Time: 11:21
 * Version:V1.0
 * 角色信息业务逻辑层实现类
 */
@Service
public class RpRoleServiceImpl implements RpRoleService {
    @Autowired
    RproleMapper rproleDao;
    @Autowired
    RproleCustomMapper rproleCustomDao;

    /**
     * 按id查询
     * @param rpRoleId
     * @return
     */
    @Override
    public Rprole getByRoleId(String rpRoleId) {
        return rproleDao.selectByPrimaryKey(rpRoleId);
    }

    /**
     * 分页查询角色结果业务逻辑层实现类
     * @param page
     * @param query
     * @return
     */
    @Override
    public Result<RpRoleCustom> listRoles(Page page, RpRoleQuery query) {
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("query",query);
        long total = rproleCustomDao.countRoles(map);
        List<RpRoleCustom> rows = rproleCustomDao.listRoleByPage(map);
        Result<RpRoleCustom> rs = new Result<>();
        rs.setRows(rows);
        rs.setTotal(total);
        return rs;
    }

    @Override
    public int removeRoles(String b, List<Long> ids) {
        Rprole rprole = new Rprole();
        rprole.setDeleted(b);
        RproleExample example = new RproleExample();
        RproleExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return rproleDao.updateByExampleSelective(rprole,example);
    }
}
