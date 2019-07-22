package com.example.charp17;

/**
 * @Classname ReadLock
 * @Description TODO
 * @Date 2019/7/20 1:37 PM
 * @Created by nihui
 */
public class ReadLock implements Lock {

    private final ReadWriteLockImpl readWriteLock;

    public ReadLock(ReadWriteLockImpl readWriteLock){
        this.readWriteLock = readWriteLock;
    }

    @Override
    public void lock() throws InterruptedException {
        //使用Mutex作为锁
        synchronized (readWriteLock.getMUTEX()){
            //当前满足条件的时候此锁挂起等待
            while (readWriteLock.getWritingWriters()>0 || (readWriteLock.getPreferWriter()&& readWriteLock.getWaitngWriters()>0)){
                readWriteLock.getMUTEX().wait();
            }
            //获取到读锁的数量增加
            readWriteLock.incrementReadingReaders();
        }
    }

    @Override
    public void unlock() {

        //锁定对象
        synchronized (readWriteLock.getMUTEX()){
            //减少读锁
            readWriteLock.decrementReadingReaders();
            //修改锁偏向
            readWriteLock.changePrefer(true);
            //唤醒被锁定的线程
            readWriteLock.getMUTEX().notifyAll();
        }
    }
}
