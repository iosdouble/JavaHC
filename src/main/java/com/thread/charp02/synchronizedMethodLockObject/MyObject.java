package com.thread.charp02.synchronizedMethodLockObject;

/**
 * com.thread.charp02.synchronizedMethodLockObject
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class MyObject {
    public void mehtodA(){
        try{
            System.out.println("begin methodA threadName = "+ Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
