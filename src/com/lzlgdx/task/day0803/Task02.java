package com.lzlgdx.task.day0803;

import com.lzlgdx.Utils;

/**
 * @className: Task02.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/03 上午 09:25
 * @Description:
 * 控制台输入收入，计算个人所得税
 */
public class Task02 {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        print("输入月工资");
        //月工资
        double salary= Utils.getScannerInstance().nextDouble();
        //个税起征点
        print("个税起征点默认3500");
        int start=5000;
        //应交税部分
        double kSal =salary-start;
        //应缴的个人所得税
        double taxes;

        if (kSal<=0){
            taxes=0.0;
        }else if (kSal<3000){
            taxes=kSal*0.03;
        }else if(kSal<12000){
            taxes=3000*0.03+(kSal-3000)*0.1;
        }else if (kSal<25000){
            taxes=3000*0.03+9000*0.1+(kSal-12000)*0.2;
        }else if (kSal<35000){
            taxes=3000*0.03+9000*0.1+13000*0.2
                    +(kSal-25000)*0.25;
        }else if (kSal<55000){
            taxes=3000*0.03+9000*0.1+13000*0.2+10000*0.25
                    +(kSal-35000)*0.3;
        }else if (kSal<80000){
            taxes=3000*0.03+9000*0.1+13000*0.2+10000*0.25
                    + 20000*0.3+(kSal-55000)*0.35;
        }else {
            taxes=3000*0.03+9000*0.1+13000*0.2+10000*0.25
                    + 20000*0.3+25000*0.35+(salary-80000)*0.45;
        }
        //七个等级
        /*if (kSal<=0){
            taxes=0.0;
        }else if (kSal<1500){
            taxes=kSal*0.03;
        }else if(kSal<4500){
            taxes=1500*0.03+(kSal-1500)*0.1;
        }else if (kSal<9000){
            taxes=1500*0.03+3000*0.1+(kSal-4500)*0.2;
        }else if (kSal<35000){
            taxes=1500*0.03+3000*0.1+4500*0.2
                    +(kSal-9000)*0.25;
        }else if (kSal<55000){
            taxes=1500*0.03+3000*0.1+4500*0.2+26000*0.25
                    +(kSal-35000)*0.3;
        }else if (kSal<80000){
            taxes=1500*0.03+3000*0.1+4500*0.2+26000*0.25
                    + 20000*0.3+(kSal-55000)*0.35;
        }else {
            taxes=1500*0.03+3000*0.1+4500*0.2+26000*0.25
                    +20000*0.3+25000*0.35+(salary-80000)*0.45;
        }*/

        print("你应该缴税"+taxes+"元");
        print("实际所得"+(salary-taxes)+"元");
    }
}
