package com.thread.charp01.question.q1;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/10/30 6:43 PM
 * @Created by nihui
 */
public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
