package com.lzlgdx.elts.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 10:47
 * @Description 登录界面的设计
 */
public class LoginWindow extends AbstractBaseUIWindow {

    private static final long serialVersionUID = 3423770305937062385L;

    //账号输入框
    private JTextField idField;



    //密码输入框
    private JPasswordField pwdField;
    //显示错误信息的标签
    private JLabel message;

    public void setMessage(String message) {
        this.message.setText(message);
    }

    @Override
    public JPanel createTopPane(){
        JPanel panel=new JPanel();
        JLabel label=new JLabel("登录系统");
        //设置字体相关属性
        Font font=new Font("楷体",Font.BOLD,20);
        label.setFont(font);
        panel.add(label);

        return panel;
    }

    @Override
    public JPanel createCenterPane(){
        JPanel panel=new JPanel(new BorderLayout());

        //设置边距
        panel.setBorder(new EmptyBorder(8,0,10,0));

        panel.add(BorderLayout.NORTH,createIdPwdPanel());

        message=new JLabel("",JLabel.CENTER);
        message.setForeground(Color.RED);
        panel.add(message,BorderLayout.CENTER);
        message.setBorder(new EmptyBorder(0,0,60,0));

        return panel;
    }

    @Override
    void setExamSize() {
        setSize(430,300);
    }

    @Override
    public JPanel createBottomPane() {
        JPanel panel=new JPanel();
        JButton login=new JButton("登录");
        JButton exit=new JButton("退出");

        panel.add(login);
        panel.add(exit);

        //设置回车默认按钮
        getRootPane().setDefaultButton(login);

        //绑定退出按钮监听事件
        exit.addActionListener(e -> AbstractBaseUIWindow.getClientContext().exit(LoginWindow.this));
        //登录按钮绑定事件监听
        login.addActionListener(e -> AbstractBaseUIWindow.getClientContext().login());
        return panel;
    }

    //处理显示和输入框
    private JPanel createIdPwdPanel(){
        JPanel panel=new JPanel(new GridLayout(2,1,0,15));

        //第一行的内容：编号和编号输入框
        JPanel pId=new JPanel(new BorderLayout());
        pId.add(BorderLayout.WEST,new JLabel("编号："));
        idField=new JTextField();
        pId.add(BorderLayout.CENTER,idField);
        //第二行内容：密码和密码输入框
        JPanel pPwd=new JPanel(new BorderLayout());
        pPwd.add(BorderLayout.WEST,new JLabel("密码："));
        pwdField=new JPasswordField();
        pPwd.add(BorderLayout.CENTER,pwdField);
        panel.add(pId);
        panel.add(pPwd);
        return panel;
    }

    //添加获取账号输入框内容的方法
    public int getUserId(){
        return Integer.parseInt(idField.getText());
    }
    //添加获取密码输入框内容的方法
    public String getUserPassword(){
        char[] chars=pwdField.getPassword();
        return new String(chars);
    }

    public void showMessage(String message) {
        setMessage(message);
    }
}