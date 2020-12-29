package com.thread.charp01.t19;

/**
 * com.thread.charp01.t19
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            MyThread1 thread1 =  new MyThread1();
            thread1.setPriority(10);
            thread1.start();

            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(1);
            thread2.start();
        }
    }
}
