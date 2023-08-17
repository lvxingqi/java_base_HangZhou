package com.lzlgdx.day0804;

import java.util.Arrays;

/**
 * @className: Demo04.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/04 下午 01:57
 * @Description:
 */
public class Demo04 {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={89,24,65,4,1,2,3,4};
        System.out.println("排序前"+ Arrays.toString(arr));
        for (int i=0;i<arr.length-1;i++){
            boolean sorted = false;
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    sorted=true;
                }
            }
            if (!sorted){
                break;
            }
        }
        System.out.println("排序后"+Arrays.toString(arr));
    }
}
