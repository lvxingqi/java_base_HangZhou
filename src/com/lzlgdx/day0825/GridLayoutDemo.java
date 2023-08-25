package com.lzlgdx.day0825;

import javax.swing.*;
import java.awt.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 下午 03:32
 * @Description
 */
public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("BorderLayout默认布局");
        JPanel jPanel=new JPanel();

        GridLayout gridLayout=new GridLayout(3,2);
        jFrame.setLayout(gridLayout);


        JButton b1=new JButton("按钮1");
        JButton b2=new JButton("按钮2");
        JButton b3=new JButton("按钮3");
        JButton b4=new JButton("按钮4");
        JButton b5=new JButton("按钮5");
        JButton b6=new JButton("按钮6");

        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(b3);
        jFrame.add(b4);
        jFrame.add(b5);
        jFrame.add(b6);



        jFrame.setSize(500,500);
        //设置窗体关闭程序关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
