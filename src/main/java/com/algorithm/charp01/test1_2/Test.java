package com.algorithm.charp01.test1_2;

import com.algorithm.charp01.linklist.LNode;

/**
 * com.algorithm.charp01.test1_2
 * create by admin nihui
 * create time 2021/3/25
 * version 1.0
 * TODO 如何从无序链表中移除重复项
 **/
public class Test {

    public static void removeDup(LNode head){
        if (head == null || head.next == null){
            return;
        }

        LNode outerCur = head.next; // 用于外层循环，指向链表第一个节点
        LNode innerCur = null; // 内层循环用来遍历outerCur后面的节点
        LNode innerPre = null; // innerCur 的前驱结点

        for (;outerCur!=null;outerCur = outerCur.next){
            for (innerCur = outerCur.next,innerPre= outerCur;innerCur!=null;){
                // 找到重复的节点并删除
                if (outerCur.data == innerCur.data){
                    innerPre.next = innerCur.next;
                    innerCur = innerCur.next;
                }else {
                    innerPre = innerCur;
                    innerCur = innerCur.next;
                }
            }
        }
    }


    // 递归方法
    private static LNode removeDupRecursion(LNode head){
        if (head.next==null){
            return head;
        }
        LNode pointer = null;
        LNode cur = head;
        // 对以head.next为首的子链表删除重复的节点
        head.next = removeDupRecursion(head.next);
        pointer = head.next;
        // 找出以head.next 为首的子链表中与head节点相同的结点并删除
        while (pointer!=null){
            if(head.data==pointer.data){
                cur.next = pointer.next;
                pointer = cur.next;
            }else {
                pointer = pointer.next;
                cur = cur.next;
            }
        }
        return head;
    }

    public static void removeDup1(LNode head){
        if (head == null){
            return ;
        }
        head.next = removeDupRecursion(head);
    }

    public static void main(String[] args) {
        int i = 1;
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;
        LNode cur = head;
        for (; i < 7 ; i++) {
            tmp = new LNode();
            if (i%2==0){
                tmp.data = i+1;
            }else if (i%3==0){
                tmp.data = i-2;
            }else {
                tmp.data = i;
            }
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }
        System.out.print("删除重复结点前：");
        for (cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+" ");
        }
        removeDup(head);
        System.out.print("\n删除重复结点后：");
        for (cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+" ");
        }
    }
}
