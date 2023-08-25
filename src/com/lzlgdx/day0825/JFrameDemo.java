package com.lzlgdx.day0825;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 上午 10:44
 * @Description
 */
public class JFrameDemo {
    public static void main(String[] args) throws IOException {
        JFrame jFrame=new JFrame();
        jFrame.setBounds(300,300,500,500);
        jFrame.setTitle("捕鱼大人");
        //设置窗口关系自动关闭程序
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        File file=new File("images/icon.jpg");
        //读图片的类很有用
        BufferedImage bi= ImageIO.read(file);
        jFrame.setIconImage(bi);
        jFrame.setVisible(true);
    }
}
