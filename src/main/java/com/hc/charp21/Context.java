package com.hc.charp21;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname Context
 * @Description TODO
 * @Date 2020/4/4 1:24 PM
 * @Created by nihui
 */
public class Context {
    private ConcurrentHashMap<Thread,ApplicationContext> contexts = new ConcurrentHashMap<>();

    public ApplicationContext getContext(){
        ApplicationContext context = contexts.get(Thread.currentThread());
        if (context==null){
            context = new ApplicationContext();
            contexts.put(Thread.currentThread(),context);
        }
        return context;
    }
}
