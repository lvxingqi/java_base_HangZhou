package com.lzlgdx.elts;

import com.lzlgdx.elts.entity.EntityContext;
import com.lzlgdx.elts.service.ExamServiceImpl;
import com.lzlgdx.elts.ui.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/2 下午 12:52
 * @Description
 */
public class Main2 {
    public static void main(String[] args) {


        ClientContext clientContext=new ClientContext();
        AbstractBaseUIWindow.setClientContext(clientContext);

        //此类负责从文件加载信息并创建用户实例
        EntityContext entityContext=new EntityContext();

        //此类负责处理用户账号密码的匹配
        ExamServiceImpl examService=new ExamServiceImpl();
        clientContext.setExamService(examService);
        //此类需要EntityContext对象调用方法，根据id查用户
        examService.setContext(entityContext);


        WelcomeWindow welcomeWindow=new WelcomeWindow();
        LoginWindow loginWindow=new LoginWindow();
        MenuWindow menuWindow=new MenuWindow();
        ExamWindow examWindow=new ExamWindow();


        clientContext.setWelcomeWindow(welcomeWindow);
        clientContext.setLoginWindow(loginWindow);
        clientContext.setMenuWindow(menuWindow);
        clientContext.setExamWindow(examWindow);

        clientContext.showUI();

    }
}
