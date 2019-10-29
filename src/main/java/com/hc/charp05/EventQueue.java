package com.hc.charp05;

import java.util.LinkedList;

/**
 * @ClassName EventQueue
 * @Author nihui
 * @Date 2019/5/3 21:50
 * @Version 1.0
 * @Description TODO
 */
public class EventQueue {
    private final int max;
    static class Event{

    }
    private final LinkedList<Event> eventQueue = new LinkedList<>();

    private final static int DEFAULT_MAX_EVENT = 10;

    public EventQueue(){
        this(DEFAULT_MAX_EVENT);
    }


    public EventQueue(int max) {
        this.max = max;
    }

    public void offer(Event event){
        synchronized (eventQueue){
            if (eventQueue.size()>=max){
                try {
                    console("队列已满");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            console("新事件已经提交");
            eventQueue.addLast(event);
            eventQueue.notify();
        }
    }

    public Event take(){
        synchronized (eventQueue){
            if (eventQueue.isEmpty()){
                try {
                    console("队列为空");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Event event = eventQueue.removeFirst();
            this.eventQueue.notify();
            console("事件以添加");
            return  event;
        }
    }
    private void console(String message) {
        System.out.printf("%s:%s\n",Thread.currentThread().getName(),message);
    }
}
