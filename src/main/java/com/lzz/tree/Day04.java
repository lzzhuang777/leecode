package com.lzz.tree;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/11/3 15:21
 */
public class Day04 {
    /**
     * 验证二叉搜索树
     */

    public static boolean isValidBST(TreeNode root){
        boolean left = true;
        boolean right = true;
        if(root!=null) {
            if(root.left!=null){
                if(root.left.val >= root.val){
                    return false;
                }
                left = isValidBST(root.left);
            }
            if (root.right!=null) {
                if (root.right.val <= root.val) {
                    return false;
                }
                right = isValidBST(root.right);
            }
        }
        if(!left){
            return false;
        } else if(!right){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(15);
        right.left = new TreeNode(6);
        right.right = new TreeNode(20);
        TreeNode root = new TreeNode(10);
        root.left = left;
        root.right = right;
        System.out.println(isValidBST(root));
    }

}
