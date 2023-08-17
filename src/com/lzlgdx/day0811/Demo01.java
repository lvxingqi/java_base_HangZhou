package com.lzlgdx.day0811;/**
 * Description:
 * Author: 20141
 * Creation Date: 2023/8/11
 *
 * @version java基础
 */

/**
 * @version java基础.1.0
 * @Description: static关键字修饰成员变量
 * @author: 吕星琪
 * @Date: 2023/8/11 上午 09:29
 */
public class Demo01 {
    public static void main(String[] args) {
        Aoo a1=new Aoo();
        //a=1 b=1
        a1.show();
        Aoo a2=new Aoo();
        //a=1 b=2
        a2.show();
    }
}
class Aoo{
    public int a;
    public static int b;

    public Aoo(){
        a++;
        b++;
    }

    public void show(){
        System.out.println("a="+a);
        System.out.println("b="+b);
        study();
    }

    public static void study(){
        // 无法访问非静态变量或方法
        // a=10;
        b=20;
    }
}
