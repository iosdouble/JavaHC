package com.thread.charp01.daemonThread;

/**
 * com.thread.charp01.daemonThread
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try{
            while (true){
                i++;
                System.out.println("i = "+(i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
