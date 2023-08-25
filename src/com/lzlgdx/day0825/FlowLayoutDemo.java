package com.lzlgdx.day0825;

import javax.swing.*;
import java.awt.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 下午 02:30
 * @Description FlowLayout布局测试
 */
public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("流式布局");
//        JPanel jPanel=new JPanel();
        //创建布局管理器
        //流式布局管理器，从上往下，从左往右，居中对齐

        //设置flowlayout的对齐方式
//        FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT);

        //创建面板，创建FlowLayout
        //设置对其方式，设置组件和容器之间的水平间距和垂直间距

        FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,100,200);


        //创建一个JPanel
        JPanel jPanel=new JPanel(flowLayout);

        JButton b1=new JButton("点我");
        JButton b2=new JButton("点我");
        JButton b3=new JButton("点我");
        JButton b4=new JButton("点我");
        JButton b5=new JButton("点我");
        JButton b6=new JButton("点我");
        JButton b7=new JButton("点我");
        JButton b8=new JButton("点我");

        jPanel.add(b1);
        jPanel.add(b1);
        jPanel.add(b2);
        jPanel.add(b3);
        jPanel.add(b4);
        jPanel.add(b5);
        jPanel.add(b6);
        jPanel.add(b7);
        jPanel.add(b8);


        jFrame.add(jPanel);


        jFrame.setSize(500,500);
        //设置窗体关闭程序关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
