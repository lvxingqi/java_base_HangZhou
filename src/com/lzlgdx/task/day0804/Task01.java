package com.lzlgdx.task.day0804;

import com.lzlgdx.Utils;

/**
 * @className: Task01.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/04 下午 05:56
 * @Description: 要求从控制台输入拍一个班级的班级人数,
 * 根据班级人数再从控制台输入对应的学生姓名
 * 和成绩,并将姓名和成绩分别保存到两个数组中
 * 存储成功以后,计算全班同学的总分,平均分,最高分,
 * 最低分和最高分对应的学生的名字,
 * 以上计算的结果全部输出
 */
public class Task01 {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        //班级人数,学生姓名数组,分数数组,总分,平均分,最高分及其姓名,最低分及其姓名
        print("请输入班级人数");
        int quantityOfClass = Utils.getScannerInstance().nextInt();
        String[] name = new String[quantityOfClass];
        int[] score = new int[quantityOfClass];
        int scoreOfAll = 0;
        double averageScore;
        int highestScore = 0;
        StringBuilder highestScorePerson= new StringBuilder();
        int lowestScore = 101;
        String lowestScorePerson="";
        for (int i = 0; i < quantityOfClass; i++) {
            print("输入第" + (i + 1) + "位学生的名字：");
            name[i] = Utils.getScannerInstance().next();
            print("输入第" + (i + 1) + "位学生的成绩：");
            score[i] = Utils.getScannerInstance().nextInt();
            scoreOfAll += score[i];
            if (score[i] > highestScore) {
                highestScore = score[i];
                highestScorePerson = new StringBuilder(name[i]);
            }else if (score[i]==highestScore){
                highestScorePerson.append(" ").append(name[i]);
            }
            if (lowestScore<score[i]){
                lowestScore=score[i];
                lowestScorePerson=name[i];
            }
        }
        averageScore = (double) scoreOfAll / (double) quantityOfClass;

        print("班级总分："+scoreOfAll);
        print("班级平均分："+averageScore);
        print("姓名"+highestScorePerson+",最高分："+highestScore);
        print("姓名"+lowestScorePerson+",最低分："+lowestScore);


    }
}
