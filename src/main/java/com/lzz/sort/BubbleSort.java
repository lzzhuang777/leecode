package com.lzz.sort;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/12/22 11:20
 */
public class BubbleSort {

    //冒泡排序
    public static Integer[] bubbleSort(Integer[] nums){
        for (int i =0;i<nums.length-1;i++){
            boolean flag = true;
            for (int j = 0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int k = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = k;
                    flag = false;
                }
            }
            if(flag){
                System.out.println(i);
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Integer[] nums = {5,8,12,96,8,5,68,6};
        bubbleSort(nums);
        Stream.of(nums).forEach(System.out::println);
    }
}
