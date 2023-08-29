package com.lzlgdx.day0829;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 03:25
 * @Description
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println("答：我是查水表的"+i);
        }
    }
}
