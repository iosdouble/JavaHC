package com.concurrent.charp01;

/**
 * @Classname ThreadA
 * @Description TODO
 * @Date 2020/6/16 10:15 AM
 * @Created by nihui
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
