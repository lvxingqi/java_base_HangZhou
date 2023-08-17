package com.lzlgdx.day0803;

import com.lzlgdx.Utils;
import com.lzlgdx.practice.day0802.Practice01;

/**
 * @className: Demo02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/03 下午 03:23
 * @Description:
 */
public class Demo02 {
    public static void print(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        print("请输入年份");
        int year = Utils.getScannerInstance().nextInt();
        print("请输入月份");
        int month=Utils.getScannerInstance().nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                print("31天");
                break;
            case 4: case 6: case 9: case 11:
                print("30天");
                break;
            case 2:
                boolean flag= Practice01.
                        judgeLeapYearOrOrdinaryYear(year);
                if (flag){
                    print("29天");
                }else {
                    print("28天");
                }
                break;
            default:
                print("非法月份");
        }
    }
}
