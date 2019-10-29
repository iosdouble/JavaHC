package com.hc.charp17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/7/20 1:17 PM
 * @Created by nihui
 */
public class ShareData {
    //定义共享数据
    private final List<Character> container = new ArrayList<>();

    //构造ReadWrite锁
    private final ReadWriteLock readWriteLock = ReadWriteLock.readWriteLock();

    //读锁
    private final Lock readLock = readWriteLock.readLock();

    //写锁
    private final Lock writeLock = readWriteLock.writeLock();


    private final int length;

    public ShareData(int length){
        this.length = length;
        for (int i = 0; i < length; i++) {
            container.add(i,'c');
        }
    }

    public char[] read() throws InterruptedException {
        try {
            //读锁定
            readLock.lock();
            char[] newBuffer = new char[length];

            for (int i = 0; i < length; i++) {
                newBuffer[i] = container.get(i);
            }
            slowly();
            return newBuffer;

        }finally {
            //释放读锁
            readLock.unlock();
        }
    }

    public void write(char c) throws InterruptedException{
        try{
            //写锁定
            writeLock.lock();
            for (int i = 0; i < length; i++) {
                this.container.add(i,c);
            }
            slowly();

        }finally {
            //释放写锁
            writeLock.unlock();
        }
    }

    private void slowly(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
