package com.lzlgdx.day0802;

import com.lzlgdx.Utils;

import java.util.Scanner;
import java.util.function.Consumer;

/**
 * @className: Demo02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/02 下午 02:16
 * @Description: 分支结构--if语句结构
 */
public class Demo02 {
    public static void print(Object obj) {
        System.out.println(obj);
    }
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //1、if语句结构
        int num = 5;
        //判断if是否是偶数，如果是偶数输出，否则什么也不做
        if (num % 2 == 0) {
            print(num + "是偶数");
        }

        //if...else语句结构
        int num1 = 3;
        //判断num1是奇数还是偶数
        if (num1 % 2 == 0) {
            print(num1 + "是偶数");
        } else {
            print(num1 + "是奇数");
        }

        //if...else结构
        print("请输入你的成绩");
        double score = sc.nextDouble();
        print("请输入你的性别");
        String sex = sc.next();
        if (score <= 10) {
            if ("男".equals(sex)) {
                print("进入男子组决赛");
            } else {
                print("进入女子组决赛");
            }
        } else {
            print("未进入决赛");
        }

        //3、if...else if..else语句结构
        /**成绩小于0或大于100，成绩有误
         * 成绩在[90-100]之间，成绩A优秀
         * 成绩在[80-90]之间，成绩B良好
         * 成绩在[60-80}之间，成绩C中等
         * 成绩在[0-60]之间，成绩D不及格
         * */
        int score1 = sc.nextInt();
        if (score1 < 0 || score1 > 100) {
            print("成绩不合法");
        } else if (score1 >= 90) {
            print("A优秀");
        } else if (score1 >= 80) {
            print("B良好");
        } else if (score1 >= 60) {
            print("C中等");
        } else {
            print("D不合格");
        }
    }


}
