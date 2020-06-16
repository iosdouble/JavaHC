package com.concurrent.charp01;

/**
 * @Classname ThreadA
 * @Description TODO
 * @Date 2020/6/16 10:15 AM
 * @Created by nihui
 */
public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
