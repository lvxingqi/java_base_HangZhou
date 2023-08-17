package com.lzlgdx.day0816;

import com.lzlgdx.day0814.Cat;

import java.util.Arrays;
import java.util.Date;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 11:32
 * @since jdk1.0
 */
public class TestObject {
    public static void main(String[] args) {
        Student stu=new Student("张三");
        Object obj=new Student("张三");
        Object date=new Date();

        System.out.println(stu.equals(obj));

        System.out.println(Arrays.toString(obj.getClass().getClasses()));

        System.out.println(stu.equals(null));
        Student student=new Student("李四");
        Object cat=new Cat();
        System.out.println(stu.equals(student));
        System.out.println(stu.equals(cat));
    }
}
