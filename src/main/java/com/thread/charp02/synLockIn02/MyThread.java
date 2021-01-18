package com.thread.charp02.synLockIn02;

/**
 * com.thread.charp02.synLockIn02
 * create by admin nihui
 * create time 2021/1/18
 * version 1.0
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
