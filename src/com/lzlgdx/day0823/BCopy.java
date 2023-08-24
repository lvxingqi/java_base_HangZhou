package com.lzlgdx.day0823;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/23 下午 03:40
 * @since jdk1.0
 */
public class BCopy {
    public static void main(String[] args) throws Exception{
        long current=System.currentTimeMillis();
        copy("files/叶辰.txt","files/bcopy.txt");
        System.out.println((System.currentTimeMillis()-current)+"ms");
        //78ms
    }

    public static void copy(String originPathname,String targetPathname) throws Exception{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(originPathname));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(targetPathname));
        byte[] bytes=new byte[1024*1024];
        while (bis.read(bytes)!=-1){
            bos.write(bytes);
            bos.flush();
        }
        bos.close();
        bis.close();
    }
}
