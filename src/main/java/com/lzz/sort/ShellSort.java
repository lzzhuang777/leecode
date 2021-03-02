package com.lzz.sort;

import java.util.stream.Stream;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/12/22 13:27
 */
public class ShellSort {

    //希尔排序
    public static Integer[] shellSort(Integer[] nums){


        return nums;
    }

    public static void main(String[] args) {
        Integer[] nums = {5,8,12,96,8,5,68,6};
        shellSort(nums);
        Stream.of(nums).forEach(System.out::println);
    }
}
