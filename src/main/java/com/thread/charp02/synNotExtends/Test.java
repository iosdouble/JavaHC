package com.thread.charp02.synNotExtends;

/**
 * com.thread.charp02.synNotExtends
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Sub subRef = new Sub();
        MyThreadA a = new MyThreadA(subRef);
        a.setName("A");
        a.start();


        MyThreadB b = new MyThreadB(subRef);
        b.setName("B");
        b.start();
    }
}
