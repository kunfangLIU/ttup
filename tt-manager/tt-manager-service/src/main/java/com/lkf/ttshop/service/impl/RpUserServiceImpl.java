package com.lkf.ttshop.service.impl;

import com.dhc.ttshop.pojo.po.TbItemExample;
import com.lkf.ttshop.dao.RpuserCustomMapper;
import com.lkf.ttshop.dao.RpuserMapper;
import com.lkf.ttshop.dto.Order;
import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rpuser;
import com.lkf.ttshop.pojo.vo.RpUserCustom;
import com.lkf.ttshop.pojo.vo.RpUserQuery;
import com.lkf.ttshop.service.RpUserService;
import com.lkf.ttshop.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
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

    @Override
    public int removeUserByIds( String b,List<Long> ids) {
        //创建商品的空对象
        Rpuser user = new Rpuser();
        user.setDeleted(b);
        //下面的三行只是准备查询的条件
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        //真正的执行查询
        return rpuserDao.updateByExampleSelective(user, example);
    }
    //@Transactional注解后表示这是一个事务方法，事务方法不是越多越好，平常使用查询方法不需要添加此注解
    @Transactional
    @Override
    public int saveUser(Rpuser rpuser) {
        //通过工具类获取到商品ID
        BigDecimal userId = BigDecimal.valueOf(IDUtils.getItemId());
        //tbItem传进来时已经携带了6个属性
        rpuser.setId(userId);
        //存商品
        int count = rpuserDao.insert(rpuser);
     /*   //存商品描述表（商品的ID保持一致）
        TbItemDesc tbItemDesc = new TbItemDesc();
        tbItemDesc.setItemId(itemId);
        tbItemDesc.setItemDesc(desc);
        tbItemDesc.setCreated(new Date());
        tbItemDesc.setUpdated(new Date());
        count += itemDescDao.insert(tbItemDesc);*/
        return count;
    }
}
