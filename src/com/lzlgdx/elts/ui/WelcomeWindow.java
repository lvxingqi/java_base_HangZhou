package com.lzlgdx.elts.ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 09:38
 * @Description
 */
public class WelcomeWindow extends AbstractBaseUIWindow {
    private static final long serialVersionUID = 7336638475586250200L;
    @Override
    JPanel createTopPane() {
        JPanel panel=new JPanel(new BorderLayout());
        //创建一个标签JLabel并设置背景
        JLabel label=new JLabel(new ImageIcon("elts/welcome.png"));
        //将标签添加到面板的中部位置
        panel.add(label,BorderLayout.CENTER);
        return panel;
    }
    @Override
    JPanel createCenterPane() {
        return null;
    }
    @Override
    JPanel createBottomPane() {
        return null;
    }

    @Override
    public boolean borderIsSet(){
        return false;
    }
}