package com.lzlgdx.day0904.reflection;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 上午 09:12
 * @Description
 * 反射机制
 * 动态机制，允许我们在程序运行期间再确定对象的实例化
 * 以及方法和属性的调用
 */
public class RefDemo {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        //类名.class
        Class cls=String.class;
        //对象.getClass();
        cls="acd".getClass();
        //Class.forName("全类名");
        cls=Class.forName("com.lzlgdx.fish.Fish");

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入全类名");
        String className=sc.nextLine();
        cls=Class.forName(className);
        System.out.println(cls.getName());
        System.out.println(cls.getMethods().length);
        System.out.println(Arrays.toString(cls.getMethods()));
    }
}
