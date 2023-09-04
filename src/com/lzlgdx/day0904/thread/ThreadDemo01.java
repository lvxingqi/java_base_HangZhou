package com.lzlgdx.day0904.thread;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 上午 11:08
 * @Description
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        Thread min=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<50;i++){
                    System.out.println("min");
                }
            }
        };

        Thread max=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<50;i++){
                    System.out.println("max");
                }
            }
        };

        Thread normal=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<50;i++){
                    System.out.println("normal");
                }

            }
        };

        //设置线程优先级,最大10，最小1,设置优先级并不可靠
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);

        min.start();
        max.start();
        normal.start();
        //线程启动后，由操作系统决定执行时机，优先级的值仅作为参考
    }
}
