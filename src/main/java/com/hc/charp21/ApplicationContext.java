package com.hc.charp21;

/**
 * @Classname ApplicationContext
 * @Description TODO
 * @Date 2019/11/27 11:43 AM
 * @Created by nihui
 */
public class ApplicationContext {

    private ApplicationConfiguration configuration;

    private RuntimeInfo runtimeInfo;

    private static class Holder{
        private static ApplicationContext instance = new ApplicationContext();
    }

    public static  ApplicationContext getContext(){
        return Holder.instance;
    }


    public ApplicationConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ApplicationConfiguration configuration) {
        this.configuration = configuration;
    }

    public RuntimeInfo getRuntimeInfo() {
        return runtimeInfo;
    }

    public void setRuntimeInfo(RuntimeInfo runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }
}

