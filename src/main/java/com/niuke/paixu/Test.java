package com.niuke.paixu;

/**
 * com.niuke.paixu
 * create by admin nihui
 * create time 2021/4/23
 * version 1.0
 * TODO 给定一个数组，请你编写一个函数，返回该数组排序后的形式。
 **/
public class Test {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public static int[] MySort (int[] arr) {
        // write code here

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,6,8};
        int[] ints = MySort(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+" ");
        }
    }
}
