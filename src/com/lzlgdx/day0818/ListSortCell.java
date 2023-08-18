package com.lzlgdx.day0818;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/18 下午 05:31
 * @since jdk1.0
 */
public class ListSortCell {
    public static void main(String[] args) {
        Cell c1=new Cell(5,3);
        Cell c2=new Cell(0,1);
        Cell c3=new Cell(3,4);
        Cell c4=new Cell(2,3);
        Cell c5=new Cell(1,4);
        List<Cell> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
