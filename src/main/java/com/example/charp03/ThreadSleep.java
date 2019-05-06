package com.example.charp03;


/**
 * @ClassName ThreadSleep
 * @Author nihui
 * @Date 2019/5/1 20:22
 * @Version 1.0
 * @Description TODO
 */
public class ThreadSleep {
    public static void main(String[] args){
        new Thread (()->{
            long startTime = System.currentTimeMillis();
            sleep(2_000L);
            long endTime = System.currentTimeMillis();
            System.out.println(String.format("所花费的时间 %d ms",(endTime-startTime)));
        }).start();

        long startTime = System.currentTimeMillis();
        sleep(3_000L);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("所花费的时间 %d ms",(endTime-startTime)));

    }
    private static void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {

        }
    }
}
