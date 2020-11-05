package com.lzz.easy.linklist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/7/22 13:08
 */
public class Day05 {

    public boolean isPalindrome(ListNode head) {

        List<Integer> list = new ArrayList<>();
        ListNode newListNode = head;
        while (newListNode!=null){
            list.add(newListNode.val);
            newListNode = newListNode.next;
        }
        int j = 0;
        int k = list.size()-1;
        while (j<k){
            if(!list.get(j).equals(list.get(k))){
                return false;
            }
            ++j;
            --k;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strings = {"hello","world","!"};
        String str = Stream.of(strings).collect(Collectors.joining(","));
        System.out.println(str);
    }


}
