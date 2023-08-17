package com.lzlgdx.practice.day0802;

import com.lzlgdx.Utils;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @className: Practice02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/02 下午 03:55
 * @Description: 练习2: 模拟柜台收银的程序
 * 要求:从控制台输入商品的单价、数量和付钱的金额
 * 如果总消费金额满500元，打8折
 * 如果付钱的金额够了，输出商品消费了多少，找零了多少，
 * 如果付钱的金额不够，输出商品消费了多少，还差多少，
 */

/**未处理运算错误问题（最小精度）*/

public class Practice02 {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void cashierProcess() {
        print("请输入商品的单价");
        double goodPrice = Utils.getScannerInstance().nextDouble();
        print("请输入商品的数量");
        int number = Utils.getScannerInstance().nextInt();
        print("请输入付钱的金额");
        double realPrice = Utils.getScannerInstance().nextDouble();
        double totalPrice = goodPrice * number;
        if (totalPrice >= 500) {
            totalPrice = totalPrice * 0.8;
        }
        double difference = realPrice - totalPrice;
        if (difference > 0) {
            print("共消费" + totalPrice + "元，" + "找零" +
                    difference + "元");
        } else {
            print("共消费" + totalPrice + "元，" + "您还差" +
                    Math.abs(difference) + "元");
        }
    }

    public static void main(String[] args) {
        cashierProcess();
    }
}
