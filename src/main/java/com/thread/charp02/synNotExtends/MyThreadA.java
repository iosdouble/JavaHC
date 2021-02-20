package com.thread.charp02.synNotExtends;

/**
 * com.thread.charp02.synNotExtends
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class MyThreadA extends Thread {
    private Sub sub;

    public MyThreadA(Sub sub){
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
