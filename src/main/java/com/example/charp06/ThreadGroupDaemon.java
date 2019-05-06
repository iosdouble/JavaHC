package com.example.charp06;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadGroupDaemon
 * @Author nihui
 * @Date 2019/5/6 9:58
 * @Version 1.0
 * @Description TODO
 */
public class ThreadGroupDaemon {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group1 = new ThreadGroup("TestGroup1");
        new Thread(group1,()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"test_thread1").start();

        ThreadGroup group2 = new ThreadGroup("TestGroup2");
        new Thread(group2,()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"test_thread2").start();

        group2.setDaemon(true);
        TimeUnit.SECONDS.sleep(3);
        System.out.println(group1.isDestroyed());
        System.out.println(group2.isDestroyed());
    }
}
