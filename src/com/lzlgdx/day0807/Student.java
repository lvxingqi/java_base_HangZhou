package com.lzlgdx.day0807;

import javax.swing.plaf.PanelUI;
import java.util.Date;

/**
 * @className: Student.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/07 下午 04:04
 * @Description:
 */
public class Student {
    public int id;
    public String name;
    public int age;
    public String address;
    public boolean flag;
    public Date birthday;


    public void study(){
        System.out.println(name+"在学习...");
    }

    public void sayHi(){
        System.out.println("大家好，我叫"+name+",今年"+age+"岁了,家在"+address);
    }
}
