package com.hc.charp06;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestThreadGroupEnumerate
 * @Author nihui
 * @Date 2019/5/6 9:21
 * @Version 1.0
 * @Description TODO
 */
public class TestThreadGroupEnumerate {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group1 = new ThreadGroup("TestGroup1");
        ThreadGroup group2 = new ThreadGroup(group1,"TestGroup1");

        TimeUnit.MILLISECONDS.sleep(2);
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();

        ThreadGroup[] list = new ThreadGroup[mainGroup.activeGroupCount()];

        int recureseSize = mainGroup.enumerate(list);
        System.out.println(recureseSize);
        recureseSize = mainGroup.enumerate(list,false);
        System.out.println(recureseSize);
    }
}
