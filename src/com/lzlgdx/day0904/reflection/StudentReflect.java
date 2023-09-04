package com.lzlgdx.day0904.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 上午 09:42
 * @Description
 */
public class StudentReflect {
    public static void main(String[] args) {
        Class cls= Student.class;
        System.out.println(cls.getName());
        Field[] fields=cls.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field.getName());
        }
        Method[] methods=cls.getDeclaredMethods();
        for (Method method:methods){
            System.out.println(method.getName());
        }
    }
}
