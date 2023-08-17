package com.lzlgdx.day0811.tetris;

/**
 * @className: O.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/08 下午 05:23
 * @Description:
 */
public class O extends Tetromino {
    public O(){
        this(0,0);
    }

    public O(int row,int col){
        cells[0] = new Cell(row,col);
        cells[1]=new Cell(row,col+1);
        cells[2] = new Cell(row+1,col);
        cells[3] = new Cell(row+1,col+1);
    }
}
