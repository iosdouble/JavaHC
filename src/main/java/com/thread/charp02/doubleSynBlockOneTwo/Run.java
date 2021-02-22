package com.thread.charp02.doubleSynBlockOneTwo;

/**
 * com.thread.charp02.doubleSynBlockOneTwo
 * create by admin nihui
 * create time 2021/2/22
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();

        ThreadA a = new ThreadA(objectService);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(objectService);
        b.setName("a");
        b.start();
    }
}
