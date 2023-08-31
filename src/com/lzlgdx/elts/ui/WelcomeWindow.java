package com.lzlgdx.elts.ui;

import com.lzlgdx.elts.utils.ReadImage;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 09:38
 * @Description
 */
public class WelcomeWindow extends JFrame {

    public WelcomeWindow() {
        init();
    }

    //初始化窗体界面
    public void init(){
        //创建面板并设置布局管理器
        JPanel panel=new JPanel(new BorderLayout());

        //创建一个图标ImageIcon
        ImageIcon icon=new ImageIcon("elts/welcome.png");
        //创建一个标签JLabel并设置背景
        JLabel label=new JLabel(icon);

        //将标签添加到面板的中部位置
        panel.add(label,BorderLayout.CENTER);
        //将面板添加到窗体中
        add(panel);

        setSize(430,300);
        setLocationRelativeTo(null);
        //要有专门的类控制哪个窗体可见
        //setVisible(true);
        setDefaultCloseOperation(WelcomeWindow.EXIT_ON_CLOSE);

    }




}
