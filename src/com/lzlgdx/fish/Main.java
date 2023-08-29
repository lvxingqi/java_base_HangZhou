package com.lzlgdx.fish;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 09:21
 * @Description 运行捕鱼达人游戏的主类
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //创建JFrame窗体界面
        new Main().init();

    }

    public void init() throws IOException {
        JFrame w=new JFrame("捕鱼达人");
        JPanel p=new JPanel();
        w.setBounds(300,50,800,600);

        //设置图标
        File file=new File("images/bg.jpg");
        BufferedImage bi= ImageIO.read(file);
        w.setIconImage(bi);

        Pool pool=new Pool();
        w.add(pool);

        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
    }
}
