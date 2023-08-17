package com.lzlgdx.day0804;

/**
 * @className: Demo02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/04 上午 11:20
 * @Description:
 */
public class Demo02 {
    public static void main(String[] args) {
        //++和--的情况下，条件互斥
        for (int i=0;i<4;i++){
            for (int k=3;k>i;k--){
                System.out.print(" ");
            }
            for (int j=0;j<=i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0;i<3;i++){
            for (int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for (int j=5;j>i*2;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

