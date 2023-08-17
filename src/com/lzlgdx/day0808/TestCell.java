package com.lzlgdx.day0808;

import com.lzlgdx.Utils;
import com.lzlgdx.task.day0807.tetris.Cell;

/**
 * @className: TestCell.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/08 上午 10:28
 * @Description:
 */
public class TestCell {
    public static void main(String[] args) {
        Cell cell=new Cell();
        cell.row=3;
        cell.col=2;
        /*cell.printCellInfo();
        cell.drop();
        cell.printCellInfo();
        cell.drop(3);
        cell.printCellInfo();
        cell.shiftRight(4);
        cell.printCellInfo();*/
        printWall(cell);
        cell.drop();
        printWall(cell);
        int i = 0;
        for (;;){
            System.out.println("1、下落，2-左移，3-右移，0-退出");
            i=Utils.getScannerInstance().nextInt();
            if (i==0){
                System.out.println("游戏结束");
                System.exit(0);
            }else if (i==1){
                cell.drop();
                printWall(cell);
            }else if (i == 2) {
                cell.shiftLeft();
                printWall(cell);
            }else if (i == 3) {
                cell.shiftRight();
                printWall(cell);
            }
        }
    }

    public static void printWall(Cell cell){
        for (int i=0;i<15;i++){
            System.out.print("@");
        }
        System.out.println();
        for (int i=0;i<20;i++){
            for (int j=0;j<15;j++){
                if (cell.row==i&&cell.col == j){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

}
