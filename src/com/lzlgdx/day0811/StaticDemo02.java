package com.lzlgdx.day0811;/**
 * Description:
 * Author: 20141
 * Creation Date: 2023/8/11
 *
 * @version java基础
 */

/**
 * @version java基础.1.0
 * @Description: static块
 * @author: 吕星琪
 * @Date: 2023/8/11 上午 10:21
 */
public class StaticDemo02 {
    public static void main(String[] args) {
        Boo b1=new Boo();
        Boo b2=new Boo();
        Boo b3=new Boo();
    }
}
class Boo{
    /* static块*/
    static {
        System.out.println("Load...Boo.class");
    }
    public Boo(){
        System.out.println("无参构造...");
    }
}
