package com.thread.charp01.t18;

/**
 * com.thread.charp01.t18
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority = "+this.getPriority());
    }
}
