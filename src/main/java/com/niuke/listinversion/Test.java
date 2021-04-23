package com.niuke.listinversion;

/**
 * com.niuke.listinversion
 * create by admin nihui
 * create time 2021/4/23
 * version 1.0
 * TODO 输入一个链表，反转链表后，输出新链表的表头。
 **/
public class Test {

    public static void ReverseList(ListNode head) {
        if (head==null||head.next==null){
            return ;
        }
        // 获取到第一个节点
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;

        while (head.next!=null){
            // 获取到当前节点的下一个节点
            pre = head.next;
            // 记录到 当前获取到节点的下一个节点
            next = pre.next;
            // 利用头插法 进行插入操作
            pre.next = cur;
            // 插入完成之后 当前节点为头结点所代表的下一个节点
            cur = next;
        }
    }

    public static void main(String[] args) {

    }
}
