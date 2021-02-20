package com.thread.charp02.synchronizedOneThreadIn;

/**
 * com.thread.charp02.synchronizedOneThreadIn
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
