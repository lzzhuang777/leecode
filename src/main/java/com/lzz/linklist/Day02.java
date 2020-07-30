package com.lzz.linklist;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/7/21 10:07
 */
public class Day02 {

    /**
     * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
     *
     */
    public ListNode  removeNthFromEnd(ListNode head, int n) {

        ListNode node = new ListNode(0);
        node.next = head;
        ListNode first = node;
        ListNode second = node;
        for(int i =1; i<=n+1;i++){
            first = first.next;
        }
        while (first!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return node.next;
    }

}
