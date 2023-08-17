package com.lzlgdx.day0809;

import java.util.jar.Pack200;

/**
 * @className: Teacher.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/09 下午 03:15
 * @Description:
 */
public class Teacher extends Person {

    public double salary;

    @Override
    public void eat(){

    }

    /**
    description:工作的行为
    *
    * @return void
    */
    public void work(){
        System.out.println(name);
        eat();
    }
}
