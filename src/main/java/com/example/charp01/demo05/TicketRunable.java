package com.example.charp01.demo05;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TicketRunable
 * @Author nihui
 * @Date 2019/4/27 22:34
 * @Version 1.0
 * @Description TODO
 */
public class TicketRunable implements Runnable {
    private int index = 1;
    private final static int MAX = 50;

    @Override
    public void run() {
        while (index<=50){
            System.out.println(Thread.currentThread()+" 的号码是 ："+index++);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TicketRunable ticketRunable = new TicketRunable();

        Thread thread1 = new Thread(ticketRunable,"一");
        Thread thread2 = new Thread(ticketRunable,"二");
        Thread thread3 = new Thread(ticketRunable,"三");
        Thread thread4 = new Thread(ticketRunable,"四");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
