package com.thread.charp01.t3;

/**
 * @Classname MyThread
 * @Description TODO
 * @Date 2019/10/29 1:46 PM
 * @Created by nihui
 */
public class MyThread extends Thread {
    private int count = 5;
    public MyThread(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由 "+currentThread().getName()+" 计算，count="+count);
        }
    }
}
