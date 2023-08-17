package com.lzlgdx.day0815;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 上午 11:23
 * @since jdk1.0
 */
public class StringA {
    public static void main(String[] args) {
        /*String s="abc";
        String s1=s;
        System.out.println(s==s1);
        s=s+"def";
        System.out.println(s);
        System.out.println(s1);*/

        String str1="ab";
        String str2="a"+"b";
        System.out.println(str1==str2);
        String str3="a";
        String str4="b";
        String str5=str3+str4;
        System.out.println(str1==str5);

    }
}
