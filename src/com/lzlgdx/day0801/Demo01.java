package com.lzlgdx.day0801;

/**
 * @className: Bank.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/01 上午 09:18
 * description:基本数据类型--long类型
 */
public class Demo01 {
    public static void main(String[] args) {
        //(1)long类型的取值范围
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //(2)long类型的直接量写法

        //long a=1000000000000000000; 编译错误
        long b=1000000000000000000L;
        long c=1000;
        //(3)long类型参与运算
        //计算1光年的传播距离 光速299792458m/s
        long aDistanceOfOneLightYear= 365 * 24 * 60 * 60 * 299792458L;
        System.out.println(aDistanceOfOneLightYear);
        int aDistanceOfOneLight2=365 * 24 * 60 * 60 * 299792458;
        System.out.println(aDistanceOfOneLight2);

        //（4）long类型表示时间
        System.out.println(System.currentTimeMillis());

    }
}
