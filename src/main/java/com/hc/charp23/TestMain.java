package com.hc.charp23;

/**
 * @Classname TestMain
 * @Description TODO
 * @Date 2020/4/7 3:12 PM
 * @Created by nihui
 */
public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Latch latch = new CountDownLatch(4);
        new ProgrammerTravel(latch,"test1","Bus1").start();
        new ProgrammerTravel(latch,"test2","Bus2").start();
        new ProgrammerTravel(latch,"test3","Bus3").start();
        new ProgrammerTravel(latch,"test4","Bus4").start();

        latch.await();
        System.out.println("== all of programmer arrived == ");
    }
}
