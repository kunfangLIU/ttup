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
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /**
     * 删除部门集合控制层
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/depts/batch" ,method = RequestMethod.POST)
    public int removeDeptIds(@RequestParam("ids[]")List<Long> ids){
        return rpDeptService.removeDeptIds((String)"1", ids);
    }

    /**
     * 添加部门信息控制层
     * @param rpdept
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/dept",method = RequestMethod.POST)
    public int saveDept(Rpdept rpdept){
        return  rpDeptService.saveDept(rpdept);
    }
}
