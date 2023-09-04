package com.lzlgdx.day0904.reflection;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 上午 09:39
 * @Description
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println("姓名"+name);
        System.out.println("年龄"+age);
    }

    public void say(String msg){
        System.out.println(name+"说"+msg);
    }
}
