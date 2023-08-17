package com.lzlgdx.task.backgammon;

import com.lzlgdx.day0811.tetris.S;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @className: Task02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/07 下午 03:22
 * @Description: 五子棋 n*n的棋盘上，黑白双方分别落子,根据落子情况打印出来
 */
public class Launch {
    static ChessBoard chessBoard=new ChessBoard();
    static String[][] chessBox =chessBoard.getChessBoard();
    private static final JudgeWin judgeWin=new LoopTraversal();

    public static String[] blackOrWhite(int count) {
        //黑方取余2=0 白方取余2=1
        String[] filler = new String[2];
        if (count % 2 == 0) {
            filler[0] = "黑方";
            filler[1] = "B\t";
        } else {
            filler[0] = "白方";
            filler[1] = "W\t";
        }
        return filler;
    }

    public static int[] luoZi(String filler) {
        String input;
        Scanner sc = new Scanner(System.in);
        int a,b;
        while (true) {
            input = sc.next();
            a = Utils.getCoordinate(input)[0];
            b = Utils.getCoordinate(input)[1];
            boolean repeat = judgeRepeat(a, b);
            if (!repeat) {
                replace(filler, a, b);
                break;
            } else {
                System.out.println("重复落子，请重新输入：");
            }
        }
        return new int[]{a, b};
    }

    public static void start() {
        int count = 0;  //黑子先落,黑白落子选择计数器
        String filler1,filler2;
        int[] nums;
        chessBoard.print(); //打印棋盘
        System.out.println("五子棋游戏开始：");
        do{
            filler1=blackOrWhite(count)[0];  //黑方或白方落子
            filler2=blackOrWhite(count)[1];
            System.out.println(filler1 +
                    "落子：" + "请输入落子位置，如19代表（1，9）");
            nums=luoZi(blackOrWhite(count)[1]);
            chessBoard.print();
            count++;
        }while (!judgeWin.judge(chessBoard,nums[0],nums[1],filler2));
        System.out.println(filler1+"获胜!!!");
    }
    public static void replace(String str,  int a, int b) {
        chessBox[a][b] = str;
    }

    public static boolean judgeRepeat( int a, int b) {
        return "B\t".equals(chessBox[a][b]) || "W\t".equals(chessBox[a][b]);
    }

    public static void main(String[] args) {
        start();
    }
}
