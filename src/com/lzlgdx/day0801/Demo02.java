package com.lzlgdx.day0801;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @className: Demo02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/01 上午 10:08
 * description:float类型和double类型的演示
 */
public class Demo02 {
    public static void main(String[] args) {
        //1、浮点类型通常使用double类型
        double pi=3.14;
        System.out.println(pi*10);
        //2、浮点类型直接量的两种写法
        //方式1：通常写法
        double d1=125.0;
        System.out.println(d1);

        //方式2：科学计数法
        //1.25*10^2
        double d2=1.25E2;
        System.out.println(d2);
        //3、float类型
        //float f1=3.14;    编译错误
        //3.14直接量默认是double类型，f1是float类型
        float f2=3.14f;

        //4、浮点类型运算会出现舍入误差
        double money=3.0;
        double price=2.9;
        System.out.println(money-price);
        //BigDecimal解决运算结果不精确的问题
        BigDecimal a=new BigDecimal(String.valueOf(money));
        BigDecimal b=new BigDecimal(String.valueOf(price));
        BigDecimal c=a.subtract(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
