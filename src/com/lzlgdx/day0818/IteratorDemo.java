package com.lzlgdx.day0818;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 上午 10:27
 * @since jdk1.0
 */
//迭代器，注意有些Collection的方法和List的方法是不一样的，
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("php");
        c.add("java");
        c.add("python");
        c.add("c");
        Iterator<String> iterator=c.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s);
        }
    }
}
