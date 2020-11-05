package com.lzz.easy.tree;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/11/5 15:26
 */
public class Day05 {

    /**
     * 验证对称二叉树
     */

    public boolean isSymmetric(TreeNode root) {

        return check(root,root);

    }
    public boolean check(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right == null){
            return false;
        }
        return left.val == right.val && check(left.left,right.right) && check(right.left,left.right);
    }
}
