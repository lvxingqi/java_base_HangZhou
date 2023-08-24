package com.lzlgdx.day0824;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/24 上午 11:35
 * @since jdk1.0
 */
public class PWDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("files/pw.txt",true);
        OutputStreamWriter osw=new OutputStreamWriter(fos, StandardCharsets.UTF_8);//字符输出流，设置编码
        PrintWriter pw=new PrintWriter(osw,true);//自动行刷新
    }
}
