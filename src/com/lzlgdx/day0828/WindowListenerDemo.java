package com.lzlgdx.day0828;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/28 上午 09:45
 * @Description
 */
public class WindowListenerDemo {
    public static void main(String[] args) {
        WindowListenerDemo wld=new WindowListenerDemo();
        wld.init();
    }

    public void init(){
//        JFrame w=new JFrame("my");
        Frame w=new Frame();
        /*MyWindow mw=new MyWindow();
        w.addWindowListener(mw);*/

        MyWindow1  mw1=new MyWindow1();
        w.addWindowListener(mw1);

        w.setBounds(300,300,500,500);
        w.setVisible(true);
//        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //成员内部类，去实现WindowListener
    private class MyWindow implements WindowListener {

        //窗口打开时的监听
        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("我被打开了！");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("点击窗口的关闭按钮");
            windowClosed(e);
        }

        //窗口被关闭时的事件监听
        @Override
        public void windowClosed(WindowEvent e) {
            e.getWindow().dispose();
            System.out.println("窗口被关闭了...");
        }


        //窗口最小化时的事件监听
        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("我被最小化了");
        }

        //窗口从最小化还原时的事件监听
        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("我被还原了！");
        }

        //窗口被激活时的事件监听
        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("我被激活了！");
        }

        //窗口失去活性的事件监听
        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("窗口失去活性了");
        }
    }

    //继承WindowAdapter
    public class MyWindow1 extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            e.getWindow().dispose();
        }
    }
}
