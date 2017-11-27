package com.lkf.ttshop.web;

import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rprole;
import com.lkf.ttshop.pojo.vo.RpRoleCustom;
import com.lkf.ttshop.pojo.vo.RpRoleQuery;
import com.lkf.ttshop.service.RpRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: CTKJ-0106
 * Date: 2017/11/27
 * Time: 11:27
 * Version:V1.0
 * 角色信息控制层
 */
@Controller
@Scope("prototype")
public class RpRoleAction {
    @Autowired
    RpRoleService rpRoleService;

    /**
     * 按id查询
     * @param rpRoleId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/rpRole/{rpRoleId}",method = RequestMethod.GET)
    public Rprole getByRoleId(@PathVariable String rpRoleId){
        return  rpRoleService.getByRoleId(rpRoleId);
    }

    /**
     * 分页查询出角色信息集合
     * @param page
     * @param query
     * @return
     */
    @ResponseBody
    @RequestMapping("/rpRoles")
    public Result<RpRoleCustom> listRoles(Page page, RpRoleQuery query){
       return rpRoleService.listRoles(page,query);
    }
}
