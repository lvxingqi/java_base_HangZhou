package com.lzlgdx.day0808;

/**
 * @className: Bank.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/08 上午 09:31
 * @Description:
 * 方法的重载
 */
public class Bank {
    /**
    description:1、现金业务
    *
     * @param money 钱
    * @return void
    */
    public void payByCash(double money){
        System.out.println("现金业务");
    }
    /**
    description:2、信用卡业务
    *
     * @param cardId 信用卡id
     * @param pwd 信用卡 密码
    * @return void
    */
    public void payByCard(int cardId,int pwd){
        System.out.println("信用卡业务");
    }

    /**
    description:3、支票业务
    *
     * @param name 名字
     * @param money 钱
    * @return void
    */
    public void payByCheck(String name,double money){
        System.out.println("支票业务");
    }

}
