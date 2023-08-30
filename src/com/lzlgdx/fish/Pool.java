package com.lzlgdx.fish;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Date;

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
    private final ImageIcon bg;

    public void setNet(Net net) {
        this.net = net;
    }

    private Net net;

    //private final Fish fish=new Fish();

    private final Fish[] fs=new Fish[11];
    //某条鱼是否被抓住的标记数组
    private final boolean[] Caught=new boolean[fs.length];
    private static final long serialVersionUID = 5887448250075808839L;
    public Pool() throws IOException {
        //完成对bg成员变量的赋值
        bg=new ImageIcon("images/bg.jpg");
        //初始化一张网
        this.net=new Net();
        //创建一条鱼
        for (int i=0;i<fs.length;i++){
            fs[i]=new Fish("fish0"+(i+1));
            fs[i].start();
        }
    }

    //三、行为 --方法
    //绘画的行为 -- paint方法
    @Override
    public void paint(Graphics g) {
        g.drawImage(bg.getImage(),0,0,getWidth(),getHeight(),this);
        for (Fish f : fs) {
            g.drawImage(f.getType(), f.getX(), f.getY(), null);
        }
        //因为鼠标在渔网的左上方
        //渔网左移width/2，上移height/2
        int xx=net.getX()-net.getNet().getWidth()/2;
        int yy=net.getY()-net.getNet().getHeight()/2;
        if (net.isShow()){
            //画渔网
            g.drawImage(net.getNet(),xx,yy,null);
        }
        //将count的值画在池塘中
        g.setColor(Color.RED);
        //设置字体，字形，大小
        Font font=new Font("楷体",Font.BOLD,20);
        g.setFont(font);
        g.drawString(count+"",50,50);
        //创建时间Date,并画在池塘中
        Date date=new Date();
        g.drawString(date.toString(),50,70);
    }

    public void action(){
        MouseAdapter mouse=new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                net.setX(e.getX());
                net.setY(e.getY());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //鼠标离开
                net.setShow(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //鼠标进入
                net.setShow(true);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                catchFish();
            }
        };
        this.addMouseListener(mouse);
        this.addMouseMotionListener(mouse);
        setNet(net);
        while (true){
            repaint();
        }
    }
    //捕获鱼的条数，初始值为0
    private int count;
    public void catchFish(){
        for (int i=0;i<fs.length;i++){
            Fish fish=fs[i];
            boolean result=net.isCanCatchFish(fish);
            if (result){
                fish.setCatch(true);
                count++;
            }
        }
    }


}
