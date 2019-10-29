package com.hc.charp15;

public interface Observable {
    //任务生命周期的枚举类型
    enum Cycle{
        STARED,RUNNING,DONE,ERROR
    }
    //获取当前任务生命周期状态
    Cycle getCycle();
    //定义启动线程的方法，主要是为了隐藏Thread的其他方法
    void start();
    //定义线程终止的方法，作用和start方法一样，避免Thread的方法
    void interrupt();
}
