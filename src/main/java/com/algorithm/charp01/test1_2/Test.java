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
}
