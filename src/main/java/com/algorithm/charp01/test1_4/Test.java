package com.algorithm.charp01.test1_4;

import com.algorithm.charp01.linklist.LNode;

/**
 * com.algorithm.charp01.test1_4
 * create by admin nihui
 * create time 2021/4/22
 * version 1.0
 **/
public class Test {
    /**
     * 找出链表head的中间结点，把链表从中间断开成两个子链表。
     * @param head
     * @return
     */
    private static LNode FindMiddleNode(LNode head){
        if (head == null||head.next == null){
            return head;
        }
        LNode fast = head;
        LNode slow = head;

        LNode slowPre = head;
        //当fast 到链表尾部时，slow恰好到链表中间节点
        while (fast!=null&&fast.next!=null){
            slowPre = slow;
        }
        slow = slow.next;
        fast = fast.next.next;
        //把链表断开成两个独立的子链表
        slowPre.next = null;
        return slow;
    }
}
