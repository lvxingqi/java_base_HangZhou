package com.lzlgdx.day0809;

/**
 * @className: Student.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/09 下午 03:14
 * @Description:
 */
public class Student extends Person{

    public double score;

    public void study(){
        System.out.println(score);
        System.out.println(name);
        System.out.println(age);
        eat();
    }
}
