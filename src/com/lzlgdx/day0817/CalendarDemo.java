package com.lzlgdx.day0817;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/17 上午 10:41
 * @since jdk1.0
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //获取Calendar类方式
        //格力高历法
        Calendar calendar=Calendar.getInstance();
        //toString()方法很有用，可以输出字段的默认值
        System.out.println(calendar);
        System.out.println(calendar.getTime());

        long time=1692240298067L;
        Date date=new Date();
        date.setTime(time);
        System.out.println(date);
        Date d1=calendar.getTime();
        System.out.println(d1);

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.DAY_OF_MONTH,20);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,5);
        System.out.println(calendar.getTime());
        calendar.setTime(date);
        System.out.println(calendar.getTime());
    }
}
