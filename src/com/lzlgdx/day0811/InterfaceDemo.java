package com.lzlgdx.day0811;

/**
 * @version java基础.1.0
 * @Description: 接口
 * @author: 吕星琪
 * @Date: 2023/8/11 下午 03:39
 */
public class InterfaceDemo {
    int i = 100;

    public void print() {
        System.out.println(50);
    }

    public static void main(String[] args) {
        A a = new A();
        InterfaceDemo demo = new InterfaceDemo();
        a.make();
        a.show();
        System.out.println(demo.i);
        demo.print();
    }
}

class H extends InterfaceDemo {
    int i = 200;

    @Override
    public void print() {
        System.out.println(300);
    }
}

interface Inter1 {
    /**
     * 常量
     */
    public static final int NUM = 100;

    /**
     * 抽象方法
     */
    public abstract void show();
    //接口中的方法全是抽象方法，成员变量全是常量
    //在接口中，修饰常量的public static final 全部可以省略

    int AGE = 30;
    double PI = 3.1415926;

    default void make() {
        System.out.println("this is interface's function make()");
    }

    private static void haha() {
        System.out.println("你好！");
    }

    static void study() {
        haha();
        System.out.println("我正在学习...8月11号");
    }

    void say();

    int sum(int a, int b);
}

class A implements Inter1 {
    @Override
    public void show() {
        System.out.println("this is A.show()");
    }

    @Override
    public void say() {

    }

    @Override
    public int sum(int a, int b) {
        return 0;
    }
}

interface Inter2 {
    /**
     * 实现了public abstract
     */
    void a();
}

abstract class Loo {
}

class Moo extends Loo implements Inter1, Inter2 {
    @Override
    public void show() {

    }

    @Override
    public void say() {

    }

    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public void a() {

    }
}

/**
 * 接口与接口之间的继承
 */
interface Inter5 {
    void a();
}

interface Inter6 extends Inter5, Inter7 {
    void b();
}

interface Inter7 {
}

class Noo implements Inter6 {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}

