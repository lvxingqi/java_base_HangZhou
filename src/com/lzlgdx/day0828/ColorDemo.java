package com.lzlgdx.day0828;

import javafx.scene.control.Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/28 下午 03:32
 * @Description
 */
public class ColorDemo {

    private JTextArea area;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JSlider s1;
    private JSlider s2;
    private JSlider s3;

    public static void main(String[] args) {
        ColorDemo cd=new ColorDemo();
        cd.init();
    }

    public void init(){
        JFrame w=new JFrame();
        JPanel p=new JPanel();

        //p1子面板存放组件：3个标签，3个滑块，3个文本域
        JPanel p1=new JPanel();

        //p2子面板存放：一个多行文本域
        JPanel p2=new JPanel();
        p.setLayout(new BorderLayout());

        JLabel l1=new JLabel("R");
        JLabel l2=new JLabel("G");
        JLabel l3=new JLabel("B");
        t1=new JTextField("255",5);
        t1.setEditable(false);
        t2=new JTextField("73",5);
        t2.setEditable(false);
        t3=new JTextField("164",5);
        t3.setEditable(false);

        ColorChange colorChange=new ColorChange();

        s1=new JSlider(0,255);
        s1.addChangeListener(colorChange);
        s2=new JSlider(0,255);
        s2.addChangeListener(colorChange);
        s3=new JSlider(0,255);
        s3.addChangeListener(colorChange);

        p1.add(l1);
        p1.add(s1);
        p1.add(t1);

        p1.add(l2);
        p1.add(s2);
        p1.add(t2);

        p1.add(l3);
        p1.add(s3);
        p1.add(t3);

        area=new JTextArea(10,20);
        area.setEditable(false);
        area.setBackground(new Color(255,73,164));

        p2.add(area);


        p.add(p1,BorderLayout.CENTER);
        p.add(p2,BorderLayout.EAST);


        w.add(p);
        w.setBounds(300,300,480,210);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
        w.setResizable(false);
    }

    public class ColorChange implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider s=(JSlider) e.getSource();
            int value=s.getValue();
            if (s==s1){
                t1.setText(String.valueOf(value));
            }else if (s==s2){
                t2.setText(String.valueOf(value));
            }else {
                t3.setText(String.valueOf(value));
            }
            int i1=Integer.parseInt(t1.getText());
            int i2=Integer.parseInt(t2.getText());
            int i3=Integer.parseInt(t3.getText());
            Color color=new Color(i1,i2,i3);
            area.setBackground(color);
        }
    }
}
