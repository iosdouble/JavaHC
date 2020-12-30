package com.thread.charp02.t3;

/**
 * com.thread.charp02.t3
 * create by admin nihui
 * create time 2020/12/30
 * version 1.0
 **/
public class ThreadA extends Thread {
    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
