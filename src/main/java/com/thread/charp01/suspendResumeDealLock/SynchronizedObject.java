package com.thread.charp01.suspendResumeDealLock;

/**
 * com.thread.charp01.suspendResumeDealLock
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class SynchronizedObject {

    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("a 线程永远 suspend 了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
