package com.lzlgdx.day0810;
/** super关键字的语法
 * @author 20141*/
public class Demo03 {
    public static void main(String[] args) {
        Coo coo=new Coo();
        coo.study();
    }
}
/**父类*/
class Coo{

    public int a;
    public Coo(){
        System.out.println("父类...无参构造");
    }
    public void study(){
        System.out.println("父类...学习...");
    }
}

class Doo extends Coo{
    public int b;

    /**构造方法*/
    public Doo(){
        System.out.println(super.a);
        super.study();
        System.out.println("子类...无参构造");
        study();
    }

    @Override
    public void study() {
        System.out.println("子类...学习...");
    }

    public void eat(){
        super.study();
        System.out.println("子类...吃...");
    }
}

