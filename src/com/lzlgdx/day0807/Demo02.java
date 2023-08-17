package com.lzlgdx.day0807;

import java.util.Arrays;

/**
 * @className: Demo02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/07 下午 02:37
 * @Description:
 * 方法的语法演示
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        sum1(20,30);
    }
    /**
    description:求两个数的和
    *
     * @param a 加数a
     * @param b 加数b
    * @return int
    */
    public static int sum(int a,int b){
        return a+b;
    }

    public static void sum1(int a,int b){
        System.out.println(a+b);
    }
}
