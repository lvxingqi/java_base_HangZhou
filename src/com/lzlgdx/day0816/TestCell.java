package com.lzlgdx.day0816;

import com.lzlgdx.day0811.tetris.Cell;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 下午 03:13
 * @since jdk1.0
 */
public class TestCell {
    public static void main(String[] args) {
        Cell c1=new Cell();
        c1.printCellInfo();

        Cell c2=new Cell(2,3);
        Cell c3=new Cell(2,3);
        System.out.println(c2.equals(c1));

    }
}
