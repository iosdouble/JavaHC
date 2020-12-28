package com.thread.charp01.suspendResumeLockStop;

/**
 * com.thread.charp01.suspendResumeLockStop
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class MyThreadDemo extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true){
            i++;
            System.out.println(i);
        }
    }
}
