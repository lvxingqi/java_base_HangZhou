package com.lzlgdx.elts.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/1 上午 10:45
 * @Description 主菜单界面设计
 */
public class MenuWindow extends AbstractBaseUIWindow {
    private static final long serialVersionUID = 5545426147183860184L;
    //欢迎xxx的标签
    private JLabel info;
    @Override
    public JPanel createTopPane(){
        JPanel panel=new JPanel();
        JLabel label=new JLabel(new ImageIcon("elts\\tarena.png"),JLabel.CENTER);
        panel.setSize(50,30);
        panel.add(label);
        return panel;
    }

    @Override
    public JPanel createCenterPane(){
        JPanel panel=new JPanel(new BorderLayout());

        panel.setBorder(new EmptyBorder(25,0,0,0));

        info=new JLabel("",JLabel.CENTER);

        panel.add(BorderLayout.CENTER,createButtonPane());
        panel.add(BorderLayout.NORTH,info);
        return panel;
    }

    @Override
    public JPanel createBottomPane(){
        JPanel panel=new JPanel(new BorderLayout());
        JLabel label=new JLabel("版权所有 盗版必究");
        Font font=new Font("楷体",Font.BOLD,10);
        label.setFont(font);
        panel.add(BorderLayout.EAST,label);
        return panel;
    }

    @Override
    public void setExamSize(){
        this.setSize(600,400);
    }

    private JButton start,result,msg,exit;
    private JPanel createButtonPane(){
        JPanel panel=new JPanel();

        start=createButtonImage("elts\\exam.png","开始");
        result=createButtonImage("elts\\result.png","分数");
        msg=createButtonImage("elts\\message.png","考试规则");
        exit=createButtonImage("elts\\exit.png","退出");

        ButtonWasClicked buttonWasClicked=new ButtonWasClicked();

        start.addMouseListener(buttonWasClicked);
        result.addMouseListener(buttonWasClicked);
        msg.addMouseListener(buttonWasClicked);
        exit.addMouseListener(buttonWasClicked);

        panel.add(start);
        panel.add(result);
        panel.add(msg);
        panel.add(exit);

        return panel;

    }

    private JButton createButtonImage(String img,String txt){
        ImageIcon icon=new ImageIcon(img);
        JButton button= new JButton(txt,icon);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        return button;
    }

    public void updateView(String info) {
        this.info.setText("欢迎"+info+"同学参加考试");
    }

    //4个按钮按下监听器
    class ButtonWasClicked extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton button=(JButton)e.getSource();
            if (button==start){
                AbstractBaseUIWindow.getClientContext().startExam();
            }else if (button==result){
                AbstractBaseUIWindow.getClientContext().getResult();
            } else if (button==msg) {
                AbstractBaseUIWindow.getClientContext().seeRegular();
            } else if (button==exit) {
                AbstractBaseUIWindow.getClientContext().exit(MenuWindow.this);
            }
        }
    }
}