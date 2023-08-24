package com.lzlgdx.day0824;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/24 下午 04:19
 * @since jdk1.0
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        String pathname="files/exception.txt";
        String s=null;
        try {
            int len=s.length();
            System.out.println(len);
        }catch (NullPointerException nullPointerException){
            try {
                PrintWriter pw=new PrintWriter(new OutputStreamWriter(
                        new FileOutputStream(pathname)),true);
                nullPointerException.printStackTrace(pw);
                pw.close();
                BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(pathname)));
                String ex;
                while ((ex=br.readLine())!=null){
                    System.out.println(ex);
                }
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.exit(-1);

        }
        System.out.println("正常执行！");
    }
}
