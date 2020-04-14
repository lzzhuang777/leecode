package com.lzz.array;

public class Day08 {

    /**
     * 移动零
     */

    static int[] moveZero(int[] nums){

        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        while (index<nums.length){
            nums[index++] = 0;
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {1,0,3,0,0,12,0,6,8};
        moveZero(nums);
       for(int num :nums){
           System.out.println(num);
       }
    }
}
