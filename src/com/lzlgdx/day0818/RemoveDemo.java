package com.lzlgdx.day0818;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 上午 10:52
 * @since jdk1.0
 */
//集合中的remove删除方法
public class RemoveDemo {
    public static void main(String[] args) {
        Collection<String> collection=new HashSet<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");

        System.out.println(collection);

        System.out.println(collection.remove("b"));
        System.out.println(collection.remove("b"));
        System.out.println(collection);

        Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext()){
            iterator.next();
            //collection.remove(s); ConcurrentModificationException 并发修改异常
            iterator.remove();
        }
        //在迭代器迭代的时候，要对集合元素进行操作，必须使用迭代器的相应方法，
        //否则，迭代器的元素数量会和集合不一致，从而报错。
        //操作必须在next()之后，next想象成一个指针，next指向当前元素，remove
        //删除当前元素，先指向，后删除，刚开始，next指向空，第一次调用指向第一个元素，以此类推
        System.out.println(collection);
    }
}
