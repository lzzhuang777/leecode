package com.lzz.easy.tree;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/11/5 15:33
 */
public class Day06 {

    /**
     * 升序数组转平衡二叉树
     */

    public TreeNode sortedArrayToBST(int[] nums) {

        return helper(nums,0,nums.length-1);
    }

    public TreeNode helper(int[] nums ,int left,int right){

        if(left>right){
            return null;
        }
        int mid = left + right/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,left,mid-1);
        node.right = helper(nums,mid+1,right);
        return node;
    }

}
