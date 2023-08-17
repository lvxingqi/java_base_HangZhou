package com.lzlgdx.practice.day0802;

import com.lzlgdx.Utils;

/**
 * @className: Practice03.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/02 下午 03:57
 * @Description:
 * 练习3：从控制台输入三个整数，找出最大值并输出 (2种方法思路-if语句)
 */
public class Practice03 {
    public static void print(Object obj) {
        System.out.println(obj);
    }
    public static int getMaxValue1(int a,int b,int c){
        if (a>b&&a>c){
            return a;
        }else if (b>c){
            return b;
        }else {
            return c;
        }
    }
    public static int getMaxValue2(int a,int b,int c){
        int max =a;
        if (max<b){
            max=b;
        }
        if (max<c){
            max=c;
        }
        return max;
    }
    public static void main(String[] args) {
        print("最大数是"+getMaxValue1(9,8,-2));
        print("最大数是"+getMaxValue2(8,2000,0));
    }


}
