package com.lzlgdx.day0808;

/**
 * @className: TestBank.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/08 上午 09:40
 * @Description:
 */
public class TestBank {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.payByCash(300.2);
        bank.payByCard(1001,123456);
        bank.payByCheck("张三",10.2);

        Bank1 bank1=new Bank1();
        bank1.pay(300.2);
        bank1.pay(1001,123456);
        bank1.pay("张三",10.2);
    }
}
