package com.hc.charp17;

/**
 * @Classname ReadWriteLockImpl
 * @Description TODO
 * @Date 2019/7/20 1:29 PM
 * @Created by nihui
 */
public class ReadWriteLockImpl implements ReadWriteLock {

    //定义对象锁
    private final Object MUTEX = new Object();

    //当前有多少个线程正在写入操作
    private int writingWriters = 0;

    //当前有多少个线程正在等待写入
    private int waitingWriters = 0;

    //当前有多少个线程正在read
    private int readingReaders = 0;

    //read和write 的偏好设置
    private boolean preferWriter;

    //默认情况下perferWriter为True
    public ReadWriteLockImpl(){
        this(true);
    }

    //构造ReadWriteLockImpl并且传入 perferWriter
    public ReadWriteLockImpl(boolean preferWriter){
        this.preferWriter = preferWriter;
    }


    //read lock
    @Override
    public Lock readLock() {
        return new ReadLock(this);
    }

    // write lock
    @Override
    public Lock writeLock() {
        return new WriteLock(this);
    }

    //写线程数增加
    void incrementWritingWriters(){
        this.writingWriters++;
    }
    //等待写入的线程数增加
    void incrementWaitingWriters(){
        this.waitingWriters++;
    }

   //读线程数增加
    void incrementReadingReaders(){
        this.readingReaders++;
    }

    //等待写线程数减少
    void decrementWaitingWriters(){
        this.waitingWriters--;
    }
    //写线程数减少
    void decrementWritinggWriters(){
        this.writingWriters--;
    }
    //读线程数减少
    void decrementReadingReaders(){
        this.readingReaders--;
    }

    //获取当前有多少个线程正在进行写操作
    @Override
    public int getWritingWriters() {
        return this.writingWriters;
    }

    //获取当前有多少个线程正在等待获取写入操作
    @Override
    public int getWaitngWriters() {
        return this.waitingWriters;
    }

    //获取当前有多少个线程正在进行读操作
    @Override
    public int getReadingReaders() {
        return this.readingReaders;
    }

    //获取对象锁
    public Object getMUTEX() {
        return this.MUTEX;
    }

    //获取当前是否偏向写锁
    public boolean getPreferWriter() {
        return preferWriter;
    }

    //设置写锁偏好
    void changePrefer(boolean preferWriter){
        this.preferWriter = preferWriter;
    }
}
