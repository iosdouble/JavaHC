package com.example.charp08;

import com.example.charp08.impl.RunnableQueue;

/**
 * @ClassName InternalTask
 * @Author nihui
 * @Date 2019/5/7 23:00
 * @Version 1.0
 * @Description TODO
 */
public class InternalTask implements Runnable {

    private final RunnableQueue runnableQueue;

    private volatile boolean running = true;

    public InternalTask(RunnableQueue runnableQueue) {
        this.runnableQueue = runnableQueue;
    }
    @Override
    public void run() {
        //如果当前任务正在执行并且没有被中断，则需要不断的从Queue中获取任务到run方法中
        while (running && !Thread.currentThread().isInterrupted()) {
            try{
                Runnable task = runnableQueue.take();
                task.run();
            }catch (Exception e){
                running = false;
                break;
            }
        }
    }

    public void stop(){
        this.running = false;
    }
}
