package com.lzlgdx.day0816;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 09:38
 * @since jdk1.0
 */
public class RegDemo {
    public static void main(String[] args) {
        //邮编
        String regEx="^\\d{6}$";
        System.out.println("aaa".matches(regEx));
        //电话号
        String str="^(\\+86|0086)?\\s*\\d{11}$";
        String str2="12345678901";
        System.out.println(str2.matches(str));

        //任意个数汉字
        String regZh="^[\\u4e00-\\u9fa5]+$";
        System.out.println("你好".matches(regZh));

        //邮箱
        String regMail="^[a-zA-Z0-9_-]+@(.[a-zA-Z0-9_-]+)*.com}$";
        System.out.println("nihao@weixin.a.com".matches(regMail));

    }
}
