package com.lzlgdx.practice.day0802;

import com.lzlgdx.Utils;

/**
 * @className: Practice05.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/02 下午 03:58
 * @Description:
 * 练习5:输入3个整数，对这3个整数进行排序
 * a=10 b=2 c=5
 * a=2 b=5 C=10
 */
public class Practice05 {
    public static void print(Object obj) {
        System.out.println(obj);
    }
    public static void sort(int a,int b,int c){
        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        if (a>c){
            int temp=a;
            a=c;
            c=temp;
        }
        if (b>c){
            int temp=b;
            b=c;
            c=temp;
        }
        print(a);
        print(b);
        print(c);
    }
    public static void bubbleSort(int []nums){
        //冒泡排序总是相邻元素比较，每一次外循环都将最大的数字给冒泡到最后面
        for (int i = 0; i <nums.length-1;i++){
            //如果没有交换说明是有序的
            boolean flag=false;
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
    public static void printNums(int []nums){
        for (int a:nums
        ) {
            print(a+" ");
        }
    }
    public static void main(String[] args) {
        int []nums=new int[3];
        print("请输入三个数，输入一个数就按[enter]一次");
        for (int i = 0; i <nums.length;i++){
            nums[i]=Utils.getScannerInstance().nextInt();;
        }
        sort(nums[0],nums[1],nums[2]);
    }
}
