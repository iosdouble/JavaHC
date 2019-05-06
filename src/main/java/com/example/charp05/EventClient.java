package com.example.charp05;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * @ClassName EventClient
 * @Author nihui
 * @Date 2019/5/3 22:02
 * @Version 1.0
 * @Description TODO
 */
public class EventClient {
    public static void main(String[] args) {
        final EventQueue eventQueue = new EventQueue();
        new Thread(()->{
            while (true){
                eventQueue.offer(new EventQueue.Event());
            }
        },"生产者").start();
        new Thread(()->{
            while (true){
                eventQueue.offer(new EventQueue.Event());
            }
        },"生产者").start();
        new Thread(()->{
            while (true){
                eventQueue.offer(new EventQueue.Event());
            }
        },"生产者").start();

        new Thread(()->{
            while (true){
                eventQueue.take();
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"消费者").start();
    }
}
