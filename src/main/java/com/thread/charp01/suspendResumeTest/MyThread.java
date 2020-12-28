package com.thread.charp01.suspendResumeTest;

/**
 * com.thread.charp01.suspendResumeTest
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class MyThread extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            i++;
        }
    }
}
