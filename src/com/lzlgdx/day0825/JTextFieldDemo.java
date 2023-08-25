package com.lzlgdx.day0825;

import javax.swing.*;
import java.util.Objects;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 上午 11:46
 * @Description
 * JTextField 单行文本输入框
 * JPasswordField
 */
public class JTextFieldDemo {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("单行文本框");
        JPanel jPanel=new JPanel();

        JTextField jTextField=new JTextField(50);
        jTextField.setEditable(true);

        JPasswordField jPasswordField=new JPasswordField(50);


        jPanel.add(jPasswordField);
        jPanel.add(jTextField);
        jFrame.add(jPanel);

        jFrame.setSize(500,500);
        //设置窗体关闭程序关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
