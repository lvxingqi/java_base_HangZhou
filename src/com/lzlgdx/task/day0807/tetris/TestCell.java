package com.lzlgdx.task.day0807.tetris;

/**
 * @className: TestCell.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/07 下午 05:58
 * @Description:
 */
public class TestCell {
    public static void main(String[] args) {
        Cell cell = new Cell();
        System.out.println(cell.row+","+cell.col);
        cell.drop();
        System.out.println(cell.row+","+cell.col);
        cell.shiftRight();
        System.out.println(cell.row+","+cell.col);

        //格子下落
        cell.drop();
        cell.printCellInfo();
    }
}
