package com.lzlgdx.day0818;

import com.lzlgdx.day0811.tetris.S;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 上午 11:48
 * @since jdk1.0
 */
public class Student<T> {
    public boolean add(T t){
        return false;
    }
    public Student<T> get(int index){
        return null;
    }

    public static void main(String[] args) {
        Student<String> student=new Student<>();
        student.add("q");
    }
}
