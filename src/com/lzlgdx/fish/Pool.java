package com.lzlgdx.fish;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 09:45
 * @Description
 */
public class Pool extends JPanel {
    //一、特征    --属性/成员变量
    //1、池塘的环境(水，岩石，水草)
    //2、鱼
    //3、渔网
    private ImageIcon bg;
    private Fish fish;

    public void setBg(ImageIcon bg) {
        this.bg = bg;
    }

    public ImageIcon getBg() {
        return bg;
    }

    public Fish getFish() {
        return fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    private static final long serialVersionUID = 5887448250075808839L;


    public Pool() throws IOException {
        //完成对bg成员变量的赋值
        bg=new ImageIcon("images/bg.jpg");
        //创建一条鱼
        fish=new Fish();
        fish.start();
    }

    //三、行为 --方法
    //绘画的行为 -- paint方法
    @Override
    public void paint(Graphics g) {
        g.drawImage(bg.getImage(),0,0,getWidth(),getHeight(),this);
        g.drawImage(fish.getType(),fish.getX(),fish.getY(),null);
    }

    public void action(){
        while (true){
            repaint();
        }
    }
}
