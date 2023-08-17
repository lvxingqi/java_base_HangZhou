package com.lzlgdx.day0810;

public class Demo01 {
    public static void main(String[] args) {
        /*创建父类Foo*/
        /*Foo fi=new Foo();*/

        Goo g1=new Goo();
        System.out.println(g1.getValue());

    }
}

/**
 * 外部类
 */
class Foo{
    private int value;
    public Foo(){
        System.out.println("Foo无参构造");
    }
    public Foo(int value){
        System.out.println("Foo的有参构造");
        this.value=5;
    }

    /**成员变量*/
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

/**子类*/
class Goo extends Foo{
    /**成员变量*/
    public int num;
    public Goo(){
//        super();
        super(5);
        System.out.println("Goo无参构造");

    }
}
