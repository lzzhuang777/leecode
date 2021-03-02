package com.lzz.sort;

import java.util.stream.Stream;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/12/22 13:05
 */
public class InsertSort {

    public static Integer[] insertSort(Integer[] nums){
        int k;
        for(int i =0;i<nums.length-1;i++){
            for (int j = i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    k = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = k;
                }else{
                    break;
                }
            }
        }
        return nums;
    }

    //插入排序
    public static void main(String[] args) {
        Integer[] nums = {5,8,12,96,8,5,68,6};
        insertSort(nums);
        Stream.of(nums).forEach(System.out::println);
    }
}
