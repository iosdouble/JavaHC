package com.thread.charp02.throwExceptionNoLock;

/**
 * com.thread.charp02.throwExceptionNoLock
 * create by admin nihui
 * create time 2021/1/18
 * version 1.0
 **/
public class Service {

    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName");
        }
    }
}
