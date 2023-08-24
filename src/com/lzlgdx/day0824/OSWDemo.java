package com.lzlgdx.day0824;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/24 上午 10:35
 * @since jdk1.0
 */
public class OSWDemo {
    public static void main(String[] args) throws Exception{
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("files/h.txt"), StandardCharsets.UTF_8);
        osw.write('a');
        osw.write(1000);
        osw.write("中国");
        CharSequence csq=new StringBuffer("你好，李焕英");
        osw.append(csq,0,4);
        osw.close();
    }
}
