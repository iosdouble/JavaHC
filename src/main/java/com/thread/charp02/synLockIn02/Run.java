package com.thread.charp02.synLockIn02;

/**
 * com.thread.charp02.synLockIn02
 * create by admin nihui
 * create time 2021/1/18
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
