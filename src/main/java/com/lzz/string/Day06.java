package com.lzz.string;

import java.util.Date;

public class Day06 {

    public static void main(String[] args) {


        String[] keys = {"lzz","djh","wj","xc","ls","zh"};
        for (String key : keys) {
            int h,i;
            i = (16-1) &(h = key.hashCode()) ^ (h >>> 16);
            System.out.println( i);
        }
    }
}
