package com.lzlgdx.day0731;

import java.text.Format;

/**
 * @className: Demo02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/07/31 下午 04:50
 * description:java中的基本数据类型
 */
public class Demo02 {
    public static void main(String[] args) {
        //1、整数类型
        //byte和short类型
        byte b1=3;
        byte b2=127;
        //byte b3=128; 编译错误，超出byte表示范围
        short s1=128;
        short s2 = 32767;
        //short s3 = 32768; 编译错误
        //int类型
        int i1=-1000;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.toHexString(1999));


        //练习：两种方式给变量i5和i6赋值为15并输出
        int a=15;
        int b=0xf;
        System.out.println(a);
        System.out.println(b);

        //(2)整数类型的除法运算
        int i7=5/3;
        float i8=5/3f;
        double i9=5/3f;
        System.out.println(i7);
        System.out.println(i8);
        System.out.println(i9);
    }
}
