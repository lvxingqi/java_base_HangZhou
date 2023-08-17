package com.lzlgdx.task.day0807;

import com.lzlgdx.Utils;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @className: Task02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/07 下午 03:22
 * @Description: 五子棋 n*n的棋盘上，黑白双方分别落子,根据落子情况打印出来
 */
public class Task02 {
    static int SIZE=16;
    static String[][] chessBox = new String[SIZE][SIZE];
    /**
     * description:打印行列号
     *
     * @return void
     */

    // ...（之前的代码）

    /*public boolean checkWin(int row, int col, String currentPlayerSymbol) {
        int count = 0;

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
    }*/


    public static void dealSerialNumberLogic(int i) {
        if (i >= 10) {
            System.out.print((char) (i + 87) + "\t");
        } else {
            System.out.print(i + "\t");
        }
    }

    public static void printChessBox() {
        System.out.print("\t");
        for (int i = 0; i < chessBox.length; i++) {
            dealSerialNumberLogic(i);
        }
        System.out.println();
        for (int i = 0; i < chessBox.length; i++) {
            dealSerialNumberLogic(i);
            for (int j = 0; j < chessBox[i].length; j++) {
                System.out.print(chessBox[i][j]);
            }
            System.out.println();
        }

    }

    public static void fillChessBox() {
        for (String[] character : chessBox) {
            Arrays.fill(character, "*\t");
        }
    }

    public static int solveCoordinate(char character) {
        int c = 0;
        switch (character) {
            case 48:
                break;
            case 49:
                c = 1;
                break;
            case 50:
                c = 2;
                break;
            case 51:
                c = 3;
                break;
            case 52:
                c = 4;
                break;
            case 53:
                c = 5;
                break;
            case 54:
                c = 6;
                break;
            case 55:
                c = 7;
                break;
            case 56:
                c = 8;
                break;
            case 57:
                c = 9;
                break;
            case 97:
                c = 10;
                break;
            case 98:
                c = 11;
                break;
            case 99:
                c = 12;
                break;
            case 100:
                c = 13;
                break;
            case 101:
                c = 14;
                break;
            case 102:
                c = 15;
                break;
            default:
                c = -1;
        }
        return c;
    }

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

    public static void luoZi(int count, String filler) {
        String input;
        while (true) {
            input = Utils.getScannerInstance().next();
            int a = getCoordinate(input)[0];
            int b = getCoordinate(input)[1];
            boolean repeat = judgeRepeat(a,b);
            if (!repeat) {
                replace(filler,a, b, count);
                break;
            } else {
                System.out.println("重复落子，请重新输入：");
            }
        }
    }

    public static int[] getCoordinate(String input) {
        //由于后面会出现abc，考虑用char类型数组解决问题,根据对应的char的int值，
        //采用switch解决数组下标问题
        int[] nums = new int[2];
        char[] chars = input.toCharArray();
        if (chars.length == 2) {
            nums[0] = solveCoordinate(chars[0]);
            nums[1] = solveCoordinate(chars[1]);
        }
        return nums;
    }

    public static void judgeWinner() {
        //黑子先落
        //黑白落子选择计数器
        int count = 0;
        //打印棋盘
        String filler="";
        printChessBox();
        System.out.println("五子棋游戏开始：");
        while (!judgeWin()) {
            //黑方或白方落子
            filler=blackOrWhite(count)[0];
            System.out.println(filler +
                    "落子：" + "请输入落子位置，如19代表（1，9）");
            luoZi(count, blackOrWhite(count)[1]);
            printChessBox();
            count++;
        }
        System.out.println(filler+"获胜!!!");
    }

    public static boolean rowWin() {
        boolean win = false;
        int black = 0;
        int white = 0;
        for (String[] box : chessBox) {
            for (int j = 0; j < chessBox.length; j++) {
                if ("B\t".equals(box[j])) {
                    black++;
                    if (black == 5) {
                        win = true;
                        break;
                    }
                    white = 0;
                }
                if ("W\t".equals(box[j])) {
                    white++;
                    if (white == 5) {
                        win = true;
                        break;
                    }
                    black = 0;
                }
                //防止出现 BBB**BB判定成功
                if ("*\t".equals(box[j])) {
                    white = 0;
                    black = 0;
                }
            }
            if (win) {
                break;
            }
        }
        return win;
    }

    public static void replace(String str,  int a, int b, int count) {
        if (count % 2 == 0) {
            chessBox[a][b] = str;
        } else {
            chessBox[a][b] = str;
        }
    }

    public static boolean judgeRepeat( int a, int b) {
        boolean repeat = true;
        if (!"B\t".equals(chessBox[a][b]) && !"W\t".equals(chessBox[a][b])) {
            repeat = false;
        }
        return repeat;
    }

    public static boolean colWin() {
        boolean win = false;
        int black = 0;
        int white = 0;
        for (int j = 0; j < chessBox.length; j++) {
            for (String[] box : chessBox) {
                if ("B\t".equals(box[j])) {
                    black++;
                    if (black == 5) {
                        win = true;
                        break;
                    }
                    white = 0;
                }
                if ("W\t".equals(box[j])) {
                    white++;
                    if (white == 5) {
                        win = true;
                        break;
                    }
                    black = 0;
                }
                //防止出现 BBB**BB判定成功
                if ("*\t".equals(box[j])) {
                    white = 0;
                    black = 0;
                }
            }
        }
        return win;
    }

    public static boolean leftOblique() {
        boolean flag = false;
        int countB = 0;
        int countW = 0;
        int k;
        int v;
        for (int i = 0; i < chessBox.length; i++) {
            for (int j = 0; j < chessBox.length; j++) {
                k = i;
                v = j;
                //5,7 6,8 7,9
                while (v < 16 && k < 16) {
                    if (equals("B\t",k,v)) {
                        countB++;
                        if (countB == 5) {
                            flag = true;
                            break;
                        }
                        countW = 0;
                    }
                    if (equals("W\t",k,v)) {
                        countW++;
                        if (countW == 5) {
                            flag = true;
                            break;
                        }
                        countB = 0;
                    }
                    if (equals("*\t",k,v)) {
                        countB = 0;
                        countW = 0;
                    }
                    k++;
                    v++;
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        return flag;
    }

    public static boolean rightOblique() {
        boolean flag = false;
        int countB = 0;
        int countW = 0;
        int k;
        int v;
        for (int i = chessBox.length - 1; i >= 0; i--) {
            for (int j = 0; j <chessBox.length; j++) {
                k = i;
                v = j;
                while (v < 16 && k >=0 ) {
                    if (equals("B\t",k,v)) {
                        countB++;
                        if (countB == 5) {
                            flag = true;
                            break;
                        }
                        countW = 0;
                    }
                    if (equals("W\t",k,v)) {
                        countW++;
                        if (countW == 5) {
                            flag = true;
                            break;
                        }
                        countB = 0;
                    }
                    if (equals("*\t",k,v)) {
                        countW = 0;
                        countB = 0;
                    }
                    k--;
                    v++;
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        return flag;
    }

    public static boolean equals(String str,int a,int b){
        return str.equals(chessBox[a][b]);
    }

    public static boolean judgeWin() {
        return rowWin() || colWin() || leftOblique()||rightOblique();
    }

    public static void main(String[] args) {

        fillChessBox();
        judgeWinner();
    }
}
