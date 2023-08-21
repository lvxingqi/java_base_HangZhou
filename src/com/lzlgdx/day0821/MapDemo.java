package com.lzlgdx.day0821;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 上午 11:48
 * @since jdk1.0
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<>();
        student.put(1,"张三");
        student.put(2,"李四");

        String str=student.put(3,"王五");
        str=student.put(3,"王麻子");
        System.out.println(str);
        System.out.println(student);
    }
}
