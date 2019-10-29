package com.hc.charp06;

/**
 * @ClassName ThreadGroupCreator
 * @Author nihui
 * @Date 2019/5/6 8:48
 * @Version 1.0
 * @Description TODO
 */
public class ThreadGroupTest {

    public static void main(String[] args) {
        //获取当前线程的线程组
        ThreadGroup main = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup("ThreadGroup-1");
        System.out.println(group.getParent()==main);
        ThreadGroup group1 = new ThreadGroup(group,"ThreadGroup-2");
        System.out.println(group1.getParent()==group);
    }
}
