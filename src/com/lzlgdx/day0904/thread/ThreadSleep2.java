package com.lzlgdx.day0904.thread;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 上午 11:32
 * @Description
 */
public class ThreadSleep2 {
    public static void main(String[] args) throws InterruptedException {
        Thread princess=new Thread(){
            @Override
            public void run() {
                System.out.println("被巫师诅咒，一直睡觉");
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    //提前中断
                    System.out.println("公主醒来了...");
                }
                System.out.println("王子和公主过上了幸福的生活");
            }
        };

        Thread prince=new Thread(){
            @Override
            public void run() {
                System.out.println("王子开始亲公主");
                for (int i=0;i<3;i++){
                    System.out.println("么么哒");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("好了");
                //唤醒公主线程
                princess.interrupt();
            }
        };
        princess.start();
        prince.start();
    }
}
