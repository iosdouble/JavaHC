package com.thread.charp02.synchronizedMethodLockObject;

/**
 * com.thread.charp02.synchronizedMethodLockObject
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.mehtodA();
    }
}
