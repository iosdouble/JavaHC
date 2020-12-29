package com.thread.charp01.t20;

import java.util.Random;

/**
 * com.thread.charp01.t20
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class MyThread1 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("thread 1 user time = "+(endTime-beginTime));
    }
}
