package com.lzz.easy.string;


/**
 * @author lzz
 * @version 1.0
 * @date 2020/6/28 16:32
 */
public class Day07 {

    /**
     * 输入：n = 4
     * 输出："1211"
     * 解释：
     * countAndSay(1) = "1"
     * countAndSay(2) = 读 "1" = 一 个 1 = "11"
     * countAndSay(3) = 读 "11" = 二 个 1 = "21"
     * countAndSay(4) = 读 "21" = 一 个 2 + 一 个 1 = "12" + "11" = "1211"
     *
     */

    public static String countAndSay(int n) {

        String s = "3";
        for(int i = 1;i < n;i++){
            StringBuilder str = new StringBuilder();
            for (int j =0;j<s.length();j++){
                int count = 1;
                while (j+1<s.length() && s.charAt(j) == s.charAt(j+1)){
                    j++;
                    count++;
                }
                str.append(count).append(s.charAt(j));
            }
            s = str.toString();
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(countAndSay(4));
    }
}
