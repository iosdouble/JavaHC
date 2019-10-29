package com.hc.charp06;

/**
 * @ClassName ThreadGroupDestroy
 * @Author nihui
 * @Date 2019/5/6 10:01
 * @Version 1.0
 * @Description TODO
 */
public class ThreadGroupDestroy {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("TestGroup");

        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();

        System.out.println("group.isDestroyed="+group.isDestroyed());
        mainGroup.list();

        group.isDestroyed();

        System.out.println("group.isDestoryed="+group.isDestroyed());
        mainGroup.list();
    }
}
