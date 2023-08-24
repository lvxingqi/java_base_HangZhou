package com.lzlgdx.day0822;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/22 下午 03:49
 * @since jdk1.0
 */
public class RandomFileAccessDemo {
    public static void main(String[] args) throws Exception{
        File file=new File("files");
        RandomAccessFile accessFile=new RandomAccessFile("files\\abc.txt","rw");

        accessFile.write(100);
        accessFile.write(10000>>8);

        accessFile.write('中');
        System.out.println(Integer.toBinaryString('中'));
        // 0100 1110 0010 1101
        System.out.println(Integer.toHexString('中'));
        System.out.println(20013>>8);
        accessFile.write('中'>>8);

        byte[] bs="中国".getBytes();
        System.out.println(Arrays.toString(bs));
        System.out.println(Integer.toBinaryString(bs[1]));
        accessFile.write(bs);
        accessFile.write(bs,3,3);
        accessFile.close();

    }
}
