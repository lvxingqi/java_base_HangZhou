package com.lzlgdx.practice.day0802;

import com.lzlgdx.Utils;
import com.lzlgdx.practice.day0802.Practice01;

/**
 * @className: Practice04.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/02 下午 03:58
 * @Description:
 * 练习4:要求从控制台输入年份和月份，根据输入的年和月判断有几天
 * 31天: 1 3 5 7 8 10 12月
 * 30天: 4 6 9 11月
 * 平年的2月:28天
 * 闺年的2月: 29天
 */
public class Practice04 {
    public static void print(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        print("请输入年份");
        int year = Utils.getScannerInstance().nextInt();
        print("请输入月份");
        int month=Utils.getScannerInstance().nextInt();
        boolean flag= Practice01.
                judgeLeapYearOrOrdinaryYear(year);
        if (month<1||month>12){
            print("非法月份");
        } else if (month ==1||month == 3||month == 5
        ||month == 7 || month == 8 ||month == 10 || month == 12){
            print(year+"年"+month+"月有"+"31天");
        }else if (month==2){
            if (flag){
                print(year+"年"+month+"月有"+"29天");
            }else {
                print(year+"年"+month+"月有"+"28天");
            }
        }else {
            print(year+"年"+month+"月有"+"30天");
        }


    }
}
