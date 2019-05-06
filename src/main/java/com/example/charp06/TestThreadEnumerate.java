package com.example.charp06;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestThreadGroupEnumerate
 * @Author nihui
 * @Date 2019/5/6 9:02
 * @Version 1.0
 * @Description TODO
 */
public class TestThreadEnumerate {
    public static void main(String[] args) throws InterruptedException {
        //创建一个ThreadGroup
        ThreadGroup testGroup = new ThreadGroup("TestGroup");
        Thread thread = new Thread(testGroup,()->{
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"TestThread");
        thread.start();

        TimeUnit.MILLISECONDS.sleep(2);
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        Thread[] threads = new Thread[mainGroup.activeCount()];
        int recurseSize = mainGroup.enumerate(threads);
        System.out.println(recurseSize);

        recurseSize = mainGroup.enumerate(threads,false);
        System.out.println(recurseSize);
    }
}
