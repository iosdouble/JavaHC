package com.thread.charp01.t17;

/**
 * com.thread.charp01.t17
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            //Thread.yield();
            count = count +(i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime)+" 毫秒");
    }
}
