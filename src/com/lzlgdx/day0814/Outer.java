package com.lzlgdx.day0814;

/**
 * @version java基础.1.0
 * @Description: 外部类与内部类
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:22
 */
public class Outer {
    /**将内部类作为外部类的成员属性定义出来*/
    private static Inner inner;
    /**私有的成员变量*/
    private int time;

    private static Inner1 inner1;

    /**静态变量*/
    private static int a;
    public Outer(){
        //首先要实例化inner对象，否则报空指针异常
        inner=new Inner();
        inner.age++;
        //静态内部类可以直接使用类名.变量调用
        Inner1.b=0;
    }
    public void show(){
        time++;
        System.out.println("show..."+time);
    }

    public static void show1(){
        inner.showInner();
    }

    /**内部类*/
    public class Inner{
        //不支持非静态内部类中声明静态变量
       /* private static int a;*/
        public int age;
        public void timeInc(){
            System.out.println("age="+age);
            time++;
            System.out.println("timeInc..."+time);
            show();
        }
        public void showInner(){
            a++;
            show1();
        }
    }

    public static class Inner1{
        /**静态内部类中可以声明静态变量*/
        public static int b;
        public void method01(){
            //静态内部类中不可以直接访问外部类中的成员变量和方法（因为没有static修饰）
            //time++;
            //show();
            a++;
            show1();
        }

    }

}
