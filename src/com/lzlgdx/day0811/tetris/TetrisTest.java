package com.lzlgdx.day0811.tetris;
import org.junit.Test;

/**
 * @version java基础.1.0
 * @Description: 测试类
 * @author: 吕星琪
 * @Date: 2023/8/11 上午 11:42
 */
public class TetrisTest {
    public static void print(Tetromino tetromino) {
        boolean flag = false;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                for (int k = 0; k < tetromino.cells.length; k++) {
                    if (tetromino.cells[k].row == i && tetromino.cells[k].col == j) {
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
            }
            System.out.println();
        }
        System.out.println();
    }
    @Test
    public void test(){
        Tetromino t=new T();
        t.printInfo();
        print(t);
    }
}
