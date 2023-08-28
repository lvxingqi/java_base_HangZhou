package com.lzlgdx.day0828;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/28 下午 05:30
 * @Description
 */
public class Sky extends JPanel{
    Random r=new Random();

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(50,50,100,100);
        g.setColor(Color.BLACK);
        g.fillOval(25,25,100,100);
        g.setColor(Color.YELLOW);
        for (int i=0;i<500;i++){
                g.drawString("*",r.nextInt(800),r.nextInt(800));
        }
    }
}
