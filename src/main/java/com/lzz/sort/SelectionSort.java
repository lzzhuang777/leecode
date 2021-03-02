package com.lzz.sort;

import java.util.stream.Stream;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/12/22 11:51
 */
public class SelectionSort {

   public static Integer[] selectionSort(Integer[] nums){
       int k ;
       for (int i =0;i<nums.length-1;i++){
           for (int j =i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    k = nums[i];
                    nums[i] = nums[j];
                    nums[j] = k;
                }
           }
       }

       return nums;
   }
    //选择排序
    public static void main(String[] args) {
        Integer[] nums = {5,8,12,96,8,5,68,6};
        selectionSort(nums);
        Stream.of(nums).forEach(System.out::println);
    }
}
