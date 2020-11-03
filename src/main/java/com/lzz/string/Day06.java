package com.lzz.string;

public class Day06 {

    /**
     * 查找最长公共前缀
     * @param strs
     * @return
     */

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length>0) {
            String min = strs[0];
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < min.length()) {
                    min = strs[i];
                }
            }
            int len = min.length();
            while (len > 0) {
                boolean flag = true;
                for (int i = 0; i < strs.length; i++) {
                    if (!min.substring(0, len).equals(strs[i].substring(0, len))) {
                        len--;
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return min.substring(0, len);
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {

        String[] strings = {"flow"};
        System.out.println(longestCommonPrefix(strings));
    }
}
