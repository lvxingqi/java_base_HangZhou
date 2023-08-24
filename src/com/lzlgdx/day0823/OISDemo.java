package com.lzlgdx.day0823;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/23 下午 04:38
 * @since jdk1.0
 */
public class OISDemo {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("files/object.txt"));
        OOSDemo oosDemo=(OOSDemo) ois.readObject();
        System.out.println(oosDemo.toString());
        System.out.println(oosDemo.a);
        ois.close();
    }
}
