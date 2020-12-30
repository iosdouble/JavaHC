package com.thread.charp02.synLockIn01;

/**
 * com.thread.charp02.synLockIn01
 * create by admin nihui
 * create time 2020/12/30
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
