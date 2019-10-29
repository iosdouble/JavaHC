package com.hc.charp06;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestThreadOtherMethod
 * @Author nihui
 * @Date 2019/5/6 9:42
 * @Version 1.0
 * @Description TODO
 */
public class TestThreadOtherMethod {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("group1");

        Thread thread = new Thread(group,()->{
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"thread");
        thread.setDaemon(true);
        thread.start();

        TimeUnit.MILLISECONDS.sleep(1);

        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();

        System.out.println("activeCount="+mainGroup.activeCount());
        System.out.println("activeGroupCount="+mainGroup.activeGroupCount());
        System.out.println("getMaxPriority="+mainGroup.getMaxPriority());
        System.out.println("getName="+mainGroup.getName());
        System.out.println("getParent="+mainGroup.getParent());
        mainGroup.list();
        System.out.println("parentOf="+mainGroup.parentOf(group));
        System.out.println("parentof="+mainGroup.parentOf(mainGroup));
    }
}
