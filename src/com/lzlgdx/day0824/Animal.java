package com.lzlgdx.day0824;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/24 下午 06:27
 * @since jdk1.0
 */
public class Animal {
    public void ha() throws FileNotFoundException{

    }
    public void eat() throws NullPointerException{
        throw new RuntimeException();
    }

    public void study() throws Exception {
        throw new Exception();
    }
    public void play() throws NullPointerException,IOException{
        String s=new Scanner(System.in).next();
        System.out.println(s.length());
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("子类方法可以不跑出运行时才可以检测到的异常");
        super.eat();
    }

    @Override
    public void study() throws Exception {
        super.study();
        System.out.println("study");
    }

    @Override
    public void play() throws IOException {
        super.play();
        System.out.println("子类可以抛出父类方法的部分异常");
    }

    @Override
    public void ha(){
        try{
            super.ha();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("子类捕获并处理父类方法的异常，不抛出异常");
        }
    }
}
