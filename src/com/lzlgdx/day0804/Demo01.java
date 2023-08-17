package com.lzlgdx.day0804;

/**
 * @className: Bank.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/04 上午 08:11
 * @Description:
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        /*
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         * * * * * * * * * *
         */
        /*for (int i = 0; i < 5; i++){
            for (int j=0;j<10;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         */

        /*
                *
                * *
                * * *
                * * * *
                * * * * *
                * * * * * *
                * * * * * * *
               */

        /*
        for (int i = 0; i < 7; i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        for (int i = 1; i < 10;i++) {
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }



    }
}
