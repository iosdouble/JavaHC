package com.hc.charp17;

/**
 * @Classname ReadWriteLock
 * @Description TODO
 * @Date 2019/7/20 1:26 PM
 * @Created by nihui
 */
public interface ReadWriteLock {
    //创建read锁
    Lock readLock();
    //创建write锁
    Lock writeLock();

    //获取当前有多少个线程正在执行写操作
    int getWritingWriters();

    //获取当前有多少个线程执行等待读取写操作
    int getWaitngWriters();

    //获取当前有多少线程正在等待获取reader锁
    int getReadingReaders();

    //工厂方法 ，创建 ReadWriteLock
    static ReadWriteLock readWriteLock(){
        return new ReadWriteLockImpl();
    }


    //工厂方法，创建 ReadWriteLock,并且传入preferWrite
    static ReadWriteLock readWriteLock(boolean preferWriter){
        return new ReadWriteLockImpl(preferWriter);
    }
}
