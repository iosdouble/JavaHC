package com.example.charp04;

/**
 * @ClassName DeadLock
 * @Author nihui
 * @Date 2019/5/2 22:22
 * @Version 1.0
 * @Description TODO
 */
public class DeadLock {
    private final Object MUTEX_READ = new Object();
    private final Object MUTEX_WRITE = new Object();


    public void read() {
        synchronized (MUTEX_READ) {
            System.out.println(Thread.currentThread().getName() + "获取到读锁");
            synchronized (MUTEX_WRITE){
                System.out.println(Thread.currentThread().getName()+"获取到写锁");
            }
            System.out.println(Thread.currentThread().getName()+"释放写锁");
        }
        System.out.println(Thread.currentThread().getName()+"释放读锁");
    }
    public void write() {
        synchronized (MUTEX_WRITE) {
            System.out.println(Thread.currentThread().getName() + "获取到写锁");
            synchronized (MUTEX_READ){
                System.out.println(Thread.currentThread().getName()+"获取到读锁");
            }
            System.out.println(Thread.currentThread().getName()+"释放读锁");
        }
        System.out.println(Thread.currentThread().getName()+"释放写锁");
    }

    public static void main(String[] args) {
        final DeadLock deadLock = new DeadLock();
        new Thread(()->{
            while (true){
                deadLock.read();
            }
        },"读线程").start();
        new Thread(()->{
            while (true){
                deadLock.write();
            }
        },"写线程").start();
    }
}
