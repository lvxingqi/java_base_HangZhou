package com.lzlgdx.task.day0807;

import com.lzlgdx.Utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * @className: Task01.java
 * @author: QQ:2014178096
 * @version: 1.0.0
 * @Date: 2023/08/07 下午 03:22
 * @Description: 猜字母游戏 大写字母
 */
public class Task01 {
    private static final int SIZE=5;
    public static void getSequenceOfChar(char[] chars) {
        Random random=new Random();
        HashSet<Character> characters = new HashSet<>();
        int i = 0;
        while (i < SIZE) {
            int value=random.nextInt(25)+65;
            chars[i] = (char) (value);
            if (characters.add(chars[i])) {
                i++;
            }
        }
    }
    public static boolean checkLength(char[] chars,String str){
        char[] inputChars = str.toCharArray();
        return inputChars.length==chars.length;
    }
    public static int check(char[] chars, String str) {
        int count = 0;
        char[] inputChars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (inputChars[i]==chars[i]){
                count++;
            }
        }
        return count;
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        char[] chars = new char[SIZE];
        //获取5个字母的不重复字符序列
        getSequenceOfChar(chars);
        print(Arrays.toString(chars));
        print("欢迎尝试猜字母游戏：");
        print("满分500分，猜错一次扣10分");
        String input;
        int j=0;
        int i = 0;
        do {
            print("请输入你所猜的5个字母序列");
            input = Utils.getScannerInstance().next();
            if (checkLength(chars,input)){
                j = check(chars, input);
                print("你猜对了" + j + "个字符,");
            }else {
                print("字符序列长度不够！！！");
            }
            i++;
        } while (i < 50 && j!=5);
        print("得分"+(50-i+1)*10);

    }
}
