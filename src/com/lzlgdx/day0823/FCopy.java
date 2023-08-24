package com.lzlgdx.day0823;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/23 下午 03:39
 * @since jdk1.0
 */
public class FCopy {
    public static void main(String[] args) throws Exception {
        long current=System.currentTimeMillis();
        //copy("files/叶辰.txt","files/fcopy.txt");
        System.out.println((System.currentTimeMillis()-current)+"ms");
        //357ms
    }
    public static void copy1(String originPathname,String targetPathname) throws Exception{
        FileInputStream fis=new FileInputStream(originPathname);
        FileOutputStream fos=new FileOutputStream(targetPathname,true);
        byte[] bytes=new byte[1024*1024];
        while((fis.read(bytes)!=-1)){
            fos.write(bytes);
            fos.flush();
        }
        fis.close();
        fos.close();
    }
}
