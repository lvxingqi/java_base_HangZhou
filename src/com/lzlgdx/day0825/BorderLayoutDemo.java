package com.lzlgdx.day0825;

import javax.swing.*;
import java.awt.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 下午 02:54
 * @Description
 */
public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("BorderLayout默认布局");
        JPanel jPanel=new JPanel();



        JButton b1=new JButton("东");
        JButton b2=new JButton("西");
        JButton b3=new JButton("南");
        JButton b4=new JButton("北");
        JButton b5=new JButton("中");

        jFrame.add(b1,BorderLayout.EAST);
        jFrame.add(b2,BorderLayout.SOUTH);
        jFrame.add(b3,BorderLayout.WEST);
        jFrame.add(b4,BorderLayout.NORTH);
        jFrame.add(b5,BorderLayout.CENTER);


        jFrame.setSize(500,500);
        //设置窗体关闭程序关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
