package com.thread.charp01.t18;

/**
 * com.thread.charp01.t18
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class MyThread1 extends Thread {
    @Override
    public void run() {

        System.out.println("MyThread1 run priority = "+ this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
