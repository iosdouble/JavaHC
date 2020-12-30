package com.thread.charp02.synLockIn01;

/**
 * com.thread.charp02.synLockIn01
 * create by admin nihui
 * create time 2020/12/30
 * version 1.0
 **/
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }
}
