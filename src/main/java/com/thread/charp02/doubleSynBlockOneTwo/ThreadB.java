package com.thread.charp02.doubleSynBlockOneTwo;

/**
 * com.thread.charp02.doubleSynBlockOneTwo
 * create by admin nihui
 * create time 2021/2/22
 * version 1.0
 **/
public class ThreadB extends Thread {
    private ObjectService objectService;


    public ThreadB(ObjectService service){
        super();
        this.objectService = service;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethodB();
    }
}
