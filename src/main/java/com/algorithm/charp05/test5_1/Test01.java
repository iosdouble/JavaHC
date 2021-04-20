package com.algorithm.charp05.test5_1;

/**
 * com.algorithm.charp05.test5_1
 * create by admin nihui
 * create time 2021/4/19
 * version 1.0
 **/
public class Test01 {

    /**
     * 交换字符数组下标为i和j的对应字符
     * @param str
     * @param i
     * @param j
     */
    private static void swap(char[] str,int i,int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }


    /**
     * 翻转字符串
     * @param str
     * @param begin 开始字符下标
     * @param end 结束字符下标
     */
    private static void Reverse(char[] str,int begin,int end){
        for (int i = begin,j=end; i <j ; i++,j--) {
            swap(str,i,j);
        }
    }
}
