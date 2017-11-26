package com.lkf.ttshop.web;

import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rppermission;
import com.lkf.ttshop.pojo.vo.RpPermissionCustom;
import com.lkf.ttshop.pojo.vo.RpPermissionQuery;
import com.lkf.ttshop.service.RpPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: CTKJ-0106
 * Date: 2017/11/26
 * Time: 16:28
 * Version:V1.0
 * 权限管理控制层
 */
@Controller
@Scope("prototype")
public class RpPermissionAction {
    @Autowired
    RpPermissionService rpPermissionService;
    @RequestMapping(value = "/rpPermission/{rpPermissionId}",method = RequestMethod.GET)
    public Rppermission getByPermissionId(@PathVariable String rpPermissionId){
        return rpPermissionService.getByPermissionId(rpPermissionId);
    }
    @ResponseBody
    @RequestMapping("/rpPermission")
    public Result<RpPermissionCustom> listByPermissionPage(RpPermissionQuery query, Page page){
        return  rpPermissionService.listByPermissionPage(query,page);
    }
}
