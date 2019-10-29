package com.hc.charp02.demo01;

/**
 * @ClassName ThreadConstruction
 * @Author nihui
 * @Date 2019/4/28 22:24
 * @Version 1.0
 * @Description TODO
 */
public class ThreadConstruction {
    public static void main(String[] args){
        Thread t1 = new Thread("T1");

        ThreadGroup group = new ThreadGroup("TestGroup");

        Thread t2 = new Thread(group,"T2");

        ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();

        System.out.println("主线程所属的线程组是:"+mainThreadGroup.getName());
        System.out.println("T1 线程和 主线程 是否属于同一组 "+(mainThreadGroup==t1.getThreadGroup()));
        System.out.println("T2 线程和 主线程 是否属于同一组 "+(mainThreadGroup==t2.getThreadGroup()));
        System.out.println("T2 线程和  group 是否属于同一组 "+(group==t2.getThreadGroup()));
    }
}
