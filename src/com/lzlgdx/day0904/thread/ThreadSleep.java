package com.lzlgdx.day0904.thread;

import java.util.Scanner;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 上午 11:19
 * @Description
 */
public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        /*Thread thread=new Thread(){
            @Override
            public void run() {
                System.out.println("睡了700ms");
            }
        };
        System.out.println("开始");
        Thread.sleep(700);
        thread.start();*/

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=sc.nextInt();
        while (num>=0){
            Thread.sleep(2000);
            System.out.println(num--);
        }

    }
}
