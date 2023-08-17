package com.lzlgdx.day0811;

/**
 * @version java基础.1.0
 * @Description: 求面积的抽象类
 * @author: 吕星琪
 * @Date: 2023/8/11 下午 03:13
 */
public abstract class Shape {
    public static void main(String[] args) {
        Shape circle=new Circle(2);
        System.out.println(circle.area());
        Shape square=new Square(5);
        System.out.println(square.area());
        drawMap(new Square(6));
        /*Circle c1=(Circle) circle;
        c1.draw();
        Square s1=(Square) circle;
        s1.draw();*/

        if (circle instanceof Circle){
            Circle c1=(Circle) circle;
            c1.draw();
        }else if(circle instanceof Square){
            Square s1=(Square) circle;
            s1.draw();
        }


    }
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public double c=0;
    /**
     * @Description 求图形的面积，此类为父类
     * @Param  没有参数
     * @return double 返回double类型的面积值
     */
    public abstract double area();

    public abstract void draw();
}
/**圆形*/
class Circle extends Shape{
    public Circle(int c){
        super.c=c;
    }
    @Override
    public double area() {
        return Math.PI*c*c;
    }

    @Override
    public void draw() {
        System.out.println("画⚪");
    }
}
/**正方形*/
class Square extends Shape{
    public Square(int c){
        super.c=c;
    }
    @Override
    public double area() {
        return c*c;
    }

    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
