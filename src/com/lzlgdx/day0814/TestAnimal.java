package com.lzlgdx.day0814;

import org.junit.Test;

/**
 * @version java基础.1.0
 * @Description: 测试类
 * @author: 吕星琪
 * @Date: 2023/8/14 上午 11:23
 */
public class TestAnimal {
    @Test
    public void test(){
        Animal animal=new Cat();
        animal.shout();
        Animal animal1=new Animal() {
            @Override
            public void shout() {
                System.out.println("dog,wang...wang...wang");
            }
        };
        animal1.shout();
    }
}
