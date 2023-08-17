package com.lzlgdx.test;

import java.util.Arrays;

/**
 * @className: SplitString.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/08 下午 07:13
 * @Description:
 */
public class SplitString {
    public static void main(String[] args) {
        Action act=new Action() {
            @Override
            public String[] test(String str) {
                String[] temp=str.split("-");
                for (int i=0;i<temp.length;i++){
                    temp[i] = temp[i].replace("","\"");
                }
                return temp;
            }
        };

        String[] str=act.test("a-b-c");
        System.out.println(Arrays.toString(str));
    }
}
