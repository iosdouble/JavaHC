package com.thread.charp01.t3;

/**
 * @Classname Run
 * @Description TODO
 * @Date 2019/10/29 2:13 PM
 * @Created by nihui
 */
public class Run {

    public static void main(String[] args) {
        MyThread a = new MyThread("a");
        MyThread b = new MyThread("b");
        MyThread c = new MyThread("c");
        a.start();
        b.start();
        c.start();
    }
}
