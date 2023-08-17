package com.lzlgdx.day0803;

import com.lzlgdx.Utils;

/**
 * @className: Bank.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/03 下午 02:16
 * @Description:
 */
public class Demo01 {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        /*int week = 1;
        switch (week) {
            case 1:
                print("星期一");
                break;
            case 2:
                print("星期二");
                break;
            case 3:
                print("星期三");
                break;
            default:
                print("无效数字");
        }*/

        int week = Utils.getScannerInstance().nextInt();
        if (week == 1 || week == 2 || week == 3
                || week == 4 || week == 5) {
            print("工作日");
        } else if (week == 6 || week == 7) {
            print("休息日");
        } else {
            print("无效数字");
        }

        switch (week) {
            case 1: case 2: case 3: case 4: case 5:
                print("工作日");
                break;
            case 6: case 7:
                print("休息日");
                break;
            default:
                print("无效数字");

        }
    }
}
