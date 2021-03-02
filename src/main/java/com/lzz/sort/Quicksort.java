package com.lzz.sort;

import java.util.stream.Stream;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/12/22 14:06
 */
public class Quicksort {

    //快速排序
    public static void quicksort(Integer[] nums,int l,int len){
        if(l>len){
            return ;
        }
        int i = l; int j = len; int key = nums[l];
        while (i<j){
            while (i<j && nums[j] >= key) {
                j--;
            }
            if(i<j){
                nums[i] = nums[j];
                i++;
            }
            while(i<j && nums[i]<key) {//从左向右找第一个大于key的值
                i++;
            }
            if(i<j){
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i] = key;
        quicksort(nums, l, i-1);//递归调用
        quicksort(nums, i+1, len);//递归调用
    }

    public static void main(String[] args) {
        Integer[] nums = {5,8,12,96,8,5,68,6};
        quicksort(nums,0,nums.length-1);
        Stream.of(nums).forEach(System.out::println);
    }
}
