package com.lzlgdx.day0904.thread;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 下午 02:28
 * @Description
 * 线程插队 join()方法
 * join()方法是将一条线程的运行插入到另一条线程之前的操作
 * 被插队的线程进入阻塞状态，直到插队线程运行完毕之后阻塞
 * 状态才会被取消
 */
public class ThreadJoin {
    public static boolean isFinish=false;
    public static void main(String[] args) throws InterruptedException {

        //模拟下载图片的线程
        Thread dw=new Thread(){
            @Override
            public void run() {
                System.out.println("开始下载图片");
                for (int i=0;i<100;i++){
                    System.out.println("下载进度"+(i+1)+"%");
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("下载图片完成！");
            }
        };
        //模拟显示文字的线程
        Thread show=new Thread(){
            @Override
            public void run() {
                System.out.println("开始显示文字...");
                try {
                    Thread.sleep(2000);
                    System.out.println("文字显示完毕");
                    System.out.println("等待图片下载完毕...");
                    dw.join();
                    //当前线程被阻塞，等待线程运行完毕后阻塞取消
                    if (!isFinish){
                        throw new RuntimeException("加载图片失败");
                    }
                    System.out.println("show:开始显示图片");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        show.start();
        dw.start();
    }
}
