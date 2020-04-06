package com.hc.charp21;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.lang.Thread.currentThread;

/**
 * @Classname ThreadLocalExample
 * @Description TODO
 * @Date 2020/4/4 1:42 PM
 * @Created by nihui
 */
public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        IntStream.range(0,10).forEach(i->new Thread(()->{
            try{
                threadLocal.set(i);
                System.out.println(currentThread()+"set i "+threadLocal.get());
                TimeUnit.SECONDS.sleep(1);
                System.out.println(currentThread()+"get i "+threadLocal.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start()
        );
    }
}
