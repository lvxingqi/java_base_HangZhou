package com.lzlgdx.day0828;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/28 上午 10:38
 * @Description
 */
public class MouseDemo {
    private JTextArea area;
    private JLabel label;
    public static void main(String[] args) {
        MouseDemo mouseDemo=new MouseDemo();
        mouseDemo.init();
    }

    public void init(){
        JFrame w=new JFrame("鼠标的监听");
        JPanel p=new JPanel();
        label=new JLabel("label");
        area=new JTextArea(5,10);

        BorderLayout borderLayout=new BorderLayout();
        p.setLayout(borderLayout);
        area.setEditable(true);

        p.add(label,BorderLayout.NORTH);
        p.add(area,BorderLayout.CENTER);

        MyMouse myMouse=new MyMouse();

        area.addMouseListener(myMouse);
        area.addMouseMotionListener(myMouse);

        w.add(p);

        w.setBounds(300,300,500,500);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
    }

    private class MyMouse extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            //鼠标左键、滚轮、右键的单击
            int type=e.getButton();
            if (type==1){
                area.append("鼠标左键单击"+e.getX()+" "+e.getY()+"\n");
            }else if (type==2){
                area.append("鼠标滚轮单击"+e.getX()+" "+e.getY()+"\n");
            }else {
                area.append("鼠标右键单击"+e.getX()+" "+e.getY()+"\n");
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("鼠标进入");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("鼠标离开");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            label.setText(e.getX()+" "+e.getY());
        }
    }
}
