package com.lzz.array;

public class Day03 {

    /**
     *  旋转数组
     */

    static int[] test(int[] nums, int k){

        k = k % nums.length;
        remote(nums,0,nums.length-1);
        remote(nums,0,k-1);
        remote(nums,k,nums.length-1);
        return nums;
    }
    static int[] remote(int[] nums,int start,int end){

        while (start<end){
         int p = nums[start];
         nums[start] = nums[end];
         nums[end] = p;
         start++;
         end--;
        }
        return nums;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        test(nums,3);
    }
}
