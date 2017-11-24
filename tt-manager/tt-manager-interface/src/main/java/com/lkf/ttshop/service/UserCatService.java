package com.lkf.ttshop.service;

import com.lkf.ttshop.utils.TreeNode;

import java.util.List;

/**
 * User: CTKJ-0106
 * Date: 2017/11/23
 * Time: 21:52
 * Version:V1.0
 */
public interface UserCatService {
    List<TreeNode> listUserCats(Long parentId);
}
