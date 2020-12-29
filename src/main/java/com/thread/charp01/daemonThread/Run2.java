package com.thread.charp01.daemonThread;

/**
 * com.thread.charp01.daemonThread
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class Run2 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.setDaemon(true);
    }
}
