package com.thread.charp02.throwExceptionNoLock;

/**
 * com.thread.charp02.throwExceptionNoLock
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
