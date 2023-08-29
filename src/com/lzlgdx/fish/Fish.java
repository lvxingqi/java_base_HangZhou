package com.lzlgdx.fish;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 10:34
 * @Description 让Fish类继承Thread，继承以后，Fish类具有并发执行的特性
 */
public class Fish extends Thread{
    private static final long serialVersionUID = -5667371495326512686L;
    private BufferedImage type;
    private String filePathname="images/fish03_03.png";
    private int width;
    private int height;
    private int x;
    private int y;

    public String getFilePathname() {
        return filePathname;
    }

    public void setFilePathname(String filePathname) {
        this.filePathname = filePathname;
    }

    public Fish() throws IOException {
        x=400;
        y=200;
        type= ImageIO.read(new File(filePathname));
        width=type.getWidth();
        height=type.getHeight();
    }

    @Override
    public void run() {
        //死循环,让鱼直线往前游，y坐标不变，x坐标减小
        while (true){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            x--;
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
