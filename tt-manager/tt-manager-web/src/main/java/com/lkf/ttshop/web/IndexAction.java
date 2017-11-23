package com.lkf.ttshop.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: CTKJ-0106
 * Date: 2017/11/23
 * Time: 9:39
 * Version:V1.0
 */
@Controller
@Scope("prototype")
public class IndexAction {
    @RequestMapping("/")
    public String Index(){
        return "index";
    }
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){

        return page;
    }
}
