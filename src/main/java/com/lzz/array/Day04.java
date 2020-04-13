package com.lzz.array;

import java.util.HashMap;

public class Day04 {

    /**
     * 存在重复元素，返回true，否则返回false
     */
    static boolean  Duplicates(int[] nums){

        boolean flag = false;
        for(int i =0; i<nums.length-1;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    flag =true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return flag;
    }

    static boolean DuplicatesArray(int[] nums){

        HashMap map = new HashMap();
        for(int num : nums){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num,null);
        }
        return false;
    }


    public static void main(String[] args) {
        int [] nums = {1,2,5,8,7,1};
        System.out.println(DuplicatesArray(nums));
    }
}
