package com.lzlgdx.day0829;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 03:26
 * @Description
 */
public class TestThread {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
/*        MyThread2 myThread2=new MyThread2();
        myThread.start();
        myThread2.start();*/
        MyThread3 myThread3=new MyThread3();
        Thread thread=new Thread(myThread3);
        thread.start();
        myThread.start();
    }
}
