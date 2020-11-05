package com.lzz.easy.linklist;

/**
 * @author lzz
 * @version 1.0
 * @date 2020/7/30 15:33
 */
public class Day06 {

    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
      while (slow!=fast){

          if(fast==null || fast.next==null){
              return false;
          }
          slow = slow.next;
      }
       return true;
    }

}
