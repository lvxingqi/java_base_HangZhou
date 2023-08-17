package com.lzlgdx.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.function.Supplier;

/**
 * @className: Demo02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/02 下午 01:59
 * @Description:
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String value();
}
@MyAnnotation("Hello,Annotation")
public class Demo02 {
    public static void printSum(int a,int b,Lambda lambda){
        lambda.printSum(a,b);
    }
    public static void main(String[] args) {
        Lambda lambda=(a, b)-> a+b;
        int b=lambda.printSum(100,200);


        //简化版本
        printSum(2,3, Integer::sum);
        Supplier<String> str=String::new;

        MyAnnotation an=Demo02.class.getAnnotation(MyAnnotation.class);
        String annotationValue=an.value();
        System.out.println(annotationValue);
    }
}
