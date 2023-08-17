package com.lzlgdx.day0807;

import java.io.Console;

/**
 * @className: TestStu.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/07 下午 04:46
 * @Description:
 */
public class TestStu {
    public static void main(String[] args) {
        Student stu=new Student();
        System.out.println(stu.name);
        stu.name="张三";
        System.out.println(stu.name);
        Student stu1=stu;
        System.out.println(stu.name);
        Student stu2=new Student();
        System.out.println(stu2.name);

        //空指针异常
        /*stu2=null;
        System.out.println(stu2.name);*/
    }
}
