package com.lzz.string;

public class Day03 {

    /**
     * 回文字符串
     * @param s
     * @return
     */

    static boolean checkHW(String s){
        s = s.replaceAll("[\\p{Punct}\\p{Space}]+", "");
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while(start<end){

            if( chars[start]!=chars[end]){
               return false ;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        System.out.println(checkHW(s));

    }
}
