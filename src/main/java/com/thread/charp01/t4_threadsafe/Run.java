package com.thread.charp01.t4_threadsafe;

/**
 * @Classname Run
 * @Description TODO
 * @Date 2019/10/31 4:28 PM
 * @Created by nihui
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
