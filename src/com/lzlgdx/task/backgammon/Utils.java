package com.lzlgdx.task.backgammon;

/**
 * @version java基础.1.0
 * @Description: 工具类
 * @author: 吕星琪
 * @Date: 2023/8/14 下午 03:30
 */
public class Utils {
    static int dealInputCoordinate(char c){
        if (c>=48&&c<=57){
            return c-48;
        }else if (c>=97&&c<=102){
            return c-87;
        }
        return -1;
    }
    public static int[] getCoordinate(String input) {
        //由于后面会出现abc，考虑用char类型数组解决问题,根据对应的char的int值，
        //采用switch解决数组下标问题
        int[] nums = new int[2];
        char[] chars = input.toCharArray();
        if (chars.length == 2) {
            nums[0] = dealInputCoordinate(chars[0]);
            nums[1] = dealInputCoordinate(chars[1]);
        }
        return nums;
    }

    public static boolean equals(String str,ChessBoard chessBoard,int a,int b){
        return str.equals(chessBoard.getChessBoard()[a][b]);
    }
}
