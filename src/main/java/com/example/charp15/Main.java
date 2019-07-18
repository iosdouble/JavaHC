package com.example.charp15;

import java.util.concurrent.TimeUnit;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/7/18 7:35 PM
 * @Created by nihui
 */
public class Main {
    public static void main(String[] args) {
        Observable observableThread = new ObservableThread<>(()->{
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("finish done");
            return null;
        });
        observableThread.start();
    }
}
