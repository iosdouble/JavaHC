package com.hc.charp23;

/**
 * @Classname CountDownLatch
 * @Description TODO
 * @Date 2020/4/7 2:56 PM
 * @Created by nihui
 */
public class CountDownLatch extends Latch {

    public CountDownLatch(int limit) {
        super(limit);
    }

    @Override
    public void await() throws InterruptedException {
        synchronized (this) {
            //当limit > 0 ,当前线程计入阻塞状态
            while (limit>0){
//                this.await();
                this.wait();
            }
        }
    }

    @Override
    public void countDown() {

        synchronized (this){
            if (limit<=0){
                throw new IllegalArgumentException("all of task already arrived");
            }
            //使得limit减一，并通知阻塞线程
            limit--;
            this.notifyAll();
        }
    }

    @Override
    public int getUnarrived() {
        return limit;
    }
}
