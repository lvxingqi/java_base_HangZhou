package com.lzlgdx.day0821;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 下午 02:43
 * @since jdk1.0
 */
public class Student {
    private int id;
    //重写此类的equals和hashcode方法


    @Override
    public boolean equals(Object o) {
        System.out.println("equals方法执行了");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id ;
    }

    @Override
    public int hashCode() {
        int code=Objects.hash(id);
        System.out.println("hashcode执行了"+code);
        return code;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
