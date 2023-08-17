package com.lzlgdx.day0811.tetris;

/**
 * @className: T.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/08 下午 04:25
 * @Description:
 * 俄罗斯方块 T型
 */
public class T extends Tetromino {

    public T(){
        this(0,0);
    }
    public T(int row,int col){
        cells[0] = new Cell(row,col);
        cells[1]=new Cell(row,col+1);
        cells[2] = new Cell(row,col+2);
        cells[3] = new Cell(row+1,col+1);
    }

    @Override
    public void printInfo() {
        System.out.println("I am T graphic");
        super.printInfo();
    }
}
