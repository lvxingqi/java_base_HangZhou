package com.lzlgdx.elts.ui;

import com.lzlgdx.elts.entity.User;
import com.lzlgdx.elts.service.ExamServiceImpl;
import com.lzlgdx.elts.service.IdOrPwdException;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 10:27
 * @Description 客户端上下文,是客户端的控制类
 */
public class ClientContext implements Observer{
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
        int result=JOptionPane.showConfirmDialog(frame,"你真的要离开吗？","退出",JOptionPane.YES_NO_OPTION);
        if (result==0){
           System.exit(0);
        }
    }

    @Override
    public void update(JFrame frame,String command) {
        if (command.equals("exit")){
            exit(frame);
        }else if (command.equals("login")){
            login();
        }
    }

    //登录界面的登录功能
    /**
     * 当点击登录界面登录按钮时要处理的事情
     * 1)从登录页面获取输入的账号和密码
     * 2)在业务层(service包)验证账号和密码是否存在
     * 3)如果正确，实现下一个窗体页面的跳转
     * 4)如果错误，留在登录窗体界面不变，并显示错误信息*/




    public void login() {
        //1、获取用户输入的账号和密码
        int userId= loginWindow.getUserId();
        String password=loginWindow.getUserPassword();
        System.out.println(password);
        //2)在业务层(service包)验证账号和密码是否存在
        ExamServiceImpl service=new ExamServiceImpl();
        try {
            User user=service.login(userId,password);
            System.out.println(user);
            if (user!=null){
                System.out.println("登录成功");
            }
        } catch (IdOrPwdException e) {
            throw new RuntimeException(e);
        }
    }
}
