package com.lzlgdx.day0821;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 上午 10:42
 * @since jdk1.0
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque=new LinkedList<>();
        deque.offerFirst("a");
        deque.offerFirst("b");
        deque.offerFirst("c");
        System.out.println(deque);
        deque.offerLast("d");
        deque.offerLast("e");
        System.out.println(deque);

        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
    }
}
