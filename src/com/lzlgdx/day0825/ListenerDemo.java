package com.lzlgdx.day0825;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 下午 03:46
 * @Description
 */
public class ListenerDemo {

    public static void main(String[] args) {
        new ListenerDemo().init();
    }

    public class MyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("sb,点你妈呢，别点了！");
        }
    }
    public void init(){
        JFrame jFrame=new JFrame("BorderLayout默认布局");
        JPanel jPanel=new JPanel();


        MyListener listener=new MyListener();
        JButton b=new JButton("点我");
        b.addActionListener(listener);

        jPanel.add(b);
        jFrame.add(jPanel);

        jFrame.setSize(500,500);
        //设置窗体关闭程序关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}

