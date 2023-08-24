package com.lzlgdx.day0824;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/24 上午 11:01
 * @since jdk1.0
 */
public class PWDemo {
    public static void main(String[] args) throws Exception{
        PrintWriter pw=new PrintWriter(new FileOutputStream("files/pw.txt"),true);
        pw.print("中国");
        pw.write("中国");
        pw.close();
    }
}
