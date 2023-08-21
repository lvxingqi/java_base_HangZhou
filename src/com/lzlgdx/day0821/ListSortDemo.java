package com.lzlgdx.day0821;

import java.util.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 上午 09:32
 * @since jdk1.0
 */
public class ListSortDemo {
    public static void main(String[] args) {
        List<Cell> list=new ArrayList<Cell>();
        list.add(new Cell(3,1));
        list.add(new Cell(1,2));
        list.add(new Cell(5,6));
        System.out.println(list);

        /*Collections.sort(list);*/ //必须实现comparable接口才能调用
        //使用匿名内部类的方式创建comparator
        Comparator<Cell> ct=new Comparator<Cell>() {
            @Override
            public int compare(Cell o1, Cell o2) {
                return o1.row-o2.row;
            }
        };

        /*list.sort(ct);
        System.out.println(list);*/

//        Collection
        list.sort(new MyComparator());
        System.out.println(list);


    }
}

class MyComparator implements Comparator<Cell>{
    @Override
    public int compare(Cell o1, Cell o2) {
        return o1.row-o2.row;
    }
}
