package com.lzlgdx.day0808;

/**
 * @className: Bank1.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/08 上午 09:55
 * @Description:
 */
public class Bank1 {
    /**
     description:1、现金业务
     *
     * @param money 钱
     * @return void
     */
    public void pay(double money){
        System.out.println("现金业务");
    }
    /**
     description:2、信用卡业务
     *
     * @param cardId 信用卡id
     * @param pwd 信用卡 密码
     * @return void
     */
    public void pay(int cardId,int pwd){
        System.out.println("信用卡业务");
    }

    /**
     description:3、支票业务
     *
     * @param name 名字
     * @param money 钱
     * @return void
     */
    public void pay(String name,double money){
        System.out.println("支票业务");
    }
}
