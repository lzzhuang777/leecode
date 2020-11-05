package com.lzz.easy.linklist;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/7/21 11:30
 */
public class Day03 {

    /**
     * 反转单链表
     */

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
