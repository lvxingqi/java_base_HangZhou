package com.lzlgdx.elts.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/2 下午 12:14
 * @Description
 */
public abstract class AbstractBaseUIWindow extends JFrame {

    private static final long serialVersionUID = -8011407594854359618L;
    //注入ClientContext,通过set注入，子类使用的话直接get，静态，所以共享同一个对象
    //直接通过main方法注入
    private static ClientContext clientContext;

    public AbstractBaseUIWindow(){
        init();
    }

    public static void setClientContext(ClientContext clientContext) {
        AbstractBaseUIWindow.clientContext = clientContext;
    }

    public static ClientContext getClientContext() {
        return clientContext;
    }


    public void init(){
        add(createContentPane());
        setExamWindow();
    }


    public void setExamWindow(){
        setExamSize();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(LoginWindow.DO_NOTHING_ON_CLOSE);
        this.addWindowListener((new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                clientContext.exit(AbstractBaseUIWindow.this);
            }
        }));
    }

    public JPanel createContentPane(){
        JPanel panel=new JPanel(new BorderLayout());
        if (borderIsSet()){
            panel.setBorder(new EmptyBorder(8,8,8,8));
        }
        if (createTopPane()!=null){
            panel.add(BorderLayout.NORTH,createTopPane());
        }
        if (createCenterPane()!=null){
            panel.add(BorderLayout.CENTER,createCenterPane());
        }
        if (createBottomPane()!=null){
            panel.add(BorderLayout.SOUTH,createBottomPane());
        }
        return panel;
    }
    abstract JPanel createTopPane();
    abstract JPanel createCenterPane();
    abstract JPanel createBottomPane();

    //设置窗口的大小，用户自己决定是否重写，默认大小430*300
    void setExamSize(){
        setSize(430,300);
    }

    //默认设置边距，如果子类不想设置边距，重写此方法
    boolean borderIsSet(){return true;}
}
