package com.lzlgdx.day0818;

import java.util.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 05:04
 * @since jdk1.0
 */
//List排序
public class ListSort {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i=0;i<10;i++){
            list.add(r.nextInt(100));
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
