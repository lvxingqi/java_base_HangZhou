package com.lzlgdx.day0823;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/23 下午 02:11
 * @since jdk1.0
 */
public class BOSDemo {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("files/a.txt",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        bos.write(100);
        bos.close();
        fos.close();
    }
}
