package com.lzlgdx.day0811.tetris;

/**
 * @className: Tetromino.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/09 下午 03:41
 * @Description: 四格拼版 该类作为7个图形的共有父类
 * 7个图形都是由4个格子拼接而成
 */
public class Tetromino {
    public Cell[] cells;

    public Tetromino() {
        cells = new Cell[4];
    }

    public void drop() {
        for (Cell cell : cells) {
            cell.drop();
        }
    }

    public void shiftLeft() {
        for (Cell cell : cells) {
            cell.shiftLeft();
        }
    }

    public void shiftRight() {
        for (Cell cell : cells) {
            cell.shiftRight();
        }
    }

    public void drop(int n) {
        for (Cell cell : cells) {
            cell.drop(n);
        }
    }

    public void shiftLeft(int n) {
        for (Cell cell : cells) {
            cell.shiftLeft(n);
        }
    }

    public void shiftRight(int n) {
        for (Cell cell : cells) {
            cell.shiftRight(n);
        }
    }

    public void printInfo() {
        for (Cell cell : cells) {
            cell.printCellInfo();
        }
    }

}
