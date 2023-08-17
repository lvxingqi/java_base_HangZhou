package com.lzlgdx.task.backgammon;

import com.lzlgdx.day0811.tetris.S;

/**
 * @version java基础.1.0
 * @Description: 另一种算法
 * @author: 吕星琪
 * @Date: 2023/8/14 下午 09:10
 */
public class OtherAlgorithm implements JudgeWin{

    @Override
    public boolean judge(ChessBoard chessBoard, int row, int col, String currentPlayerSymbol) {
        String[][] chessBox=chessBoard.getChessBoard();
        int count = 0;
        int SIZE= ChessBoard.SIZE;

        // 检查横向
        for (int i = Math.max(0, col - 4); i <= Math.min(SIZE - 1, col + 4); i++) {
            if (chessBox[row][i].equals(currentPlayerSymbol)) {
                count++;
                if (count == 5) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        count = 0;
        // 检查纵向
        for (int i = Math.max(0, row - 4); i <= Math.min(SIZE - 1, row + 4); i++) {
            if (chessBox[i][col].equals(currentPlayerSymbol)) {
                count++;
                if (count == 5) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        // 检查左斜
        count = 0;
        for (int i = -4; i <= 4; i++) {
            int newRow = row + i;
            int newCol = col + i;
            if (newRow >= 0 && newRow < SIZE && newCol >= 0 && newCol < SIZE) {
                if (chessBox[newRow][newCol].equals(currentPlayerSymbol)) {
                    count++;
                    if (count == 5) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // 检查右斜
        count = 0;
        for (int i = -4; i <= 4; i++) {
            int newRow = row + i;
            int newCol = col - i;
            if (newRow >= 0 && newRow < SIZE && newCol >= 0 && newCol < SIZE) {
                if (chessBox[newRow][newCol].equals(currentPlayerSymbol)) {
                    count++;
                    if (count == 5) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }
}
