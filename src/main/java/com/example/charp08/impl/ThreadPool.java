package com.example.charp08.impl;

/**
 * @ClassName ThreadPool
 * @Author nihui
 * @Date 2019/5/7 22:41
 * @Version 1.0
 * @Description TODO
 */
public interface ThreadPool {
    //提交执行任务到线程池中
    void execute(Runnable runnable);

    //关闭线程池
    void shutdown();

    //获取线程池初始化大小
    int getInitSize();

    //获取线程池最大链接数
    int getMaxSize();

    //获取线程池需要维护的核心线程数
    int getCoreSize();

    //获取线程池中用于缓存任务队列的大小
    int getQueueSize();

    //获取线程中活跃线程的大小
    int getActiveCount();

    //判断线程是否已经被shutdown
    boolean isShutdown();
}
