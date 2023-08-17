package com.lzlgdx.task.day0807.tetris;

/**
 * @className: TestO.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/08 下午 05:31
 * @Description:
 */
public class TestO {
    public static void main(String[] args) {
        O o=new O();
        o.printInfo();
        printWall(o.cells);
        System.out.println("@@@@@@@@@@@@");
        o.drop();
        printWall(o.cells);
    }
    public static void printWall(Cell[] cell){
        for (int k=0;k<15;k++){
            for (int j=0;j<20;j++){
                System.out.print("-");
                if (cell[0].row==k && cell[0].col==j){
                    System.out.print("*");
                }else if(cell[1].row==k && cell[1].col==j){
                    System.out.print("*");
                }else if (cell[2].row==k && cell[2].col==j){
                    System.out.print("*");
                }else if(cell[3].row==k && cell[3].col==j){
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
