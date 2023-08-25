package com.lzlgdx.day0825;

import javax.swing.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 上午 11:14
 * @Description
 */
public class JButtonDemo {
    public static void main(String[] args) {
        //创建窗体
        JFrame jFrame=new JFrame();
        jFrame.setTitle("标签");
        //jFrame.setBounds(200,200,400,400);


        //创建按钮
        JButton jButton=new JButton("点我");
        JButton jButton2=new JButton();
        //创建面板
        JPanel jPanel=new JPanel();
        //将按钮放入面板
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jButton2.setText("确定");
        //将面板放入窗体
        jFrame.add(jPanel);
        jFrame.setSize(500,500);
        //设置窗体关闭程序关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }
}
