package com.lzz.array;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/11/2 15:54
 */
public class Day10 {

    /**
     * 买卖股票的最佳时期，只允许买卖一次
     */
    public static int buyStock(int[] nums){

        int minNum = nums[0];
        int monney = 0;
        for (int i =1;i<nums.length;i++){

            if(nums[i]<minNum){
                minNum = nums[i];
            }else if(monney< nums[i] - minNum) {
                monney = nums[i] - minNum;
            }
        }
        return monney;
    }


    public static void main(String[] args) {

        int[] nums = {2,5,8,3,1};
        int monney = buyStock(nums);
        System.out.println(monney);
    }
}
