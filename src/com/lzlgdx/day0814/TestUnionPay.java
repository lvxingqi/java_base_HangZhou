package com.lzlgdx.day0814;

import org.junit.Test;

import java.util.Scanner;

/**
 * @version java基础.1.0
 * @Description: 测试类
 * @author: 吕星琪
 * @Date: 2023/8/14 下午 03:17
 */
public class TestUnionPay {
    @Test
    public void test(){
        ICBCImpl icbc=new ICBCImpl();
        double money=icbc.getMoney();
        String pwd=icbc.getPwd();
        System.out.println(icbc);
        icbc.setMoney(2000);
        icbc.setPwd("123456");
    }
    @Test
    public void test1(){

    }

    public static void main(String[] args) {
        ICBCImpl icbc=new ICBCImpl(1000,"123456");
        System.out.println(icbc);
        Scanner sc=new Scanner(System.in);
        String inputPwd=sc.next();
        if (inputPwd.equals(icbc.getPwd())){
            System.out.println("请输入取款金额");
            double num=sc.nextDouble();
            if (icbc.drawMoney(num)){
                System.out.println("可以取钱");
                System.out.println("卡内余额："+icbc.getMoney());
            }else {
                System.out.println("金额不足");
            }
        }
    }
}
