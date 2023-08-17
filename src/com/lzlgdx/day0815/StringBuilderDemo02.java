package com.lzlgdx.day0815;

import com.lzlgdx.day0811.tetris.S;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 下午 04:40
 * @since jdk1.0
 */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        System.out.println(stringBuilder);

        stringBuilder=new StringBuilder("abc");
        System.out.println(stringBuilder);

        stringBuilder=stringBuilder.append("java").append("php")
                .append("python").append("sql");
        System.out.println(stringBuilder);
        stringBuilder.delete(0,3);
        System.out.println(stringBuilder);
        stringBuilder=stringBuilder.insert(0,"oracle");
        System.out.println(stringBuilder);

        stringBuilder=stringBuilder.replace(6,11,"hello");
        System.out.println(stringBuilder);

        /* 预定义字符
         . 任意一个字符
         \d 任意一个数字字符，相当于[0-9]
         \w 单词字符，相当于[a-zA-Z0-9]
         \s 空白字符
         \D 非数字字符 [^0-9]
         \S 非空白字符*/
        /*
        * 数量词
        * [0-9]? 表示0个或者1个
        * X? 表示0个或1个X
        * X* 表示0个或多个X
        * X+ 表示1个或多个X
        * X{n} 表示n个X
        * \d{11}或[0-9]{11} 表示11位电话号
        * X{n,} 表示n个到多个X(大于等于n个X)
        * X{n,m} 表示n个到m个X(n<=x<=m)*/





    }
}
