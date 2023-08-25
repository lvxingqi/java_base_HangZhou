package com.lzlgdx.day0825;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 上午 11:28
 * @Description 标签用来展示静态资源
 */
public class JLabelDemo {
    public static void main(String[] args) throws IOException {
        //创建窗体
        JFrame jFrame=new JFrame();
        JPanel jPanel=new JPanel();
        //创建一个标签，显示文字
        JLabel jLabel=new JLabel("你好");
        System.out.println(jLabel.getText());

        //创建一个标签，用来显示图片
        JLabel jLabel2=new JLabel();
        //创建图片
        File file=new File("images/icon.jpg");
        BufferedImage image= ImageIO.read(file);

        //创建一个图标，将图片放入图标中，将图标放入标签中
        ImageIcon imageIcon=new ImageIcon();
        imageIcon.setImage(image);
        jLabel2.setIcon(imageIcon);

        jPanel.add(jLabel2);
        jPanel.add(jLabel);

        jFrame.add(jPanel);

        jFrame.setTitle("按钮");
        jFrame.setSize(600,600);
        //设置窗体关闭程序关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
