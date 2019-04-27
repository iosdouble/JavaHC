package com.example.charp01.demo02;

/**
 * @ClassName TemplateMain
 * @Author nihui
 * @Date 2019/4/27 21:48
 * @Version 1.0
 * @Description TODO
 */
public class TemplateMain {
    public static void main(String[] args) {
        Repoter repoter = new Repoter(){
            @Override
            public void print() {
                System.out.println("这个是一个设计模板方法");
            }
        };
        repoter.printNews();
    }
}
