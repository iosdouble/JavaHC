package com.hc.charp19;

/**
 * @Classname Task
 * @Description TODO
 * @Date 2019/9/20 5:56 PM
 * @Created by nihui
 */
@FunctionalInterface
public interface Task<IN,OUT> {
    //给定一个参数，经过计算返回值
    OUT get(IN input);
}
