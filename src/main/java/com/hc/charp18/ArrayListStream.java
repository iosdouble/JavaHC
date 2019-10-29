package com.hc.charp18;

import java.util.Arrays;
import java.util.List;

/**
 * @Classname ArrayListStream
 * @Description TODO
 * @Date 2019/7/22 3:10 PM
 * @Created by nihui
 */
public class ArrayListStream {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Java","Thread","Concurrency","Scala","Clojure");

        list.parallelStream().map(String::toUpperCase).forEach(System.out::println);

        list.forEach(System.out::println);
    }
}
