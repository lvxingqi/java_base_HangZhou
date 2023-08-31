package com.lzlgdx.elts.ui;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 10:27
 * @Description 客户端上下文,是客户端的控制类
 */
public class ClientContext {
    //注入欢迎姐界面
    private WelcomeWindow welcomeWindow;
    private LoginWindow loginWindow;



    //添加set方法
    public void setWelcomeWindow(WelcomeWindow welcomeWindow) {
        this.welcomeWindow = welcomeWindow;
    }

    public void setLoginWindow(LoginWindow loginWindow) {
        this.loginWindow = loginWindow;
    }

    //Timer定时器
    Timer timer=new Timer();

    //显示欢迎界面，由欢迎界面跳转登录界面,欢迎界面关闭
    public void showUI(){
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                welcomeWindow.setVisible(true);

            }
        }, 0);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //2秒后关闭欢迎页面,打开登录页面
                welcomeWindow.setVisible(false);
                loginWindow.setVisible(true);
            }
        }, 2000);

    }

    //退出的功能
    public void exit(JFrame frame){
        int result=JOptionPane.showConfirmDialog(frame,"你真的要离开吗？","退出",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if (result==0){
           loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }


}
