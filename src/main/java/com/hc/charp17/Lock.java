package com.hc.charp17;

/**
 * @Classname Lock
 * @Description TODO
 * @Date 2019/7/20 1:22 PM
 * @Created by nihui
 */
public interface Lock {
    //自定义接口
    // 获取显式锁，没有获得锁的线程将会被阻塞
    void lock() throws InterruptedException;

    //释放锁
    void unlock();

}
