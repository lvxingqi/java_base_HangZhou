package com.lzlgdx.day0811;/**
 * Description:
 * Author: 20141
 * Creation Date: 2023/8/11
 *
 * @version java基础
 */

/**
 * @version java基础.1.0
 * @Description: final关键字
 * @author: 吕星琪
 * @Date: 2023/8/11 上午 10:35
 */
public class FinalDemo {
    public static void main(String[] args) {

    }
}
/**
 * final 修饰变量
 * 1）修饰成员变量：有两种方式初始化
 *      1.1）声明变量的同时直接初始化
 *      1.2)在构造方法里面进行赋值
 * 2）修饰局部变量
 *      2.1)先声明，后赋值，
 *      2.2）声明的同时赋值
 *      只能赋值一次
 **/
class Coo{
    public final int a=10;
    public final int b;

    public Coo(){
        b=20;
    }

    public void test(){
        final int b;
        b=20;
        System.out.println(b);
    }
}
/**
 * final修饰的方法不可被重写
 **/
class Doo{
    public void show(){}
    public final void study(){
        System.out.println("Doo...study");
    }
}
class Eoo extends Doo{
    @Override
    public void show(){

    }

}
/**
 * final修饰的类不能被继承
 **/
final class Foo{}
//class Goo extends Foo{}

class Hoo{}
final class Ioo extends Hoo{}

/**static final修饰的变量成为常量，只能声明时赋值*/
class Joo{
    public static final int AGE =10;
    public Joo(){
        //AGE=20;
        //常量不可以再修改
    }
}