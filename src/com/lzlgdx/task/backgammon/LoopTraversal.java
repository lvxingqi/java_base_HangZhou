package com.lzlgdx.task.backgammon;

/**
 * @version java基础.1.0
 * @Description: 循环遍历横向、纵向、左斜、右斜四种情况
 * @author: 吕星琪
 * @Date: 2023/8/14 下午 01:59
 */
public class LoopTraversal implements JudgeWin {

    @Override
    public boolean judge(ChessBoard chessBoard,int row,int col,String currentPlayerSymbol) {
        String rivalSymbol="";
        if (currentPlayerSymbol.equals("B\t")){
            rivalSymbol="W\t";
        }else {
            rivalSymbol="B\t";
        }
        String[][] chessBox=chessBoard.getChessBoard();
        int count=0;
        for (String[] box : chessBox) {
            for (int j = 0; j < chessBox.length; j++) {
                if (currentPlayerSymbol.equals(box[j])) {
                    count++;
                    if (count == 5) {
                        return true;
                    }
                }
                //防止出现 BBB**BB判定成功
                if ("*\t".equals(box[j])||rivalSymbol.equals(box[j])) {
                   count=0;
                }
            }
        }

        //竖向
        for (int j = 0; j < chessBox.length; j++) {
            for (String[] box : chessBox) {
                if (currentPlayerSymbol.equals(box[j])||rivalSymbol.equals(box[j])) {
                    count++;
                    if (count == 5) {
                        return true;
                    }
                }
                //防止出现 BBB**BB判定成功
                if ("*\t".equals(box[j])) {
                    count=0;
                }
            }
        }

        //左斜
        int k;
        int v;
        for (int i = 0; i < chessBox.length; i++) {
            for (int j = 0; j < chessBox.length; j++) {
                k = i;
                v = j;
                //5,7 6,8 7,9
                while (v < 16 && k < 16) {
                    if (Utils.equals(currentPlayerSymbol,chessBoard,k,v)) {
                        count++;
                        if (count == 5) {
                            return true;
                        }
                    }
                    if (Utils.equals("*\t",chessBoard,k,v)||rivalSymbol.equals(chessBox[k][v])){
                        count=0;
                    }
                    k++;
                    v++;
                }
            }
        }

        //右斜
        for (int i = chessBox.length - 1; i >= 0; i--) {
            for (int j = 0; j <chessBox.length; j++) {
                k = i;
                v = j;
                while (v < 16 && k >=0 ) {
                    if (Utils.equals(currentPlayerSymbol,chessBoard,k,v)) {
                        count++;
                        if (count == 5) {
                            return true;
                        }
                    }
                    if (Utils.equals("*\t",chessBoard,k,v)||rivalSymbol.equals(chessBox[k][v])) {
                        count=0;
                    }
                    k--;
                    v++;
                }
            }
        }
        return false;
    }
}
