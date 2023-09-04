package com.lzlgdx.elts.ui;

import com.lzlgdx.elts.entity.EntityContext;
import com.lzlgdx.elts.entity.Question;
import com.lzlgdx.elts.entity.User;
import com.lzlgdx.elts.service.ExamService;
import com.lzlgdx.elts.service.IdOrPwdException;

import javax.swing.*;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 10:27
 * @Description 客户端上下文,是客户端的控制类
 */
public class ClientContext {
    //注入欢迎界面
    private WelcomeWindow welcomeWindow;
    private LoginWindow loginWindow;
    private MenuWindow menuWindow;

    private ExamWindow examWindow;
    //注入Service接口引用
    private ExamService examService;

    private ScoreWindow scoreWindow;

    public void setExamService(ExamService examService) {
        this.examService = examService;
    }
    //添加set方法
    public void setWelcomeWindow(WelcomeWindow welcomeWindow) {
        this.welcomeWindow = welcomeWindow;
    }

    public void setLoginWindow(LoginWindow loginWindow) {
        this.loginWindow = loginWindow;
    }
    public void setMenuWindow(MenuWindow menuWindow) {
        this.menuWindow = menuWindow;
    }

    public void setExamWindow(ExamWindow examWindow) {
        this.examWindow = examWindow;
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

    //登录界面的登录功能
    /**
     * 当点击登录界面登录按钮时要处理的事情
     * 1)从登录页面获取输入的账号和密码
     * 2)在业务层(service包)验证账号和密码是否存在
     * 3)如果正确，实现下一个窗体页面的跳转
     * 4)如果错误，留在登录窗体界面不变，并显示错误信息*/
    public void login() {
        try {
            //1、获取用户输入的账号和密码
            int userId= loginWindow.getUserId();
            String password=loginWindow.getUserPassword();
            //2)在业务层(service包)验证账号和密码
            User user = examService.login(userId,password);
            if (user!=null){
                loginWindow.setVisible(false);
                menuWindow.setVisible(true);
                menuWindow.updateView(user.getName());
            }
        } catch (IdOrPwdException e) {
            loginWindow.showMessage(e.getMessage());
        }catch (NumberFormatException e){
            loginWindow.showMessage("id必须是数字组合");
        }
    }

    //菜单界面4个按钮对应要调用的方法
    //用户点击开始考试
    //1、加载试卷
    public void startExam(){
        menuWindow.setVisible(false);
        examWindow.setVisible(true);

        Question question=getQuestion();
        examWindow.showQuestion(question);
        Question[] questions=new Question[61];
        questions[0]=question;
        examWindow.setQuestions(questions);
    }

    public Question getQuestion(){
        return examService.getQuestion();
    }

    public void getResult(){
        scoreWindow.setScore("200");
    }

    public void seeRegular(){

    }
}