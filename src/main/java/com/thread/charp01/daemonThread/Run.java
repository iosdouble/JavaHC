package com.thread.charp01.daemonThread;

/**
 * com.thread.charp01.daemonThread
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开Thread对象也不在打印，也就是停止了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
