package com.lzlgdx.day0801;

import java.util.Scanner;

/**
 * @className: Demo05.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/01 下午 02:31
 * @Description:
 * 基本类型间的大小关系
 * byte<short<int<long<float<double
 *      char(16)
 * 自动类型转换,从小类型到大类型
 * 强制类型转换,从大类型到 小类型(有可能损失精度)
 */
public class Demo05 {
    public static void main(String[] args) {
        int a=46;
        char b=(char)a;
        System.out.println(b);
        double c=9.0000000000000000056;
        System.out.println((int)c);

        //自动类型转换，自动将a+b的结果由int类型转换为了long类型
        int a1=100;
        int b1=200;
        long c1=a1+b1;
        System.out.println(c1);

        //强制类型转换
        long m1=10240000000000L;
        System.out.println(m1);
        int m2=(int)m1;
        System.out.println(m2);

        System.out.println(Math.PI);
        System.out.println((float)Math.PI);

        byte a11=100;
        byte b11=100;
        int c11= a11+b11;
        byte c12= (byte) (a11 + b11);
        System.out.println(c11);
        System.out.println(c12);

    }
}
