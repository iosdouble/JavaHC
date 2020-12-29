package com.thread.charp02.t2;

/**
 * com.thread.charp02.t2
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {

        super.run();
        numRef.addI("b");
    }
}
