package com.lzz.easy.string;

import java.util.*;

public class Day01 {

    //字符串中的第一个唯一字符
    static int checkString(String s){

        char[] chars = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap();
        for(int i =0; i<chars.length;i++ ){
           map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
        for(int i =0; i<chars.length;i++ ) {
            if(map.get(chars[i])==1){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(checkString(s));
    }
}
