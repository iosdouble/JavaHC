package com.hc.charp04;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Mutex
 * @Author nihui
 * @Date 2019/5/2 21:31
 * @Version 1.0
 * @Description TODO
 */
public class Mutex {
    private final static Object  MUTEX = new Object();

    public void doSource(){
        synchronized (MUTEX){
            try {
                TimeUnit.SECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final Mutex mutex = new Mutex();
        for (int i = 0; i < 5; i++) {
            new Thread(mutex::doSource).start();
        }
    }
}
