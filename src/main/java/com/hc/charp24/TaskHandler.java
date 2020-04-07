package com.hc.charp24;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.currentThread;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * @Classname TaskHandler
 * @Description TODO
 * @Date 2020/4/7 5:09 PM
 * @Created by nihui
 */
public class TaskHandler implements Runnable {


    private final Request request;

    public TaskHandler(Request request) {
        this.request = request;
    }

    @Override
    public void run() {
        System.out.println("Begin handle " + request);
        slowly();
        System.out.println("End handle "+request);
    }

    private void slowly(){
        try{
            TimeUnit.SECONDS.sleep(current().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
