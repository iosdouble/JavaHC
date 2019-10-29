package com.hc.charp03;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadisInterrupted
 * @Author nihui
 * @Date 2019/5/1 21:36
 * @Version 1.0
 * @Description TODO
 */
public class ThreadisInterrupted {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                while (true){
                    //死循环
                }
            }
        };
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.printf("线程是否是被中断 %s\n", thread.isInterrupted());
        thread.interrupt();
        System.out.printf("线程是否被中断  %s\n",thread.isInterrupted());
    }
}
