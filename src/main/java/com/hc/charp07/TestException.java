package com.hc.charp07;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestException
 * @Author nihui
 * @Date 2019/5/6 22:53
 * @Version 1.0
 * @Description TODO
 */
public class TestException {

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((t,e)->{
            System.out.println(t.getName()+" occur exception");
            e.printStackTrace();
        });

        final Thread thread = new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(1/0);
        },"Test1");
        thread.start();
    }
}
