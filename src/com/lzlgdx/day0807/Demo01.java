package com.lzlgdx.day0807;

import java.util.Arrays;

/**
 * @className: Bank.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/07 上午 09:06
 * @Description:
 */
public class Demo01 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {4}, {7, 8, 9}};
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println(arr1[1].length);
        System.out.println(arr1[2].length);
        int[][] nums = new int[10][5];
        printArray(nums);
        printArray(arr1);

    }

    /**
    description:打印一个二维数组
    *
     * @param array int类型的二维数组
    * @return void
    */
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
