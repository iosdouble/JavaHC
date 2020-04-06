package com.hc.charp21;

/**
 * @Classname ThreadLocalTest
 * @Description TODO
 * @Date 2020/4/4 1:53 PM
 * @Created by nihui
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<Object> threadLocal = new ThreadLocal<Object>(){
            @Override
            protected Object initialValue() {
                return new Object();
            }
        };

        new Thread(()-> System.out.println(threadLocal.get())).start();
        System.out.println(threadLocal.get());
    }
}
