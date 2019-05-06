package com.example.charp02.demo02;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName DaemonThread
 * @Author nihui
 * @Date 2019/4/28 23:11
 * @Version 1.0
 * @Description TODO
 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //thread.setDaemon(true);
        thread.start();

        Thread.sleep(2000L);
        System.out.println("主线程结束 thread");
    }
}
