package com.hc.charp16.demo02;

/**
 * @Classname Tableware
 * @Description TODO
 * @Date 2019/7/19 7:12 PM
 * @Created by nihui
 */
public class Tableware {
    private final String toolName;

    public Tableware(String toolName) {
        this.toolName = toolName;
    }

    @Override
    public String toString() {
        return "Tool: "+toolName;
    }
}
