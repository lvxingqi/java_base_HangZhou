package com.lzlgdx.day0810;/**
 * Description:
 * Author: 20141
 * Creation Date: 2023/8/10
 *
 * @version java基础
 */

/**
 * @version java基础.1.0
 * @Description: 测试访问控制符的范围
 * @author: 吕星琪
 * @Date: 2023/8/10 下午 05:14
 */
public class Demo05 {
    public static void main(String[] args) {
        Too t=new Too();
        t.a=5;
        t.c=6;
        t.d=10;
    }
}
class Too{
    /**
     * 任何地点可访问a
     */
    public int a;
    /**
     * 内部可访问b
     */
    private int b;
    /**
     * 默认 包内可访问
     */
    int c;
    protected int d;
}

class Moo extends Too{
    public void setC(){
        c=200;
    }
}
