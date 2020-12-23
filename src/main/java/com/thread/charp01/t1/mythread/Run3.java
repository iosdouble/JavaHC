package com.thread.charp01.t1.mythread;

/**
 * com.thread.charp01.t1.mythread
 * create by admin nihui
 * create time 2020/12/23
 * version 1.0
 **/
public class Run3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(){
                public void run(){
                    try {
                        Thread.sleep(500000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
