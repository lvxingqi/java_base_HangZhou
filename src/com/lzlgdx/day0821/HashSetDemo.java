package com.lzlgdx.day0821;

import com.lzlgdx.day0811.tetris.I;
import com.lzlgdx.day0811.tetris.S;

import java.util.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 下午 03:53
 * @since jdk1.0
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Student s1=new Student(1,"张三");
        Student s2=new Student(2,"李四");
        HashSet<Student> hashSet=new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        System.out.println(hashSet);
        hashSet.add(new Student(1,"张三"));
        System.out.println(hashSet);
        for (Student student:hashSet){
            System.out.println(student);
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(2,4);
        map.put(7,3);
        Set<Integer> keys=map.keySet();
        System.out.println(keys);
        Iterator<Integer> it=keys.iterator();
        while (it.hasNext()){
            Integer key=it.next();
            Integer value=map.get(key);
            System.out.print(key+" "+value);
            System.out.println();
        }

        Set<Map.Entry<Integer,Integer>> entries=map.entrySet();
        for (Map.Entry<Integer,Integer> entry:entries){
            System.out.println(entry);
        }

        Iterator<Map.Entry<Integer,Integer>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        for (Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator(); iter.hasNext(); ) {
            Map.Entry<Integer, Integer> entry = iter.next();
            System.out.println(entry);
        }

    }
}
