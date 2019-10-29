package com.hc.charp15;

import java.util.concurrent.TimeUnit;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/7/18 7:38 PM
 * @Created by nihui
 */
public class Test {
    public static void main(String[] args) {
        final TaskLifecycle<String> lifecycle = new TaskLifecycle.EmptyLifecycle<String>() {
            @Override
            public void onFinish(Thread thread, String result) {
                System.out.println("The result is " + result);
            }
        };

        Observable observableThread = new ObservableThread<>(lifecycle,()->{
           try {
               TimeUnit.SECONDS.sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
            System.out.println(" finished done.");
           return "Hello Observer";
        });

        observableThread.start();
    }

}
