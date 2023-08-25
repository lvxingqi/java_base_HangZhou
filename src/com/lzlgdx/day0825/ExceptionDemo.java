package com.lzlgdx.day0825;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 上午 09:22
 * @since jdk1.0
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        dev(10,2);
    }

    public static void dev(int a,int b){
        if (b==0){
            System.out.println("b不能为0");
            throw new ArithmeticException();
        }else {
            System.out.println(a/b);
        }
    }
}
