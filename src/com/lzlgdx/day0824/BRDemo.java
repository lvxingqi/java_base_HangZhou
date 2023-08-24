package com.lzlgdx.day0824;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/24 下午 02:30
 * @since jdk1.0
 */
public class BRDemo {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(
                new File("files","br.txt")),StandardCharsets.UTF_8));
        String s = br.readLine();
        System.out.println(s);
        br.close();
    }
}
