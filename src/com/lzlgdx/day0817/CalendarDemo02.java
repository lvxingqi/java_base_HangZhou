package com.lzlgdx.day0817;

import java.util.Calendar;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/17 上午 11:19
 * @since jdk1.0
 */
public class CalendarDemo02 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);

        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        day=calendar.get(Calendar.DATE);

        System.out.println(year+"-"+month+"-"+day);
    }
}
