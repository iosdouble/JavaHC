package com.algorithm.charp01.test1_5;

import com.algorithm.charp01.linklist.LNode;

/**
 * com.algorithm.charp01.test1_5
 * create by admin nihui
 * create time 2021/4/23
 * version 1.0
 * TODO 如何找出单链表中的倒数第K个元素
 **/
public class Test {

    // 构造一个单链表
    public static LNode ConstructList(){

        int i = 1;
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;

        LNode cur = head;
        // 构造第一个链表

        for (;i<8;i++){
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }
        return head;
    }

    /**
     * 顺序打印单链表结点的数据
     * @param head
     */
    public static void PrintList(LNode head){
        for (LNode cur = head.next;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");
        }
    }

    public static LNode FindLastK(LNode head,int k){

        if (head==null||head.next == null){
            return head;
        }
        LNode slow,fast;
        slow = fast = head.next;
        int i;
        for (i = 0; i <k&&fast!=null ; ++i) {
            fast = fast.next;
        }

        // 判断k是否已经超出链表长度
        if (i<k){
            return null;
        }

        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LNode head = ConstructList();
        LNode result = null;
        System.out.print("链表：");
        PrintList(head);
        result= FindLastK(head,3);
        System.out.println();
        if (result!=null){
            System.out.print("链表倒数第三个元素为："+result.data);
        }
    }

}
