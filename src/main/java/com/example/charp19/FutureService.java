package com.example.charp19;


/**
 * @Classname FutureService
 * @Description TODO
 * @Date 2019/9/20 5:48 PM
 * @Created by nihui
 */
public interface FutureService<IN,OUT> {
    //提交不需要返回值的任务， Future.get方法返回为null
    Future<?> submit(Runnable runnable);

    //提交需要返回值的任务，其中Task接口代替了Runnable接口
    Future<OUT> submit(Task<IN, OUT> task,IN input);

    //使用静态方法创建一个FutureService的实现

    static <T,R> FutureService<T,R> newService(){
        return new FutureServiceImpl<>();
    }

    public Future<OUT> submit(Task<IN,OUT> task, IN input, CallBack<OUT> callback);

}
