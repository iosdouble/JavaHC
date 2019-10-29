package com.hc.charp08.impl;

/**
 * @Interface ThreadFactory
 * @Author nihui
 * @Date 2019/5/7 22:50
 * @Version 1.0
 * @Description TODO
 */
@FunctionalInterface
public interface ThreadFactory {

    Thread createThread(Runnable runnable);
}
