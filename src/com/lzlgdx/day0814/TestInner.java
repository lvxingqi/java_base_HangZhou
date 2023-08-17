package com.lzlgdx.day0814;

/**
 * @version java基础.1.0
 * @Description: 测试内部类
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 09:35
 */
public class TestInner {
    public static void main(String[] args) {
        /**创建 外部类Outer*/
        Outer outer=new Outer();
        outer.show();
        /**创建内部类*/
//        Outer.Inner inner=new Outer().new Inner();
        outer.new Inner().timeInc();

        //只有一个new关键字
        Outer.Inner1 inner1=new Outer.Inner1();
        inner1.method01();
    }
}
