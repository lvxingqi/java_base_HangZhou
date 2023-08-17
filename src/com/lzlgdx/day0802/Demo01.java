package com.lzlgdx.day0802;

import java.util.Scanner;

/**
 * @className: Bank.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/02 上午 09:27
 * @Description: 运算符的演示2
 */
public class Demo01 {
    public static void main(String[] args) {
        //逻辑与运算符 &&
        int score = 40;
        boolean result = score >= 60 && score <= 90;
        System.out.println(result);

        //逻辑或||
        boolean flag = true;
        int n = 200;
        boolean w = flag || (n >= 0 && n < 100);
        System.out.println(w);

        //逻辑非 ！
        int age = 30;
        boolean f1 = age > 18;
        System.out.println(f1);
        System.out.println(!f1);

        int m = 100, n1 = 200;
        boolean b3 = m > 0 || n1++ > 200;
        //b3=true
        System.out.println(b3);
        //n1=200
        System.out.println(n1);

        //赋值运算符
        int a = 10;
        System.out.println(a);
        a = a + 5;
        System.out.println(a);
        a += 5;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a++;
        System.out.println(a);

        a *= 10;
        System.out.println(a);
        a /= 10;
        System.out.println(a);
        a %= 10;
        System.out.println(a);

        System.out.println((int) '0');
        System.out.println(100 + (int) 'A');
        System.out.println((int) '0' + '1');
        System.out.println((int) ' ' + 100 + 200);
        System.out.println("0" + "1");


        //三目运算符
        int aa=100;
        int b=200;
        int num=aa>b?1:-1;
        System.out.println(num);

        Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
        String result1=c>0?"正数":(c==0?"等于0":"负数");
        System.out.println(result1);

        //练习：输入3个整数，使用三目运算符，计算三个整数中的最大值并输出；
        System.out.println("输入三个整数，得到最大值");
        int i=0;
        int []nums=new int[10];
        while (i<3){
            System.out.println("请输入第"+i+"个整数");
            nums[i]=sc.nextInt();
            i++;
        }
        int max=nums[0]>nums[1]&&nums[0]>nums[2]?nums[0]:(nums[1]>nums[2]?nums[1]:nums[2]);
        System.out.println(max);
    }
}
