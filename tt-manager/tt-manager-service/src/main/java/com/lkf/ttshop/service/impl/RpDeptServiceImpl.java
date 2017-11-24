package com.lkf.ttshop.service.impl;

import com.lkf.ttshop.dao.RpdeptCustomMapper;
import com.lkf.ttshop.dao.RpdeptMapper;
import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rpdept;
import com.lkf.ttshop.pojo.vo.RpDeptCustom;
import com.lkf.ttshop.pojo.vo.RpDeptQuery;
import com.lkf.ttshop.service.RpDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: CTKJ-0106
 * Date: 2017/11/24
 * Time: 17:10
 * Version:V1.0
 */
@Service
public class RpDeptServiceImpl implements RpDeptService {
    @Autowired
    RpdeptMapper rpdeptDao;
    @Autowired
    RpdeptCustomMapper rpdeptCustomDao;
    @Override
    public Rpdept getByDeptId(String rpDeptId) {
        return rpdeptDao.selectByPrimaryKey(rpDeptId);
    }

    @Override
    public Result<RpDeptCustom> listDepts(Page page, RpDeptQuery query) {
        Map<String ,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("query",query);
        long total = rpdeptCustomDao.couontDepts(map);
        List<RpDeptCustom> rows = rpdeptCustomDao.listDeptByPage(map);
        Result<RpDeptCustom> rs = new Result<>();
        rs.setTotal(total);
        rs.setRows(rows);
        return rs;
    }
}
