package com.lzlgdx.day0824;

import java.io.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/24 下午 02:14
 * @since jdk1.0
 */
public class BWDemo {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("files/bw.txt")));
        bw.write("aaa");
        bw.close();
    }
}
