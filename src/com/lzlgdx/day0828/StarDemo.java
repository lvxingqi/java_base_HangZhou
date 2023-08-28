package com.lzlgdx.day0828;

import javax.swing.*;
import java.awt.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/28 下午 04:56
 * @Description
 */
public class StarDemo {
    public static void main(String[] args) {
        StarDemo sd=new StarDemo();
        sd.init();
    }

    private void init() {
        JFrame w=new JFrame("漫天繁星");
        w.setBackground(Color.BLACK);

        Sky sky=new Sky();
        w.add(sky);

        w.setBounds(400,50,800,800);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
//        w.setResizable(false);
    }
}
