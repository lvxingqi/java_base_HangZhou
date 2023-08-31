package com.lzlgdx.elts.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 10:47
 * @Description 登录界面的设计
 */
public class LoginWindow extends JFrame {

    public void setClientContext(ClientContext clientContext) {
        this.clientContext = clientContext;
    }

    private ClientContext clientContext;

    public LoginWindow() {
        init();
    }

    /*public static void main(String[] args) {
        new LoginWindow().init();
    }*/
    private void init() {
        add(createContentPane());
        setSize(430,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(LoginWindow.EXIT_ON_CLOSE);
    }

    //创建核心面板的方法
    private JPanel createContentPane(){
        //总的面板
        JPanel panel=new JPanel(new BorderLayout());
        //设置编剧
        panel.setBorder(new EmptyBorder(8,8,8,8));

        panel.add(BorderLayout.NORTH,createTopPane());
        panel.add(BorderLayout.CENTER,createCenterPane());
        panel.add(BorderLayout.SOUTH,createBottomPane());

        return panel;
    }

    private JPanel createTopPane(){
        JPanel panel=new JPanel();
        JLabel label=new JLabel("登录系统");
        //设置字体相关属性
        Font font=new Font("楷体",Font.BOLD,20);
        label.setFont(font);
        panel.add(label);

        return panel;
    }

    private JPanel createCenterPane(){
        JPanel panel=new JPanel(new BorderLayout());

        //设置边距
        panel.setBorder(new EmptyBorder(8,0,10,0));

        panel.add(BorderLayout.NORTH,createIdPwdPanel());

        JLabel message=new JLabel("",JLabel.CENTER);
        message.setForeground(Color.RED);
        panel.add(message,BorderLayout.CENTER);
        message.setBorder(new EmptyBorder(0,0,60,0));

        return panel;
    }

    //处理显示和输入框
    private JPanel createIdPwdPanel(){
        JPanel panel=new JPanel(new GridLayout(2,1,0,15));

        //第一行的内容：编号和编号输入框
        JPanel pId=new JPanel(new BorderLayout());

        pId.add(BorderLayout.WEST,new JLabel("编号："));
        JTextField idField=new JTextField();
        pId.add(BorderLayout.CENTER,idField);
        panel.add(pId);

        //第二行内容：密码和密码输入框
        JPanel pPwd=new JPanel(new BorderLayout());

        pPwd.add(BorderLayout.WEST,new JLabel("密码："));
        JPasswordField pwdField=new JPasswordField();

        pPwd.add(BorderLayout.CENTER,pwdField);
        panel.add(pPwd);
        return panel;
    }

    private JPanel createBottomPane() {
        JPanel panel=new JPanel();
        JButton login=new JButton("登录");
        JButton exit=new JButton("退出");

        panel.add(login);
        panel.add(exit);

        //设置回车默认按钮
        getRootPane().setDefaultButton(login);

        //绑定按钮监听事件
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientContext.exit(LoginWindow.this);
            }
        });
        return panel;
    }
}
