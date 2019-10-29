package com.hc.charp03;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadisInterruptedNew
 * @Author nihui
 * @Date 2019/5/1 21:44
 * @Version 1.0
 * @Description TODO
 */
public class ThreadisInterruptedNew {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        TimeUnit.MINUTES.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println("这里会抛出异常");
                    }
                }
            }
        };
        thread.setDaemon(true);//设置为守护进程
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.printf("这个线程是否被打断 %s\n",thread.isInterrupted());
        thread.interrupt();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.printf("这个线程是否被打断 %s\n",thread.isInterrupted());
    }
}
