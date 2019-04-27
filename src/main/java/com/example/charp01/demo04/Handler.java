package com.example.charp01.demo04;

/**
 * @Interface Handler
 * @Author nihui
 * @Date 2019/4/27 22:22
 * @Version 1.0
 * @Description TODO
 */
public interface Handler<T>{
    T handle(Result rs);
}
