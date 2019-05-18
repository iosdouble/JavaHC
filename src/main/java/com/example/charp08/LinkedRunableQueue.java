package com.example.charp08;

import com.example.charp08.impl.DenyPolicy;
import com.example.charp08.impl.RunnableQueue;
import com.example.charp08.impl.ThreadPool;

import java.util.LinkedList;

/**
 * @ClassName LinkedRunableQueue
 * @Author nihui
 * @Date 2019/5/9 11:30
 * @Version 1.0
 * @Description TODO
 */
public class LinkedRunableQueue implements RunnableQueue {

    //任务队列最大容量
    private final int limit;

    private final DenyPolicy denyPolicy;

    private final LinkedList<Runnable> runnableList = new LinkedList<>();

    private final ThreadPool threadPool;


    public LinkedRunableQueue(int limit, DenyPolicy denyPolicy, ThreadPool threadPool) {
        this.limit = limit;
        this.denyPolicy = denyPolicy;
        this.threadPool = threadPool;
    }

    @Override
    public void offer(Runnable runnable) {
        synchronized (runnableList){
            if (runnableList.size() >= limit){
                denyPolicy.reject(runnable,threadPool);
            }else {
                runnableList.addLast(runnable);
                runnableList.notifyAll();
            }
        }

    }

    @Override
    public Runnable take() {
        synchronized (runnableList){
            while (runnableList.isEmpty()){
                try {
                    runnableList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return runnableList.removeFirst();
        }
    }

    @Override
    public int size() {
        synchronized (runnableList){
         return runnableList.size();
        }
    }
}
