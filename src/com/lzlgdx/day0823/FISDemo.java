package com.lzlgdx.day0823;

import java.io.FileInputStream;
import java.util.Arrays;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/23 上午 10:51
 * @since jdk1.0
 */
public class FISDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("files/abc.txt");
//        int n=fis.read();
//        System.out.println(n);
        System.out.println(Arrays.toString("你好".getBytes()));
        byte[] bytes=fis.readAllBytes();
        System.out.println(Arrays.toString(bytes));
        String str=new String(bytes);
        System.out.println(str);
        System.out.println(fis.read());
        fis.close();
    }
}
