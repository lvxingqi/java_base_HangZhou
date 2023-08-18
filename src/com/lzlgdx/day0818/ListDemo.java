package com.lzlgdx.day0818;

import java.lang.instrument.UnmodifiableClassException;
import java.util.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 02:50
 * @since jdk1.0
 */
//List和数组的互相转换
public class ListDemo {
    public static void main(String[] args) {
//        List<String> list=new ArrayList<>();
        /*list.add("a");
        list.add("d");
        list.add("c");
        list.add("bb");
        System.out.println(list);
        String s=list.set(3,list.get(1));
        System.out.println(s);
        System.out.println(list);
        //交换位置的操作，set方法返回原来位置的元素
        list.set(2,list.set(0,list.get(2)));
        System.out.println(list);

        list.add(2,"bb");
        System.out.println(list);

        list.add("A");

        list.remove(1);*/

        /*List<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i+1);
        }
        System.out.println(list);

        List<Integer> sublist=new ArrayList<>();
        //左开右闭
        sublist=list.subList(2,10); //3...10

        List<Integer> list1=new ArrayList<>();
        list1.addAll(sublist);


        System.out.println(list1);
        for (int i=0;i<list1.size();i++){
            list1.set(i,sublist.get(i)*10);
        }
        //改变子列表会改变原列表
        System.out.println(list1);
        System.out.println(list);*/

        //4、List转换数组
        /*List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        //调用toArray()方法,
        //list转化为数组后可以修改，
        Object[] objects=list.toArray();
        objects[0]="12";
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(Arrays.toString(objects));
        System.out.println(objects[0]);*/

        //5、数组转集合
        String[] str=new String[]{"a","b","c","d","f","m","nnn"};
        List<String> list = Arrays.asList(str);
        System.out.println(list);
        //不支持操作异常 数组转换成的集合不能添加和删除，只能修改内容和查看元素
        //修改内容会影响原来数组，
        // 原因：ArrayList()底层声明为final数组。final数组声明之后
        //说明数组引用不可变，数组内容还是可以改变的
//        list.add("k");
        System.out.println(list);
        list.set(0,"hello");
        System.out.println(list);
        System.out.println(Arrays.toString(str));

        List<String> list1=new ArrayList<>();
        boolean b = list1.addAll(list);
        System.out.println(b);
        System.out.println(list1);
        list1.add("bbb");
        System.out.println(list1);

        //如果想让内容也不可修改，如下，
        List<String> list2= Collections.unmodifiableList(list);
        for (String s:list2){
            System.out.print(s+" ");
        }


    }
}
