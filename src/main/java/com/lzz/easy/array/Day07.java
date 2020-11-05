package com.lzz.easy.array;

import java.util.ArrayList;
import java.util.List;

public class Day07 {

    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     *
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     *
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     */
    public static int[] plusOne(int[] digits) {
        int i = digits.length-1;
        digits[digits.length-1]++;
        while (digits[i]==10){
            digits[i] =0;
            if(i==0){
                List<Integer> list = new ArrayList();
                list.add(1);
                for(int num : digits){
                    list.add(num);
                }
                return list.stream().mapToInt(Integer::valueOf).toArray();
            }
            digits[i-1]++;
            i--;
        }
        return digits;
    }

    public static void main(String[] args) {

        int[] nums = {9};
        System.out.println(plusOne(nums)[0]);

    }



}
