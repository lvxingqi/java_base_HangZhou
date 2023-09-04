package com.lzlgdx.day0904.thread;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 下午 02:07
 * @Description
 * 线程守护
 * 只发生于两个线程之间，又称为后台线程。
 * 默认情况下每条线程都是普通线程。
 * 只有调用setDaemon()方法之后，才能将一个线程
 * 设置为守护线程
 * 普通线程执行完任务序列内容后终止运行，守护线程除了
 * 正常任务结束方式以外，在设置他为守护线程的线程结束时，
 * 这个守护线程也会结束。
 */
public class ThreadDaemon {
    public static void main(String[] args) {
        //普通线程
        Thread rose=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<3;i++){
                    try {
                        System.out.println("rose:let me go");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        //守护线程
        Thread jack=new Thread(){
            @Override
            public void run() {
                while(true){
                    System.out.println("jack:you jump, i jump");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        rose.start();
        jack.setDaemon(true);
        jack.start();

    }
}
