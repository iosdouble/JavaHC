package com.thread.charp02.t7;

/**
 * com.thread.charp02.t7
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
