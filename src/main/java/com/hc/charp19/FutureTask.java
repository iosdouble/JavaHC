package com.hc.charp19;

/**
 * @Classname FutureTask
 * @Description TODO
 * @Date 2019/9/20 6:42 PM
 * @Created by nihui
 */
public class FutureTask<T> implements Future<T> {

    //计算结果
    private T result;

    //任务是否完成
    private boolean isDone  = false;

    //定义对象锁
    private final Object LOCK = new Object();

    @Override
    public T get() throws InterruptedException {
        synchronized (LOCK){
            //当任务还没有完成的时候，调用get方法会被挂起而进入阻塞
            while (!isDone){
                LOCK.wait();
            }
        }
        //返回最终计算结果
        return result;
    }

    //finish方法主要用于为FutureTask设置计算结果
    protected void finish(T result){
        synchronized (LOCK){
            //balking设计模式
            if (isDone){
                return;
            }
            //计算完成，为result指定结果，并将isDone设置为True，同时唤醒阻塞中的线程
            this.result = result;
            this.isDone = true;
            LOCK.notifyAll();
        }
    }

    @Override
    public boolean done() {
        return isDone;
    }
}
