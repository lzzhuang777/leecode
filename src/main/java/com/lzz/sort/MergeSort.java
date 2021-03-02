package com.lzz.sort;

import java.util.stream.Stream;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/12/22 14:39
 */
public class MergeSort {

    //归并排序
    public static void mergeSort(Integer[] nums){

    }

    public static void main(String[] args) {
        Integer[] nums = {5,8,12,96,8,5,68,6};
        mergeSort(nums);
        Stream.of(nums).forEach(System.out::println);
    }
}
