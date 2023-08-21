package com.lzlgdx.day0821;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/21 上午 10:20
 * @since jdk1.0
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("e");
        System.out.println(queue);
        queue.offer("f");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
