package com.example.charp19;

/**
 * @Classname Future
 * @Description TODO
 * @Date 2019/9/20 5:40 PM
 * @Created by nihui
 */
public interface Future<T> {
    //返回计算后的结果，该方法会进入到阻塞状态
    T get() throws InterruptedException;

    //判断任务是否已经被执行完成
    boolean done();
}
