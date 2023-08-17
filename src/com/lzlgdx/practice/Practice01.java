package com.lzlgdx.practice;

import java.util.Arrays;

/**
 * @className: Practice01.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/07 上午 11:57
 * @Description: 二维数组定义的方式输出一首诗的内容
 * 床前明月光，疑是地上霜，举头望明月，低头思故乡
 * 低 举 疑 床
 * 头 头 是 前
 * 思 望 地 明
 * 故 明 上 月
 * 乡 月 霜 光
 */
public class Practice01 {
    public static void main(String[] args) {
        String[][] poem = {
                {"床", "前", "明", "月", "光"},
                {"疑", "是", "地", "上", "霜"},
                {"举", "头", "望", "明", "月"},
                {"低", "头", "思", "故", "乡"}
        };
        //现代写法
        for (int i = 0; i < poem.length; i++) {
            for (int j = 0; j < poem[i].length ; j++) {
                System.out.print(poem[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("==================");
        //古代写法
        for (int j = 0; j < poem[0].length; j++) {
            for (int i =poem.length-1 ; i >=0 ; i--) {
                System.out.print(poem[i][j]+" ");
            }
            System.out.println();
        }
    }
}
