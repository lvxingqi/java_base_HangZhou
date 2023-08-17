package com.lzlgdx.day0816;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 11:28
 * @since jdk1.0
 */
public class Student {
    String name; //姓名
    String gender; //性别
    double salary; //工资

    public Student(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null||getClass()!=obj.getClass()) return false;
        Student student=(Student) obj;
        return student.name.equals(this.name);
    }
}
