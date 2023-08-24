package com.lzlgdx.day0823;

import java.io.FileOutputStream;
import java.util.Arrays;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/23 上午 09:48
 * @since jdk1.0
 */
public class FOSDemo {
    public static void main(String[] args) throws Exception{
        /*
        FileOutputStream fileOutputStream=new FileOutputStream("files/abc.txt");
        byte[]  bytes=new byte[10];
        bytes="你好".getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();*/
        FileOutputStream fos=new FileOutputStream("files/abc.txt",true);
        byte[] bytes=new byte[20];
        System.out.println(Arrays.toString(bytes));
        String info="中国";
        bytes=info.getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes.length);
        fos.write(bytes);
        fos.close();
    }
}
