package com.algorithm.charp01.test1_1;

import com.algorithm.charp01.linklist.LNode;

/**
 * com.algorithm.charp01.test1_1
 * create by admin nihui
 * create time 2021/3/23
 * version 1.0
 * TODO 如何实现链表的逆序
 **/
public class Test {

    public static void Reverse(LNode head){
        if (head == null || head.next==null){
            return ;
        }

        LNode pre = null;
        LNode cur = null;
        LNode next = null;

        // 把链表的首节点变成尾结点
        cur = head.next;
        next = cur.next;
        cur.next = null;

        pre = cur;
        cur = next;

        while (cur.next!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = cur.next;
            cur = next;
        }

        // 结点最后一个结点指向倒数第二个节点
        cur.next = pre;
        // 链表的头结点指向原来链表的尾结点
        head.next = cur;
    }


    /**
     * 对不带头结点的单链表进行逆序
     * @param head
     * @return
     */
    private static LNode RecursiveReverse(LNode head){
        // 如果链表为空或者链表中只有一个元素
        if (head == null || head.next == null){
            return head;
        }else {
            // 对后续的节点进行反转
            LNode newhead = RecursiveReverse(head.next);
            head.next.next = head;
            head.next = null;
            return newhead;
        }
    }

    /***
     * 对带有头结点的单链表进行逆序
     * @param head
     */
    private static void ReverseHead(LNode head){
        if (head == null){
            return ;
        }
        LNode firstNode = head.next;
        LNode newhead = RecursiveReverse(firstNode);
        head.next = newhead;
    }

    private static void ReverseInsert(LNode head){
        // 判断链表是否为空
        if (head == null||head.next == null){
            return ;
        }
        LNode cur = null;
        LNode next = null;
        cur = head.next.next;
        // 设置链表第一个结点为尾结点
        head.next.next = null;
        // 把遍历到的结点插入到头结点的后面
        while (cur !=null ){
            next = cur.next;
            cur.next = head.next;
            head.next = cur;
            cur = next;
        }
    }


    public static void main(String[] args) {
        // 链表头结点
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;
        LNode cur = head;

        // 构造单链表

        for (int i = 0; i < 8; i++) {
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }

        System.out.print("逆序前：");
        for (cur = head.next;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");
        }
        System.out.println();
        System.out.print("逆序后：");
        Reverse(head);
        for (cur = head.next;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");
        }
    }
}
