package com.lzlgdx.task.backgammon;

import java.util.Arrays;

/**
 * @version java基础.1.0
 * @Description: 五子棋类
 * @author: 吕星琪
 * @Date: 2023/8/14 下午 02:05
 */
public class ChessBoard {
    static final int SIZE=16;
    private final String[][] chessBoard=new String[SIZE][SIZE];

    public String[][] getChessBoard() {
        return chessBoard;
    }

    public ChessBoard(){
        fillChessBoard();
    }
    //处理行列号问题，从0,1,2,3...9,a,b...f
    private void dealSerialNumberLogic(int i) {
        if (i < 10) {
            System.out.print(i + "\t");
        } else {
            System.out.print((char) (i + 87) + "\t");
        }
    }

    //初始化棋盘
    private void fillChessBoard() {
        String emptyFillers = "*\t";
        for (String[] character : chessBoard) {
            Arrays.fill(character, emptyFillers);
        }
    }
    //打印棋盘
    public  void print(){
        System.out.print("\t");
        for (int i = 0; i < chessBoard.length; i++) {
            dealSerialNumberLogic(i);
        }
        System.out.println();
        for (int i = 0; i < chessBoard.length; i++) {
            dealSerialNumberLogic(i);
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }

    }
}
