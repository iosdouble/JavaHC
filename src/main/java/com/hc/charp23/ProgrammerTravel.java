package com.hc.charp23;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @Classname ProgrammerTravel
 * @Description TODO
 * @Date 2020/4/7 3:07 PM
 * @Created by nihui
 */
public class ProgrammerTravel extends Thread {
    //阀门
    private final Latch latch;

    //程序员
    private final String programmer;

    //交通工具
    private final String transportation;

    public ProgrammerTravel(Latch latch, String programmer, String transportation) {
        this.latch = latch;
        this.programmer = programmer;
        this.transportation = transportation;
    }

    @Override
    public void run() {

        System.out.println(programmer + " start task the transportation [ "+transportation+" ]");
        try {
            //程序员乘坐交通工具花费在路上的时间（使用随机数字模拟）
            TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(programmer + " arrived by " + transportation );
        latch.countDown();


    }
}
