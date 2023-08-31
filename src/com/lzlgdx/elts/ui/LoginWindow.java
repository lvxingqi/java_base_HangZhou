package com.lzlgdx.elts.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 10:47
 * @Description 登录界面的设计
 */
public class LoginWindow extends JFrame implements Observable {

    private static final long serialVersionUID = 3423770305937062385L;

    //账号输入框
    private JTextField idField;
    //密码输入框
    private JPasswordField pwdField;

    public LoginWindow() {
        init();
    }

    private void init() {
        add(createContentPane());
        setSize(430,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(LoginWindow.DO_NOTHING_ON_CLOSE);
        this.addWindowListener((new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                notifyObserver("exit");
            }
        }));
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
        idField=new JTextField();
        pId.add(BorderLayout.CENTER,idField);
        panel.add(pId);

        //第二行内容：密码和密码输入框
        JPanel pPwd=new JPanel(new BorderLayout());

        pPwd.add(BorderLayout.WEST,new JLabel("密码："));
        pwdField=new JPasswordField();

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

        //绑定退出按钮监听事件
        exit.addActionListener(e -> notifyObserver("exit"));
        //登录按钮绑定事件监听
        login.addActionListener(e -> notifyObserver("login"));
        return panel;
    }


    @Override
    public void notifyObserver(String command) {
        for (Observer observer : observers) {
                observer.update(this,command);
        }
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
}
