package com.lzlgdx.day0904.thread;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 下午 04:12
 * @Description
 * 互斥锁
 * 当一个类的两个方法不能同时运行时，就可以
 * 使用synchronized修饰它们，形成互斥锁，
 * 这样即使多个线程并发调用这两个方法，也不能同时运行
 *
 * 两个方法要同时添加synchronized形成互斥锁
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Foo f=new Foo();
        Thread t1= new Thread(f::abc);

        Thread t2= new Thread(f::xyz);
        t1.setName("孙悟空的气管");
        t2.setName("孙悟空的食管");
        t1.start();
        t2.start();
    }
}
class Foo{
    public synchronized void abc(){
        Thread t= Thread.currentThread();
        System.out.println(t.getName()+"开始吸气");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t.getName()+"开始呼气");
    }

    public synchronized void xyz(){
        Thread t= Thread.currentThread();
        System.out.println(t.getName()+"开始吞咽");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(t.getName()+"吞咽完成");
    }
}
