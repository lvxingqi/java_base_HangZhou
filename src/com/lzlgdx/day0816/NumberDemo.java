package com.lzlgdx.day0816;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 下午 03:54
 * @since jdk1.0
 */
public class NumberDemo {
    public static void main(String[] args) {
        Number a=1;
        Number b=12.6;
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        Object obj=new Object();

        int intVal=a.intValue();
        System.out.println(intVal);
        int doubleVal=b.intValue();
        System.out.println(doubleVal);
    }
}
