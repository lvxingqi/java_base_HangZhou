package com.lzlgdx.task.day0807.tetris;

/**
 * @className: S.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/08 下午 05:28
 * @Description:
 */
public class S extends Tetromino{

    public S(){
        this(0,0);
    }

    public S(int row,int col){
        cells[0] = new Cell(row+1,col);
        cells[1]=new Cell(row+1,col+1);
        cells[2] = new Cell(row,col+1);
        cells[3] = new Cell(row,col+2);
    }
}
