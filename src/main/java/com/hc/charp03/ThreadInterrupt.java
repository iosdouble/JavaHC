package com.hc.charp03;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadInterrupt
 * @Author nihui
 * @Date 2019/5/1 21:24
 * @Version 1.0
 * @Description TODO
 */
public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            try {
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        //
        TimeUnit.MILLISECONDS.sleep(2);
        thread.interrupt();
    }
}
