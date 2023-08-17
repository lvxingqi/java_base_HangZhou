package com.lzlgdx.task.day0807.tetris;

/**
 * @className: I.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/09 下午 04:35
 * @Description:
 * I图形
 */
public class I extends Tetromino{
    public I(){
        this(0,0);
    }
    public I(int row,int col){
        cells[0]=new Cell(row,col);
        cells[1]=new Cell(row,col+1);
        cells[2]=new Cell(row,col+2);
        cells[3]=new Cell(row,col+3);
    }
}
