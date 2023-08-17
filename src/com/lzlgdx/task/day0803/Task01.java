package com.lzlgdx.task.day0803;

import com.lzlgdx.Utils;

import java.util.Date;

/**
 * @className: Task01.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/03 上午 10:20
 * @Description:
 */
public class Task01 {
    public static void print(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        //获取系统时间-小时
        Date date = new Date();
        int now=date.getHours();
        print("输入行驶千米数");
        double length=Utils.getScannerInstance().nextDouble();
        print("输入等待时间秒数");
        int wait=Utils.getScannerInstance().nextInt();
        //打车的总费用
        double totalPrice=0.0;
        //基本里程费用
        double basePrice=0.0;
        //超千米空驶费
        double emptyPrice=0.0;
        //等待费用
        double waitPrice=0.0;

        //1、计算基本里程费
        if (now>=7&&now<23) {
            //白天打车
            basePrice=10;
            if (length>=3){
                basePrice=10+(int)(length-3+1)*2;
            }
        }else {
            //夜间打车
            basePrice=12;
            if (length>=3){
                basePrice=12+(int)(length-3+1)*2.3;
            }
        }
        //2、计算超千米空驶费
        if (length>=15){
            emptyPrice=(int)(length-15+1);
        }
        //3、计算等待费
        waitPrice=wait/300*2;
        //计算总费用
        totalPrice=basePrice+emptyPrice+waitPrice;
        print(totalPrice);

    }
}
