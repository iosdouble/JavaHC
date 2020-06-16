package com.concurrent.charp01;

import java.util.concurrent.Semaphore;

/**
 * @Classname Server
 * @Description TODO
 * @Date 2020/6/16 10:10 AM
 * @Created by nihui
 */
public class Service {

    private Semaphore semaphore = new Semaphore(2);


    public void testMethod(){
        try{
            semaphore.acquire(1);
            System.out.println(Thread.currentThread().getName() + " begin time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end time = " + System.currentTimeMillis());
            semaphore.release();
        }catch (Exception e){

        }
    }
}
