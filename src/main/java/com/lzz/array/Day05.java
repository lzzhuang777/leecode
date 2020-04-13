package com.lzz.array;

import java.util.LinkedList;
import java.util.List;

public class Day05 {


    /**
        只出现一次的数字
     */
    public static int singleNumber(int[] nums) {

        for(int i =0; i<nums.length;i++){
            int count = 0;
            for(int j =0;j<nums.length;j++){
                if(j!=i&&nums[i] == nums[j]){
                    count++;
                }
            }
            if(count==0){
                return nums[i];
            }
        }
        return 0;
    }
    //最优解法
    public static int singleNumber1(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            } else {
                list.remove((Object)num);
            }
        }
        return list.get(0);
    }


    public static void main(String[] args) {
        int[] nums = {4,1,2,2,1};
        System.out.println(singleNumber1(nums));
    }
}
