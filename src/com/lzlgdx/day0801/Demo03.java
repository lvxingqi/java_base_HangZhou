package com.lzlgdx.day0801;

/**
 * @className: Demo03.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/01 上午 10:59
 * description:char字符类型
 */
public class Demo03 {
    public static void main(String[] args) {
        //1、字符类型的直接量写法
        //方式1：常规写法
        char c1='中';
        System.out.println((int) c1);
        System.out.println(Integer.toHexString(c1));
        //方式2：16进制
        char c2='\u4e2d';
        System.out.println(c1);
        System.out.println(c2);
        //方式3:整数直接量
        char c3=20013;
        System.out.println(c3);

        //最常用使用方式
        char m1='A';
        //16进制
        char m2='\u0041';
        //整数直接量写法
        char m3=65;

        //2、转义字符

        //回车符
        char n1='\r';
        System.out.println("好好学习\n\"Java编程语言\"");
        //系统编码问题造成的，\r是回车，直接移动到行首位，\n是换行，所以好好学习被覆盖掉了
        System.out.println("好好学习\r天天向上");
        System.out.println("\r");

        // /t 用于调整对齐
        System.out.println("name\t\tsex\t\tage");
        System.out.println("----\t\t----\t----");
        System.out.println("zhangsan\t男\t\t30");
        System.out.println("lisi\t\t男\t\t25");


    }
}
