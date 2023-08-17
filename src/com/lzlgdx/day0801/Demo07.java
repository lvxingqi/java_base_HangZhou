package com.lzlgdx.day0801;

import java.util.Scanner;

/**
 * @className: Demo07.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/01 下午 04:48
 * @Description:
 */
public class Demo07 {
    public static void main(String[] args) {
        //1、算数运算符
        int m=5;
        System.out.println(m/2);
        System.out.println(m%2);

        //练习：输入一个三位数求和

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        //个位数
        int a=num%10;
        //十位数
        int c=num/10%10;
        //百位
        int b=num/100;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+b+c);
    }
}
