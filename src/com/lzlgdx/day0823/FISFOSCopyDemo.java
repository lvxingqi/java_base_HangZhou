package com.lzlgdx.day0823;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/23 上午 11:28
 * @since jdk1.0
 */
public class FISFOSCopyDemo {
    public static void main(String[] args) throws Exception{
        //copy("files/abc.txt","files/a.txt");
        copy1("files/abc.txt","files/a.txt");
    }

    public static void copy(String originPathname,String targetPathname) throws Exception {
        FileInputStream fis=new FileInputStream(originPathname);
        FileOutputStream fos=new FileOutputStream(targetPathname);
        byte[] bytes=fis.readAllBytes();
        fos.write(bytes);
        fos.write(bytes);
        fis.close();
        fos.close();
    }
    public static void copy1(String originPathname,String targetPathname) throws Exception{
        FileInputStream fis=new FileInputStream(originPathname);
        FileOutputStream fos=new FileOutputStream(targetPathname,true);
        int i;
        while((i=fis.read())!=-1){
            fos.write(i);
        }
        fis.close();
        fos.close();
    }
}
