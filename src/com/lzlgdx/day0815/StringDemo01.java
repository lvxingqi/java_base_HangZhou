package com.lzlgdx.day0815;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/15 上午 11:53
 * @since jdk1.0
 */
public class StringDemo01 {
    public static void main(String[] args) {
        /*String a="123ddd";
        System.out.println(a.length());

        String str="i can because i 1 think i can!";
        int index=str.indexOf("can");
        System.out.println(index);

        index=str.indexOf("can",6);
        System.out.println(index);*/

        /*String str="https://www.oracle.com";
        String str2=str.substring(12,18);
        System.out.println(str2);*/


        /*String str=" good idea ";
        System.out.println(str.length());
        String str2=str.trim();
        System.out.println(str2.length());
        System.out.println(str2);*/

        /*String name="whatisjava?";
        char c=name.charAt(0);
        for (int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }
        System.out.println(c);*/

        /*String str="Thinking in Java";
        boolean flag=str.startsWith("Th");
        System.out.println(flag);
        flag=str.endsWith("Java");
        System.out.println(flag);*/

        /*String str="我喜欢java语言";
        System.out.println(str);
        String str1=str.toUpperCase();
        System.out.println(str1);*/

        int value=100;
        String str=value+"";
        System.out.println(str);

        String str2=String.valueOf(value);
        System.out.println(str2);
    }
}
