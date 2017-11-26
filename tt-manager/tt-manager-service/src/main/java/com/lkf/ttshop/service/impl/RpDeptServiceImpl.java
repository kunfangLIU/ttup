package com.lkf.ttshop.service.impl;

import com.lkf.ttshop.dao.RpdeptCustomMapper;
import com.lkf.ttshop.dao.RpdeptMapper;
import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rpdept;
import com.lkf.ttshop.pojo.po.RpdeptExample;
import com.lkf.ttshop.pojo.vo.RpDeptCustom;
import com.lkf.ttshop.pojo.vo.RpDeptQuery;
import com.lkf.ttshop.service.RpDeptService;
import com.lkf.ttshop.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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

    /**
     * 通过改变是否删除状态来达到删除部门集合的效果，实际只是改变了状态deleted为1时隐藏，为0时显示
     * @param b
     * @param ids
     * @return
     */
    @Override
    public int removeDeptIds(String b, List<Long> ids) {
        Rpdept rpdept = new Rpdept();
        rpdept.setDeleted(b);
        //创建模板
        RpdeptExample example = new RpdeptExample();
        RpdeptExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        //执行查询
        return  rpdeptDao.updateByExampleSelective(rpdept,example);
    }

    /**
     * 添加部门集合
     * @param rpdept
     * @return
     */
    @Override
    public int saveDept(Rpdept rpdept) {
        //通过工具类获取部门id
        BigDecimal deptId = BigDecimal.valueOf(IDUtils.getItemId());
        rpdept.setId(deptId);
        //影响记录的条数
        int count = rpdeptDao.insert(rpdept);
        return count;
    }
}
