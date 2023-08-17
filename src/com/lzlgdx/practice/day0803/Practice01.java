package com.lzlgdx.practice.day0803;

import com.lzlgdx.Utils;

import java.util.Random;

/**
 * @className: Practice01.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/03 下午 05:19
 * @Description:
 * 随机生成1-100之间的数字，用户猜数字，大了就提示大了，小了就提示小了
 * 猜中则输出你答对了,限制猜10次
 */
public class Practice01 {
    public static void print(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {
        int random=Math.abs(new Random().nextInt()%100+1);
        int num;
        print("游戏开始，输入1~100之间的某个数字");
        int i=10;
        print(random);
        do {
            print("你还有"+i+"次机会");
            num=Utils.getScannerInstance().nextInt();
            if (num>random){
                print("你猜大了");
            }else if(num<random){
                print("你猜小了");
            }else {
                print("你猜对了");
                System.exit(0);
            }
            i--;
        }while (i > 0);
        String str=i==0?"很可惜，机会用完了,正确答案："+random:"";
        print(str);
    }
}
