package com.lzz.medium.array;

import java.util.*;

/**
 * @author lzz
 * @version 1.0
 * @date 2021/3/3 11:44
 */
public class day02 {

   /** 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。

    示例:

    输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
    输出:
            [
            ["ate","eat","tea"],
            ["nat","tan"],
            ["bat"]
            ]
    说明：

    所有输入均为小写字母。
    不考虑答案输出的顺序。**/
   public static List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();
       for(String str : strs){
           char[] chars = str.toCharArray();
           Arrays.sort(chars);
           String key = new String(chars);
           List<String> list = map.getOrDefault(key,new ArrayList<String>());
           list.add(str);
           map.put(key,list);
       }
       return new ArrayList<>(map.values());
   }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(strs);
        list.stream().forEach(item ->{
            item.stream().forEach(s -> {
                System.out.println(s);
            });
        });
    }

}
