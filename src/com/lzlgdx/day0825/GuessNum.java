package com.lzlgdx.day0825;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 下午 04:44
 * @Description
 */
public class GuessNum {
    private static final int number=new Random().nextInt(100)+1;
    public static void main(String[] args) {
        System.out.println("正确答案："+number);
        GuessNum gn=new GuessNum();
        gn.init();
    }

    JTextField jtf=new JTextField(5);
    JLabel tips=new JLabel("提示板：请输入0~100的数字");
    private void init() {

        JFrame w=new JFrame();//创建一个窗体
        JPanel p=new JPanel();//创建一个面板
        w.setBounds(600,300,400,400);
        w.setTitle("猜数字游戏");

        JLabel label=new JLabel("请输入你要猜的数字");
        JButton button=new JButton("请猜");
        JPanel p2=new JPanel();

        MyBtnClick listener=new MyBtnClick();
        button.addActionListener(listener);

        //给输入框绑定键盘监听事件
        jtf.addKeyListener(listener);
        //采用JPanel默认布局
        p.add(label);
        p.add(jtf);
        p.add(button);
        p2.add(tips);
        w.add(p, BorderLayout.CENTER);
//        w.add(tips,BorderLayout.NORTH);
        w.add(p2,BorderLayout.WEST);
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void guess(){
        String input=jtf.getText();
        String reg="^\\d{1,3}$";
        if (!input.matches(reg)||Integer.parseInt(input)>100){
            tips.setForeground(Color.red);
            tips.setText("错误，请输入0~100的数字");
        }else {
            int guessNum=Integer.parseInt(input);
            if (guessNum<number){
                tips.setForeground(Color.red);
                tips.setText("猜小了！");
            }else if (guessNum>number){
                tips.setText("猜大了！");
            }else {
                tips.setText("猜对了！");
                tips.setForeground(Color.green);
            }
        }
        jtf.setText("");
        jtf.requestFocusInWindow();
    }

    //KeyListener 键盘监听事件

    public class MyBtnClick implements ActionListener, KeyListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            guess();
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_ENTER){
                guess();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
