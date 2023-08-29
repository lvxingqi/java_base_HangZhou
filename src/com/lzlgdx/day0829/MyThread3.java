package com.lzlgdx.day0829;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 04:18
 * @Description
 */
public class MyThread3 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println("问：你是谁啊"+i);
        }
    }
}
