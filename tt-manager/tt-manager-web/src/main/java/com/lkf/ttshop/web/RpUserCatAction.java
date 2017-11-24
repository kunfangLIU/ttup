package com.lkf.ttshop.web;

import com.lkf.ttshop.service.UserCatService;
import com.lkf.ttshop.utils.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: CTKJ-0106
 * Date: 2017/11/24
 * Time: 9:28
 * Version:V1.0
 */
@Controller
@Scope("prototype")
public class RpUserCatAction {
    @Autowired
    private UserCatService userCatService;

    @RequestMapping(value = "/userCats", method = RequestMethod.POST)
    @ResponseBody
    public List<TreeNode> listUserCats(@RequestParam("parentId") Long parentId) {
        return userCatService.listUserCats(parentId);
    }
}
