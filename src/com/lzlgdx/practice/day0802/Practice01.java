package com.lzlgdx.practice.day0802;

import com.lzlgdx.Utils;

import java.util.Scanner;

/**
 * @className: Practice01.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/02 下午 03:50
 * @Description:
 * 练习1:要求从控制台输入一个年份，判断该年是平年还是闺年
 * 平年365天 2月28天 闺年 366天 2月 29天
 * 判断闰年的公式
 * 1)能被4整除，并且不能被100整除的年
 * 2)能被400整除的年
 */
public class Practice01 {
    public static boolean judgeLeapYearOrOrdinaryYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void main(String[] args) {
        System.out.println("请输入一个年份");
        int year=Utils.getScannerInstance().nextInt();
        if (judgeLeapYearOrOrdinaryYear(year)){
            System.out.println("是闰年");
        }else {
            System.out.println("是平年");
        }
    }
}
