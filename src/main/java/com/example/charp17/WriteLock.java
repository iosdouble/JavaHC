package com.example.charp17;

/**
 * @Classname WriteLock
 * @Description TODO
 * @Date 2019/7/20 1:42 PM
 * @Created by nihui
 */
public class WriteLock implements Lock {

    private final ReadWriteLockImpl readWriteLock;


    public WriteLock(ReadWriteLockImpl readWriteLock){
        this.readWriteLock = readWriteLock;
    }

    @Override
    public void lock() throws InterruptedException {

        synchronized (readWriteLock.getMUTEX()){
            try {
                //等待数增加
                readWriteLock.incrementWaitingWriters();
                //判断正在读或者写线程挂起
                while (readWriteLock.getReadingReaders()>0||readWriteLock.getWritingWriters()>0){
                    readWriteLock.getMUTEX().wait();
                }
            }finally {
                //成功等待写入锁减少1
                this.readWriteLock.decrementWaitingWriters();
            }
            //正在写锁加一
            readWriteLock.incrementWritingWriters();
        }
    }

    @Override
    public void unlock() {
        synchronized (readWriteLock.getMUTEX()){
            //减少写入
            readWriteLock.decrementWritinggWriters();
            //设置偏好
            readWriteLock.changePrefer(false);
            //唤醒线程
            readWriteLock.getMUTEX().notifyAll();
        }

    }
}
