package com.lkf.ttshop.web;

import com.lkf.ttshop.dto.Page;
import com.lkf.ttshop.dto.Result;
import com.lkf.ttshop.pojo.po.Rpdept;
import com.lkf.ttshop.pojo.vo.RpDeptCustom;
import com.lkf.ttshop.pojo.vo.RpDeptQuery;
import com.lkf.ttshop.service.RpDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: CTKJ-0106
 * Date: 2017/11/24
 * Time: 17:16
 * Version:V1.0
 */
@Controller
@Scope("prototype")
public class RpDeptAction {
    @Autowired
    RpDeptService rpDeptService;
    @ResponseBody
    @RequestMapping(value = "/rpDept/{rpDeptId}" ,method = RequestMethod.GET)
    public Rpdept getByDeptId(@PathVariable  String rpDeptId){
        return  rpDeptService.getByDeptId(rpDeptId);
    }
    @ResponseBody
    @RequestMapping("/rpDept")
    public Result<RpDeptCustom> listDepts(Page page , RpDeptQuery query){
        return  rpDeptService.listDepts(page,query);
    }
}
