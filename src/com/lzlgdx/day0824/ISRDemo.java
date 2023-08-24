package com.lzlgdx.day0824;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/24 上午 10:33
 * @since jdk1.0
 */
public class ISRDemo {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr=new InputStreamReader(new FileInputStream("files/h.txt"));
        int m;
        while((m=isr.read())!=-1){
            System.out.println((char) m);
        }
        isr.close();
    }
}
