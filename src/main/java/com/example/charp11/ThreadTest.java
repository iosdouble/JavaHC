package com.example.charp11;

import static java.lang.Thread.currentThread;

/**
 * @ClassName ThreadTest
 * @Author nihui
 * @Date 2019/5/14 11:00
 * @Version 1.0
 * @Description TODO
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(currentThread().getContextClassLoader());
    }
}
