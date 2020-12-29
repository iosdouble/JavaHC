package com.thread.charp02.t1;

/**
 * com.thread.charp02.t1
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA athread =new ThreadA(numRef);
        athread.start();

        ThreadB bthread = new ThreadB(numRef);
        bthread.start();
    }
}
