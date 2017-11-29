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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

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
    /**
     * 更改删除状态
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/users/batch",method = RequestMethod.POST)
    public int removeUserByIds(@RequestParam("ids[]") List<Long> ids){
        return rpUserService.removeUserByIds((String)"1",ids);
    }
    /**
     * 保存新商品
     * @param rpuser 为了对应除商品描述以外其他字段
     * @return 受到影响的行数
     */
    @ResponseBody
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public int saveUser(Rpuser rpuser ){
        return rpUserService.saveUser(rpuser);
    }
    @ResponseBody
    @RequestMapping("/user/edit")
    public ModelAndView modifyRpUser(@PathVariable  Rpuser rpuser, Model model){
        ModelAndView modelAndView = new ModelAndView();

        Rpuser findUserId = rpUserService.modifyRpUser(rpuser);
       /* model.addAttribute("rpuser",findUserId);*/
        modelAndView.addObject("rpuser",findUserId);
        modelAndView.setViewName("user-edit");
       return modelAndView;
    }
    @ResponseBody
    @RequestMapping("/login")
    public String doLogin(Rpuser rpUserInfo, HttpSession session,String username,String password){
        return  rpUserService.checkUser(rpUserInfo,session);
    }
    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}

