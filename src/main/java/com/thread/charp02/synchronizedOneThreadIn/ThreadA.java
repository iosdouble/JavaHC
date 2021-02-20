package com.thread.charp02.synchronizedOneThreadIn;

/**
 * com.thread.charp02.synchronizedOneThreadIn
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class ThreadA extends Thread{
    private ObjectService service;

    public ThreadA(ObjectService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
