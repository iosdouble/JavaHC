package com.thread.charp01.suspendResumeLockStop;

/**
 * com.thread.charp01.suspendResumeLockStop
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
