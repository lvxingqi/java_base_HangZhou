package com.lzlgdx.day0816;

import java.util.Date;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 下午 05:29
 * @since jdk1.0
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.getDate());
        System.out.println(1970+date.getTime()/1000/60/60/24/365);

        long t=date.getTime();
        long timeDifference=t+24*60*60*1000;
        date.setTime(timeDifference);
        System.out.println(date);

    }
}
