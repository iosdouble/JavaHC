package com.hc.charp20;

import java.util.LinkedList;

/**
 * @Classname GuardedSuspensionQueue
 * @Description TODO
 * @Date 2019/10/28 5:12 PM
 * @Created by nihui
 */
public class GuardedSuspensionQueue {

    //定义存放Integer类型的Queue
    private final LinkedList<Integer> queue = new LinkedList<>();

    //定义queue的最大容量为100
    private final int LIMIT = 100;

    //向queue中插入数据，如果queue中的元素超过最大容量，则会陷入阻塞
    public void offer(Integer data) throws InterruptedException {

        synchronized (this){
            //判断queue的当前元素是否超过LIMIT
            while (queue.size()>=LIMIT){
                //当前线程进入到阻塞
                this.wait();
            }
            //插入元素并呼气take线程
            queue.addLast(data);
            this.notifyAll();
        }
    }

    //从队列中获取元素，如果队列此时为空，自会使得当前线程阻塞
    public Integer take() throws InterruptedException {
        synchronized(this){
            //如果队列为空
            while (queue.isEmpty()){
                //则挂起当前线程
                this.wait();
            }
            //通知offer线程可以继续插入数据
            this.notifyAll();
            return queue.removeFirst();
        }
    }
}
