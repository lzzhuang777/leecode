package com.lzz.easy.linklist;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/7/21 10:01
 */
public class Day01 {

    /**
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
     */

    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }


}
