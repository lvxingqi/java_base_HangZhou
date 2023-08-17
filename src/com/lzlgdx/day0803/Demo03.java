package com.lzlgdx.day0803;

/**
 * @className: Demo03.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/03 下午 03:11
 * @Description:
 * 成绩小于0或大于100，成绩有误
 *          * 成绩在[90-100]之间，成绩A优秀
 *          * 成绩在[80-90]之间，成绩B良好
 *          * 成绩在[60-80}之间，成绩C中等
 *          * 成绩在[0-60]之间，成绩D不及格
 */
public class Demo03 {
    public static void print(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args) {
        int score=66;
        if (score<0||score>100){
            print("成绩有误");
        }else{
            switch(score/10){
                case 10:
                case 9:
                    print("A 优秀");
                    break;
                case 8:
                    print("B良好");
                    break;
                case 7:
                case 6:
                    print("C一般");
                    break;
                default:
                    print("不及格");
            }
        }
    }
}
