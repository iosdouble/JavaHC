package com.thread.charp01.t1.mythread;

/**
 * com.thread.charp01.t1.mythread
 * create by admin nihui
 * create time 2020/12/23
 * version 1.0
 **/
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(200);
        System.out.println("运行结束！");
    }
}
