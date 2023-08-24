package com.lzlgdx.day0822;

import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/22 下午 05:01
 * @since jdk1.0
 */
public class RandomAccessFileDemo1 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf=new RandomAccessFile("files\\abc.txt","rw");
        int n=raf.read();
        System.out.println((char) n);
        System.out.println(n);

        int n1=raf.read();
        long p=raf.getFilePointer();
        System.out.println(p);
        raf.seek(4);
        int n2=raf.read();
        System.out.println(Integer.toBinaryString(10000>>8));
        System.out.println(Integer.toBinaryString(39<<8));
        System.out.println(n1+" "+n2);
        System.out.println((n1<<8)+16);
        System.out.println((n2<<8)+16);


        System.out.println();

        byte[] bytes=new byte[6];
        raf.read(bytes);
        System.out.println(Arrays.toString(bytes));
        raf.close();
    }
}
