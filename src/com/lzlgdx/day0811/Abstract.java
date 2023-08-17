package com.lzlgdx.day0811;

/**
 * @version java基础.1.0
 * @Description: 抽象类
 * @author: 吕星琪
 * @Date: 2023/8/11 下午 02:38
 */
public class Abstract {
    public static void main(String[] args) {
        Animal cat=new Cat();
        cat.shout();
        Dog dog=new Dog();
        dog.shout();
        dog.play();
        dog.run();
    }
}

abstract class Animal{
    public void run(){
        System.out.println("run...");
    }
    /**抽象方法*/
    abstract void shout();
}
class Cat extends Animal{

    @Override
    void shout() {
        System.out.println("喵喵喵...");
    }
}

class Dog extends Animal{

    @Override
    void shout() {
        System.out.println("汪汪汪...");
    }
    public void play(){
        System.out.println("play...");
    }
}
