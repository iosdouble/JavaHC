package com.example.charp08;

/**
 * @Interface RunnableQueue
 * @Author nihui
 * @Date 2019/5/7 22:47
 * @Version 1.0
 * @Description TODO
 */
public interface RunnableQueue {
    //当有新任务的时候首先进入到offer中
    void offer(Runnable runnable);

    //通过take方法获取到任务
    Runnable take();

    //获取任务队列中任务的数量
    int size();
}
