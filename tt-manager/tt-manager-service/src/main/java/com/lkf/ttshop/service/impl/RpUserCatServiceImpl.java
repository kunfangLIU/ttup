package com.lkf.ttshop.service.impl;

import com.lkf.ttshop.dao.RpdeptMapper;
import com.lkf.ttshop.pojo.po.Rpdept;
import com.lkf.ttshop.pojo.po.RpdeptExample;
import com.lkf.ttshop.service.UserCatService;
import com.lkf.ttshop.utils.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: CTKJ-0106
 * Date: 2017/11/23
 * Time: 21:53
 * Version:V1.0
 */
@Service
public class RpUserCatServiceImpl implements UserCatService{
    @Autowired
    private RpdeptMapper rpdeptDao;
    @Override
    public List<TreeNode> listUserCats(Long parentId) {
        //1 创建查询模板
        RpdeptExample example = new RpdeptExample();
        RpdeptExample.Criteria criteria1 = example.createCriteria();
        criteria1.andParentidEqualTo(parentId);
        //2 执行查询
        List<Rpdept> userCatList = rpdeptDao.selectByExample(example);
        List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
        //3 组合成新的List<TreeNode>
        for (int i=0;i<userCatList.size();i++){
            TreeNode treeNode = new TreeNode();
            treeNode.setId(userCatList.get(i).getId());
            treeNode.setText(userCatList.get(i).getDeptname());
            treeNode.setState(userCatList.get(i).getDeptlevel()?"open" : "closed");
            treeNodeList.add(treeNode);
        }
        //4 返回
        return treeNodeList;
    }
}
