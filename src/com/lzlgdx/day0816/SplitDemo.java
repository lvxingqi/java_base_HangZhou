package com.lzlgdx.day0816;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 10:47
 * @since jdk1.0
 */
public class SplitDemo {


    public static void main(String[] args) {
        String str="java php c c# oc";
        System.out.println(str);
        String[] strArr=str.split("\\s");
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr[2]);

        String line="100+200-150=150";
        String[] nums=line.split("[+\\-=]");
        System.out.println(Arrays.toString(nums));

        String string="abc123rrw990ccff";
        String s=string.replaceAll("\\d","*");
        System.out.println(s);
    }
}
