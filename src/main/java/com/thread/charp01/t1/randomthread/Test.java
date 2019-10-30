package com.thread.charp01.t1.randomthread;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/10/29 10:40 AM
 * @Created by nihui
 */
public class Test {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.setName("MyThread");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main= "+ Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
