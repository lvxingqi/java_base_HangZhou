package com.lzlgdx.day0823;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/23 下午 04:33
 * @since jdk1.0
 */
public class OOSDemo {
    private static final long serialVersionUID = -4542266166762741462L;
    public transient int a;//序列化时a被当作不存在
    private int test;
    @Override
    public String toString() {
        return "OOSDemo{}";
    }

    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("files/object.txt"));
        OOSDemo oosDemo=new OOSDemo();
        oos.writeObject(oosDemo);
        oos.close();
    }
}
