package com.lzz.easy.tree;

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
        return helper(root,null,null);
    }

    public static boolean helper(TreeNode root,Integer lower,Integer upper){

        if(root==null){
            return true;
        }
        int val = root.val;
        if(lower!=null && lower>=val){
            return false;
        }
        if(upper!=null && upper<=val){
            return false;
        }
        if(!helper(root.left,lower,val)){
            return false;
        }
        if(!helper(root.right,val,upper)){
            return false;
        }
        return true;
    }
    //syncNwfTaskTo3rdApp (第三方通知任务)
    //isForeActInstsAllCompleted（判断活动实例是否都已完成）IsAssistantAgent（检查是否为代理用户）
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
