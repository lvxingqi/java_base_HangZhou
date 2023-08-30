package com.lzlgdx.snows;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/30 下午 09:19
 * @Description
 */
public class SnowBackground extends JPanel {
    BufferedImage background;
    SnowFlakes[] snowFlakes=new SnowFlakes[300];
    public SnowBackground() throws IOException {
        background= ImageIO.read(new File("images/sky.jpg"));
        for (int i=0;i<snowFlakes.length;i++){
            snowFlakes[i]=new SnowFlakes();
            snowFlakes[i].start();
        }
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(background,0,0,background.getWidth(),background.getHeight(),this);
        int w,h;
        for (SnowFlakes sn : snowFlakes) {
            w = sn.pieceOfSnow.getWidth();
            h = sn.pieceOfSnow.getHeight();
            g.drawImage(sn.pieceOfSnow, sn.x, sn.y, 5, 5, null);
        }
    }

    public void action(){
        while (true){
            repaint();
        }
    }
}
