package com.hc.charp15;

public interface TaskLifecycle<T> {
    //任务启动时会触发onStart方法

    void onStart(Thread thread);

    //任务运行的时候触发onRunning方法
    void onRunning(Thread thread);

    //任务结束的时候会触发onFinish方法，其中result是任务执行完成之后的结果
    void onFinish(Thread thread,T result);

    //任务出错的时候会触发onError方法
    void onError(Thread thread,Exception e);


    //生命周期接口的空实现 Adapter

    class EmptyLifecycle<T> implements TaskLifecycle<T>{
        @Override
        public void onStart(Thread thread) {

        }

        @Override
        public void onRunning(Thread thread) {

        }

        @Override
        public void onFinish(Thread thread, T result) {

        }

        @Override
        public void onError(Thread thread, Exception e) {

        }
    }
}
