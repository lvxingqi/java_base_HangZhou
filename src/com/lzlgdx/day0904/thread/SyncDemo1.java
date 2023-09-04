package com.lzlgdx.day0904.thread;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 下午 03:08
 * @Description
 * 多线程并发安全问题对用一个临界资源操作时，可能由于切换
 * 时机不确定导致程序的设计的执行方式出现混乱，从而引发程序
 * 业务错误甚至瘫痪
 * 同步锁可以解决这个问题
 */
public class SyncDemo1 {
    public static void main(String[] args) {
        Bank bank=new Bank();
        int balance=5000;
        Thread weChat=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<8;i++){
                    bank.getMoney();
                }
            }
        };
        weChat.setName("微信");
        Thread aliPay=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<8;i++){
                    bank.getMoney();
                }
            }
        };
        aliPay.setName("支付宝");
        aliPay.start();
        weChat.start();
    }
}
class Bank{
    private Integer balance=37000;
    public synchronized void getMoney(){
        if (balance>=5000){
            System.out.println(Thread.currentThread().getName()+"成功取到5000元");
            balance-=5000;
        }
        System.out.println(Thread.currentThread().getName()+"银行还剩"+balance+"元");
    }
}
