package com.lzlgdx.day0821;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 上午 10:58
 * @since jdk1.0
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack=new LinkedList<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        for (int i=stack.size()-1;i>=0;i--){
            String str=stack.pop();
            System.out.print(str+" ");
        }
        System.out.println(stack);
    }
}
