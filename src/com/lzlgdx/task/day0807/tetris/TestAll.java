package com.lzlgdx.task.day0807.tetris;

import java.util.Arrays;

/**
 * @className: TestAll.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/09 下午 03:59
 * @Description:
 */
public class TestAll {
    public static String[][] background = new String[16][16];

    public static void main(String[] args) throws InterruptedException {
        MyThread t=new MyThread();
        Thread thread=new Thread(t);
        thread.start();


    }

    public static void print(Tetromino tetromino) {
        boolean flag = false;
        fillBackground();
        for (int i = 0; i < background.length; i++) {
            for (int j = 0; j < background.length; j++) {
                for (int k = 0; k < tetromino.cells.length; k++) {
                    if (tetromino.cells[k].row == i && tetromino.cells[k].col == j) {
                        /*background[i][j] = "@\t";*/
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.print("* ");
                    flag = false;
                } else {
                    System.out.print("- ");
                }

                /*System.out.print(background[i][j]);*/
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillBackground() {
        for (String[] bg : background) {
            Arrays.fill(bg, "*\t");
        }
    }
}
