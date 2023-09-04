package com.lzlgdx.day0904.thread;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 下午 03:38
 * @Description
 * 同步代码块
 * 有效的缩小线程同步的范围，在可以保证安全的情况下，提高并发效率
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop=new Shop();
        Thread sj=new Thread(){
            @Override
            public void run() {
                shop.buy();
            }
        };

        Thread hlw=new Thread(){
            @Override
            public void run() {
                shop.buy();
            }
        };
        sj.setName("蛇精");
        hlw.setName("葫芦娃");
        sj.start();
        hlw.start();
    }
}
class Shop{
    /*
    * 同步方法，挑衣服和试衣服不能同时进行
    * */
    public void buy(){
        Thread t=Thread.currentThread();
        System.out.println(t.getName()+"开始挑衣服");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (this){
            System.out.println(t.getName()+"开始进入试衣间试衣服");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(t.getName()+"离开试衣间结账走人");
        }
    }
}
