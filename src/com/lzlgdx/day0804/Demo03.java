package com.lzlgdx.day0804;

import java.util.Arrays;

/**
 * @className: Demo03.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/04 下午 01:57
 * @Description:
 */
public class Demo03 {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        /*//1、数组的定义
        int[] arr1 = new int[10];
        char[] arr2 = new char[10];
        print(Arrays.toString(arr2));
        print((int) arr2[0]);
        System.out.println(Arrays.toString(arr1));


        //练习：将数组中的200和30交换位置
        int[] arr3 = {10, 200, 30, 40, 50, 60};
        int temp = arr3[1];
        arr3[1] = arr3[2];
        arr3[2] = temp;
        System.out.println(Arrays.toString(arr3));

        //练习：将数组中的内容倒序输出
        int[] arr4 = {
                3, 1, 2, 10, 9
        };
        for (int i = arr4.length - 1; i >= 0; i--) {
            print(arr4[i]);
        }

        //5、数组的复制
        //1）通过自己循环遍历的方式
        int[] arr5 = {
                2, 5, 7, 9, 1
        };
        int [] arr7;
        arr7=new int[arr5.length];
        for (int i=0;i<arr5.length;i++){
            arr7[i]=arr5[i];
        }
        print(Arrays.toString(arr7));

        int [] arr8=new int[7];
        //2)System.arraycopy()方法
        //src 源数组，scrPos第几个下标开始，dest目标数组
        //destPos从目标数组的第几个下标开始，length复制几个元素
        System.arraycopy(arr5,0,arr8,3,4);
        print(Arrays.toString(arr8));*/


        //练习：将arr中的5，7，9复制到arr2数组数组的最后三个位置

        /*int [] arr={2,5,7,9,1};
        int [] arr2=new int[8];
        System.arraycopy(arr,1,arr2,5,3);
        print(Arrays.toString(arr2));*/

        //3、Arrays.copyOf方法
        int [] arr={2,5,7,9,1};
        int [] arr2= Arrays.copyOf(arr,5);
        print(Arrays.toString(arr2));
    }
}
