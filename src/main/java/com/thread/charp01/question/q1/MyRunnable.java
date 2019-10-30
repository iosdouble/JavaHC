package com.thread.charp01.question.q1;

/**
 * @Classname MyRunnable
 * @Description TODO
 * @Date 2019/10/30 6:53 PM
 * @Created by nihui
 */
public class MyRunnable implements Runnable {

    private int i = 5;
    private String name ;

    public MyRunnable(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("name " + name +getClass().getName()+ "   "+i--);
    }
}
