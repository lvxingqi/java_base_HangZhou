package com.lzlgdx.day0829;

import java.util.Date;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 04:48
 * @Description
 */
public class DateDemo {
    public static void main(String[] args) {
        DateThread thread=new DateThread();
        thread.start();
    }
}

class DateThread extends Thread{
    @Override
    public void run() {
        Date date=new Date();
        while (true){
                date.setTime(System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }

            System.out.println(date);
        }
    }
}
