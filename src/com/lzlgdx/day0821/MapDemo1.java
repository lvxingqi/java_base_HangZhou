package com.lzlgdx.day0821;

import java.util.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 下午 03:16
 * @since jdk1.0
 */
public class MapDemo1 {

    public static void main(String[] args) {
        Student s1=new Student(1,"张三");
        Student s2=new Student(2,"张思");
        HashMap<Student,Integer> scores=new HashMap<>();
        scores.put(s1,90);
        scores.put(s2,95);
        System.out.println(scores.get(s1));
        System.out.println(scores.get(s2));
        System.out.println(scores);
        //同样的一个人得不到正确的分数，输出null
        Student s3=new Student(1,"张三");
        System.out.println(scores);

        Integer i=scores.get(s3);
        System.out.println(i);
    }
}
