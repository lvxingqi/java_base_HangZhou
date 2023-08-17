package com.lzlgdx.day0803;

import com.lzlgdx.Utils;

/**
 * @className: Demo04.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/03 下午 03:26
 * @Description:
 * 循环结构
 */
public class Demo04 {
    public static void main(String[] args) {
        //1、while循环
        //起始条件
        /*int i=1;
        while (i<10){
            System.out.println("你好"+i);
            i++;
        }*/

        /*int pwd;
        do {
            pwd= Utils.getScannerInstance().nextInt();
        }while (pwd!=1234);*/

        //练习：计算1+2+...+100
        /*int j=1,sum = 0;
        while(j<101){
            sum+=j;
            j++;
        }
        System.out.println(sum);*/
        /*for (;;){
            System.out.println("你好");
        }*/

        int n = 100;
        int sum1=(n+1)*n/2;
        System.out.println(sum1);

        for(int i=0,j=6;i<100;i++,j++){
            System.out.println(i+" "+j);
        }


    }
}
