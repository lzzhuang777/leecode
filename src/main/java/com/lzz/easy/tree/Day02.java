package com.lzz.easy.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/11/3 10:05
 */
public class Day02 {

    /**
     * 二叉树的前序遍历
     * @param root
     * @return
     */

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }

    public void preorder(TreeNode root,List<Integer> list){

        if (root != null) {
            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);
        }
    }

}
