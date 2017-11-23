package com.lkf.ttshop.web;

import com.lkf.ttshop.dto.Order;
import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rpuser;
import com.lkf.ttshop.pojo.vo.RpUserCustom;
import com.lkf.ttshop.pojo.vo.RpUserQuery;
import com.lkf.ttshop.service.RpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: CTKJ-0106
 * Date: 2017/11/23
 * Time: 10:18
 * Version:V1.0
 */
@Controller
@Scope("prototype")
public class RpUserAction {
    @Autowired
    RpUserService rpUserService;

    @ResponseBody
    @RequestMapping(value = "/rpUser/{rpUserId}", method = RequestMethod.GET)
    public Rpuser getByUserId(@PathVariable String rpUserId) {
        return rpUserService.getByUserId(rpUserId);
    }
    @ResponseBody
    @RequestMapping("/rpUsers")
    public Result<RpUserCustom> listRpUsers(Page page, Order order,RpUserQuery query){
        return rpUserService.listUsers(page,query,order);
    }
}

