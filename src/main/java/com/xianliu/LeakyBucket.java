package com.xianliu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * com.xianliu
 * create by admin nihui
 * create time 2021/4/20
 * version 1.0
 **/
public class LeakyBucket {

    // 流出速率
    private double rate;

    // 桶大小
    private double burst;

    // 最后更新时间
    private long refreshTime;

    // 现有量
    private int water;


    public LeakyBucket(double rate,double burst){
        this.rate = rate;
        this.burst = burst;
    }

    /**
     * 用来刷新水量
     */
    private void refreshWater(){
        long now = System.currentTimeMillis();
        water = (int) Math.max(0,water-(now-refreshTime)* rate);
        refreshTime = now;
    }

    public synchronized boolean tryAcquire(){
        refreshWater();
        if (water<burst) {
            water++;
            return true;
        }else {
            return false;
        }
    }


    private static LeakyBucket leakyBucket = new LeakyBucket(1,100);
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executorService.execute(()->{
                System.out.println(leakyBucket.tryAcquire());
            });
        }
        executorService.shutdown();
    }
}
