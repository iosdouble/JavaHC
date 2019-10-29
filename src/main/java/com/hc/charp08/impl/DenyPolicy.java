package com.hc.charp08.impl;

import com.hc.charp08.exception.RunnableDenyException;

/**
 * @Interface DenyPolicy
 * @Author nihui
 * @Date 2019/5/7 22:52
 * @Version 1.0
 * @Description TODO
 */
@FunctionalInterface
public interface DenyPolicy {
    void reject(Runnable runnable,ThreadPool threadPool);

    class DiscardDenyPolicy implements DenyPolicy{
        @Override
        public void reject(Runnable runnable, ThreadPool threadPool) {
            //do nothing
        }
    }

    class AbortDenyPolicy implements DenyPolicy{
        @Override
        public void reject(Runnable runnable, ThreadPool threadPool) {
            throw new RunnableDenyException("The runnable "+runnable+" will be abort.");
        }
    }
    class RunnerDenyPolicy implements DenyPolicy{

        @Override
        public void reject(Runnable runnable, ThreadPool threadPool) {
            if (!threadPool.isShutdown()){
                runnable.run();
            }
        }
    }
}
