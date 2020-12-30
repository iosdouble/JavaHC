package com.thread.charp02.synchronizedMethodLockObject2;

/**
 * com.thread.charp02.synchronizedMethodLockObject2
 * create by admin nihui
 * create time 2020/12/30
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();

        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
