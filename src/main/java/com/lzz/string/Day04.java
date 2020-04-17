package com.lzz.string;

public class Day04 {


    /**
     * 字符串翻转
     * @param strs
     */
    static void  reverseString (char[] strs){
        int end = strs.length-1;
        int start = 0;
        while (start<end){
            char p = strs[start];
            strs[start] = strs [end];
            strs[end] = p;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        char[] strs = {'h','e','l','l','o'};
        reverseString(strs);
    }
}
