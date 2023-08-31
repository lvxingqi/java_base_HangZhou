package com.lzlgdx.elts.ui;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 09:42
 * @Description 在线考试系统的主类
 */
public class Main {
    public static void main(String[] args) {
        //创建客户端上下文
        ClientContext clientContext=new ClientContext();

        //创建欢迎界面窗体
        WelcomeWindow welcomeWindow=new WelcomeWindow();
        //创建登录页面
        LoginWindow loginWindow=new LoginWindow();

        //引用赋值
        clientContext.setWelcomeWindow(welcomeWindow);
        clientContext.setLoginWindow(loginWindow);

        //调用showUI()
        clientContext.showUI();
        loginWindow.setClientContext(clientContext);

    }

    public void init(){

    }
}
