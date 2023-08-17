package com.lzlgdx.practice.day0803;

import com.lzlgdx.Utils;
import java.util.Random;

/**
 * @className: Practice02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/03 下午 05:28
 * @Description:
 * 运行程序,一次提示输出10道数字加法题目,数字速记
 * 可以从控制台输入答案。每答完一道题继续下一题
 * 每一道题答对或答错要给出提示,10道题结束后,系统计算出
 * 总得分并输出,1题10分,共100分
 */
public class Practice02 {
    public static void print(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Random random=new Random();
        int i=1;
        int right=0;
        while (i<=10){
            int a=random.nextInt()%100+1;
            int b=random.nextInt()%100+1;
            print(i+"、("+a+")+("+b+")=");
            print("请输入你的答案：");
            int getNum= Utils.getScannerInstance().nextInt();
            if (a+b==getNum){
                print("正确");
                right++;
            }else {
                print("错误");
            }
            i++;
        }
        print("总得分："+right*(i-1));

    }
}
