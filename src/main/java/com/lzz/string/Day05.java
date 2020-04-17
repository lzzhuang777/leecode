package com.lzz.string;

import java.util.Arrays;
public class Day05 {


    /**
     * 有效的字母异位词
     *
     */
    static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }


    public static void main(String[] args) {

        String s = "zzlhuangh";
        String t = "lzzhuangk";
        long start_time = System.currentTimeMillis();
        isAnagram(s,t);
        System.out.println(+(System.currentTimeMillis()-start_time)/1000+"ms");

    }
}
