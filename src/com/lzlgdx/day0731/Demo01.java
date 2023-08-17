package com.lzlgdx.day0731;

/***
description:演示变量的基本使用
*
 * @author 20141
 * @return +
*/
public class Demo01 {
    public static void main(String[] args) {
        //1.2 变量的声明
        //变量名+变量类型
        //1.4 一行语句声明多个同类型的变量
        /**分3行定义变量**/
//    int a;
//    int b;
        int c;
        /**1行定义变量*/
        int d,e,f;

        /**变量名的命名规则*/
        int ab12_$_$;
        int $$$$12;

        // int a_^^; 编译错误
//    int 1212abc; 编译错误

        int age;
        int maxAge;
        int testMaxAge;

        //1.6变量的初始化
        //方式1：在变量声明时初始化
        int a=10;
        int b=100;

        //方法2：在第一次使用变量前初始化
        int c2;
        c2=100;
        System.out.println(c2);
    }
}
