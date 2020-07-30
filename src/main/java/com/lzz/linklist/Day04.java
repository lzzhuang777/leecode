package com.lzz.linklist;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/7/22 11:38
 */
public class Day04 {

    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     */


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        else if(l1.val>l2.val){
             l2.next = mergeTwoLists(l1,l2.next);
             return l2;
        }else{
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
    }

}
