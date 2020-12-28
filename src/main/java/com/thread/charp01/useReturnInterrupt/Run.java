package com.thread.charp01.useReturnInterrupt;

/**
 * com.thread.charp01.useReturnInterrupt
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}
