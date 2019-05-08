package com.example.charp07;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestHook
 * @Author nihui
 * @Date 2019/5/6 23:08
 * @Version 1.0
 * @Description TODO
 */
public class TestHook {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("The Hook Thread 1 is running.");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The Hook Thread 1 exit.");
            }
        });

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("The Hook Thread 2 is running.");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The Hook Thread 2 exit.");
            }
        });

        System.out.println("The program will is stopping");

    }
}
