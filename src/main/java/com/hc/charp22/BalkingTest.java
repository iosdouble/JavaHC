package com.hc.charp22;

/**
 * @Classname BalkingTest
 * @Description TODO
 * @Date 2020/4/7 11:29 AM
 * @Created by nihui
 */
public class BalkingTest {
    public static void main(String[] args) {
        new DocumentEditThread("./","balking.txt").start();
    }
}
