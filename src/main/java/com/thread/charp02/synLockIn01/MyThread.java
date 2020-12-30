package com.thread.charp02.synLockIn01;

/**
 * com.thread.charp02.synLockIn01
 * create by admin nihui
 * create time 2020/12/30
 * version 1.0
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
