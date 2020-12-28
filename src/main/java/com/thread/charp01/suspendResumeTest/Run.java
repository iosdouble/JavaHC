package com.thread.charp01.suspendResumeTest;

/**
 * com.thread.charp01.suspendResumeTest
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);
            // A 段
            thread.suspend();
            System.out.println("A = "+ System.currentTimeMillis()+"i = "+thread.getI());
            Thread.sleep(5000);
            System.out.println("A = "+ System.currentTimeMillis()+"i = "+thread.getI());
            //B 段
            thread.resume();
            Thread.sleep(5000);
            //C 段
            thread.suspend();
            System.out.println("B = "+System.currentTimeMillis()+"i = "+thread.getI());
            Thread.sleep(5000);
            System.out.println("B = "+System.currentTimeMillis()+"i = "+thread.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
