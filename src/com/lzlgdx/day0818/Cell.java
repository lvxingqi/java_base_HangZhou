package com.lzlgdx.day0818;

import java.util.Comparator;

/**
 * @className: Cell.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/07 下午 05:49
 * @Description:
 */
public class Cell implements Comparable<Cell> {
    /**特征 == 成员变量 */
    public int col;
    public int row;
    public Cell(){}
    public Cell(int row, int col){
        this.row=row;
        this.col=col;
    }
    /**
    description:下落
    *
    * @return void
    */
    public void drop(){
        row++;
    }
    /**
    description:左移
    *
    * @return void
    */
    public void shiftLeft(){
        col--;
    }
    /**
    description:右移
    *
    * @return void
    */
    public void shiftRight(){
        col++;
    }
    public void printCellInfo(){
        System.out.println(this.row+","+this.col);
    }

    /**
    description:一次左移n个格子
    *
     * @param n 移动格子数
    * @return void
    */
    public void shiftLeft(int n){
        col-=n;
    }

    /**
    description:一次右移n个格子
    *
     * @param n 移动格子数
    * @return void
    */
    public void shiftRight(int n){
        col+=n;
    }

    /**
     description:一次下移n个格子
     *
     * @param n 移动格子数
     * @return void
     */
    public void drop(int n){
        row+=n;
    }

    @Override
    public int compareTo(Cell cell) {
        //按照行的大小进行排序
        return this.row-cell.row;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (obj.getClass()==this.getClass()) return false;
        Cell cell=(Cell) obj;
        return cell.col == this.col && cell.row == this.row;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
