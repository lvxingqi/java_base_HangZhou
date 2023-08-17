package com.lzlgdx.day0801;

import java.util.Scanner;

/**
 * @className: Demo06.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/01 下午 03:55
 * @Description:
 * 演示Scanner工具类的使用
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.println("输入-1退出");
        Scanner input = new Scanner(System.in);
        int count=0;
        while (count!=-1){
            count = input.nextInt();
            System.out.println("输入数字为"+count);
        }

    }
}
