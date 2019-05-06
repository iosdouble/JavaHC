package com.example.charp04;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TicketRunable
 * @Author nihui
 * @Date 2019/4/27 22:34
 * @Version 1.0
 * @Description TODO
 */
public class TicketWindows implements Runnable {
    private int index = 1;
    private final static int MAX = 500;
    private final static Object MUTEX = new Object();

    @Override
    public void run() {
        synchronized (MUTEX) {
            while (index <= MAX) {
                System.out.println(Thread.currentThread() + " 的号码是 ：" + index++);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final TicketWindows ticketRunable = new TicketWindows();

        Thread thread1 = new Thread(ticketRunable, "一");
        Thread thread2 = new Thread(ticketRunable, "二");
        Thread thread3 = new Thread(ticketRunable, "三");
        Thread thread4 = new Thread(ticketRunable, "四");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
