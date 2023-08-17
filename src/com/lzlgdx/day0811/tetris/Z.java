package com.lzlgdx.day0811.tetris;

/**
 * @className: Z.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/09 下午 04:42
 * @Description:
 */
public class Z extends Tetromino {
    public Z(){
        this(0,0);
    }
    public Z(int row,int col){
        cells[0]=new Cell(row,col);
        cells[1]=new Cell(row,col+1);
        cells[2]=new Cell(row+1,col+1);
        cells[3]=new Cell(row+1,col+2);

    }
}
