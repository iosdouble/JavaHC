package com.example.charp19;



import java.util.concurrent.atomic.AtomicInteger;



/**
 * @Classname FutureServiceImpl
 * @Description TODO
 * @Date 2019/9/20 6:51 PM
 * @Created by nihui
 */
public class FutureServiceImpl<IN,OUT> implements FutureService<IN,OUT> {

    //为执行的线程指定名称前缀
    private final static String FUTURE_THREAD_PREFIX = "FUTURE-";

    private final AtomicInteger nextCounter = new AtomicInteger(0);

    private String getNextName(){
        return FUTURE_THREAD_PREFIX + nextCounter.getAndIncrement();
    }
    @Override
    public Future<?> submit(Runnable runnable) {
        final FutureTask<Void> future = new FutureTask<>();
        new Thread(()->{
            runnable.run();
            //任务执行结束之后将null作为结果传回future
            future.finish(null);
        },getNextName()).start();
        return future;
    }

    @Override
    public Future<OUT> submit(Task<IN, OUT> task, IN input) {
        final FutureTask<OUT> future = new FutureTask<>();
        new Thread(()->{
            OUT result = task.get(input);
            //任务执行结束之后，将真实的结果通过finish方法传递给future
            future.finish(result);
        },getNextName()).start();
        return future;
    }

    public Future<OUT> submit(Task<IN,OUT> task, IN input, CallBack<OUT> callback){
        final FutureTask<OUT> future = new FutureTask<>();

        new Thread(()->{
            OUT result =task.get(input);
            future.finish(result);

            if (null !=callback){
                callback.getFuture(result);
            }
        },getNextName()).start();
        return future;
    }

}
