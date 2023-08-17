package com.lzlgdx;

import java.util.Scanner;

/**
 * @className: Utils.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/02 下午 03:40
 * @Description:
 * 通用方法集合
 */
public class Utils {
    /**
    description:返回Scanner的实例，此实例从键盘获取输入
    *
     * @return java.util.Scanner
    */
    public static Scanner getScannerInstance() {
        return new Scanner(System.in);
    }
}
