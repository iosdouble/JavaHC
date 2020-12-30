package com.thread.charp02.synchronizedMethodLockObject2;

/**
 * com.thread.charp02.synchronizedMethodLockObject2
 * create by admin nihui
 * create time 2020/12/30
 * version 1.0
 **/
public class ThreadA extends Thread {
    private MyObject object;

    public ThreadA(MyObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
