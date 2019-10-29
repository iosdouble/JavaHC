package com.hc.charp01.demo04;

/**
 * @ClassName GetResult
 * @Author nihui
 * @Date 2019/4/27 22:23
 * @Version 1.0
 * @Description TODO
 */
public class GetResult {

    public <T> T get(Handler<T> handler,String other){
        Result result = new Result();
        return handler.handle(result);//这个地方只负责获取结果
    }
}
