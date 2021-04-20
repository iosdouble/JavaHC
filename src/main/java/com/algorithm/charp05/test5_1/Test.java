package com.algorithm.charp05.test5_1;

/**
 * com.algorithm.charp05.test5_1
 * create by admin nihui
 * create time 2021/4/19
 * version 1.0
 * TODO 如何求一个字符串的所有排列
 **/
public class Test {

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
     * 方法功能：对字符串中的字符进行全排列
     * @param str 待排序的字符串
     * @param start 待排序的子字符串的首字符下标
     */
    public static void Permutation(char[] str,int start){
        if (str == null || start<0){
            return;
        }
        if (start==str.length-1){
            System.out.println(str);
        }else {
            for (int i = start; i <str.length ; i++) {
                // 交换start与i所在位置的字符
                swap(str,start,i);
                //固定第一个字符，对剩余的字符进行全排列
                Permutation(str,start+1);
                //还原start与i所在的位置的字符
                swap(str,start,i);
            }
        }
    }

    public static void Permutation(String s){
        char[] str = s.toCharArray();
        Permutation(str,0);
    }

    public static void main(String[] args) {
        String s = "abc";
        Permutation(s);
    }
}
