package com.thread.charp02.t8;

/**
 * com.thread.charp02.t8
 * create by admin nihui
 * create time 2021/2/23
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        Thread.sleep(100);
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
