package com.thread.charp02.synchronizedMethodLockObject2;

/**
 * com.thread.charp02.synchronizedMethodLockObject2
 * create by admin nihui
 * create time 2020/12/30
 * version 1.0
 **/
public class MyObject {

    synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName = "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime = "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB(){
        try {
            System.out.println("begin methodA threadName = "+Thread.currentThread().getName()+" begin time = "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
