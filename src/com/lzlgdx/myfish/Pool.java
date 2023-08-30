package com.lzlgdx.myfish;

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
    private final Fish[] fs=new Fish[3];

    public void setBg(ImageIcon bg) {
        this.bg = bg;
    }

    public ImageIcon getBg() {
        return bg;
    }

    private static final long serialVersionUID = 5887448250075808839L;


    public Pool() throws IOException {
        //完成对bg成员变量的赋值
        bg=new ImageIcon("images/bg.jpg");
        //创建一条鱼
        for (int i=0;i<fs.length;i++){
            fs[i]=new Fish();
            fs[i].start();
        }
    }

    //三、行为 --方法
    //绘画的行为 -- paint方法
    @Override
    public void paint(Graphics g) {
        g.drawImage(bg.getImage(),0,0,getWidth(),getHeight(),this);
        for (Fish fish : fs) {
            g.drawImage(fish.getType(), fish.getX(), fish.getY(), null);
        }
    }

    public void action(){
        while (true){
            repaint();
        }
    }
}
