package com.lzlgdx.day0823;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/23 下午 02:58
 * @since jdk1.0
 */
public class BISDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("files/a.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        int i;
        while((i=bis.read())!=-1){
            System.out.print(i+" ");
        }
        bis.close();
        fis.close();
    }
}
