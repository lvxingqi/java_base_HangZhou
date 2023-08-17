package com.lzlgdx.day0810;

/**
 * @author 20141
 */
public class Demo02 {
    public static void main(String[] args) {
        Aoo aoo=new Aoo();
        //当父类方法被子类重写以后，不论父类还是子类对象就只能调用重写以后的方法了
        aoo.say();
        //aoo可以引用访问Aoo成员变量
        aoo.a=5;
        Sub sub=new Sub();
        sub.a=6;
        sub.b=7;
        sub.say();
        sub.show();
        //向上转型后的对象无法调用自己的方法，只能调用父类的方法，但是可以调用重写后的父类方法
        Aoo aoo1=new Sub();
        aoo1.say();
        //方法的重写，方法名和参数列表与父类的一致，如果是void和八种基本类型，
        // 返回值必须和父类相同，
        // 否则，返回值可以是父类该方法返回值的可以小于等于父类引用类型（返回值是引用数据类型），

    }
}
class Aoo{
    /**成员变量*/
    public int a;
    private int c;

    /**方法*/
    public void say(){
        System.out.println("父类Aoo..say...");
    }

    public double getMoney(double money){
        return 200.5;
    }

    public Animal getAnimal(){
        return new Animal();
    }
}

class  Sub extends Aoo{
    /**成员变量*/
    public int b;

    /**方法*/
    public void show(){
        System.out.println("子类...show...");
    }

    public void say(){
        System.out.println("子类...say...");
    }

    public double getMoney(double money){
        return 100.2;
    }


    public Cat getAnimal(){
        return new Cat();
    }


}
class Animal{

}
class Cat extends Animal{

}
class Dog{

}