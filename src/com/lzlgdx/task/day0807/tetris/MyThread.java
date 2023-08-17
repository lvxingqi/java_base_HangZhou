package com.lzlgdx.task.day0807.tetris;

import java.util.Arrays;

/**
 * @className: MyThread.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/09 下午 05:37
 * @Description:
 */
public class MyThread implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        T t = new T();
        try {
            done(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void done(Tetromino t) throws InterruptedException {
        int i=0;
        while (i<15) {
            print(t);
            t.drop();
            i++;
            Thread.sleep(3000);
        }
    }
    public void print(Tetromino tetromino) {
        boolean flag = false;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
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

}
