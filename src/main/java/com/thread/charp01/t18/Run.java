package com.thread.charp01.t18;


/**
 * com.thread.charp01.t18
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority = "+ Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority = "+Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
