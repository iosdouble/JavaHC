package com.hc.charp21;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.currentThread;

/**
 * @Classname ThreadLocalOOM
 * @Description TODO
 * @Date 2020/4/4 2:38 PM
 * @Created by nihui
 */
public class ThreadLocalOOM {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<byte[]> threadLocal  = new ThreadLocal<>();
        TimeUnit.SECONDS.sleep(30);
        threadLocal.set(new byte[1024*1024*100]);
        threadLocal.set(new byte[1024*1024*100]);
        threadLocal.set(new byte[1024*1024*100]);
        threadLocal = null;
        currentThread().join();
    }
}
