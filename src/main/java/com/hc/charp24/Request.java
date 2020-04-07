package com.hc.charp24;

/**
 * @Classname Request
 * @Description TODO
 * @Date 2020/4/7 5:07 PM
 * @Created by nihui
 */
public class Request {
    private final String business;

    public Request(String business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return business;
    }
}
