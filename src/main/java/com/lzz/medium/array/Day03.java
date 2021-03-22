package com.lzz.medium.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lzz
 * @version 1.0
 * @date 2021/3/4 15:27
 */
public class Day03 {


    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = s.length();
        int rk = -1,ans = 0;
        for(int i = 0; i<len;i++){
            if(i>0){
                set.remove(s.charAt(i-1));
            }
            while (rk+1<len && !set.contains(s.charAt(rk+1))){
                set.add(s.charAt(rk+1));
                ++rk;
            }
            ans = Math.max(ans,rk - i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {

        String s = "agjsaghgslwsa";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
