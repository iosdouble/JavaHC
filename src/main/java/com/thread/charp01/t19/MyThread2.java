package com.thread.charp01.t19;

import java.util.Random;

/**
 * com.thread.charp01.t19
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int i = 0; i <10; i++) {
            for (int j = 0; j <50000 ; j++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;

            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("□□□□ Thread 2 user time = "+(endTime-beginTime));
    }
}
