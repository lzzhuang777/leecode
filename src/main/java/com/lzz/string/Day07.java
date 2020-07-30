package com.lzz.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/6/28 16:32
 */
public class Day07 {

    public static void main(String[] args) {

       String s = "来电\r\n互联网";
       String[] strings = s.split("\r\n");
        System.out.println(strings[1]+"--------------"+strings[0]);
    }
}
