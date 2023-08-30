package com.lzlgdx.myfish;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 10:34
 * @Description 让Fish类继承Thread，继承以后，Fish类具有并发执行的特性
 */
public class Fish extends Thread{
    private static final long serialVersionUID = -5667371495326512686L;
    private final Random r=new Random();
    private BufferedImage type;
    private int width;
    private int height;
    private int x;
    private int y;
    //鱼的速度1~5随机
    private int step;


    //从很多鱼中随机挑一条鱼
    public String getCurrentPathname() {
        return "images/"+filePathname[r.nextInt(4)];
    }

    //鱼的不通种类
    private final String[] filePathname={"fish01_00.png","fish02_00.png","fish03_00.png","fish04_00.png"};




    public Fish() throws IOException {
        x=800;
        y=600;
        type= ImageIO.read(new File(getCurrentPathname()));
        width=type.getWidth();
        height=type.getHeight();
        step=new Random().nextInt(5)+1;
    }

    @Override
    public void run() {
        //死循环,让鱼直线往前游，y坐标不变，x坐标减小
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(x);
            x-=step;
            //鱼超出屏幕就重新进入池塘
            if (x<=-width){
                x=800;
                //让鱼随机位置进入池塘
                y=r.nextInt(600)+1;
                //每次鱼进来的速度都不一样
                step=r.nextInt(5)+1;
                //每次进来的鱼都不一样
                getCurrentPathname();
            }
        }
    }

    public BufferedImage getType() {
        return type;
    }

    public void setType(BufferedImage type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}
