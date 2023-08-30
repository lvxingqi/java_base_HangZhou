package com.lzlgdx.snows;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/30 下午 09:27
 * @Description
 */
public class SnowFlakes extends Thread{
    BufferedImage pieceOfSnow;
    int x;
    int y;
    int offset_y;
    Random r=new Random();
    public SnowFlakes() throws IOException {
        pieceOfSnow= ImageIO.read(new File("images/snow.png"));
        x=r.nextInt(950);
        y=0;
        offset_y=r.nextInt(100);
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            offset_y=r.nextInt(100);
            x--;
            y+=offset_y;
            if (x<0){
                x=r.nextInt(950);
            }
            if (y>670){
                y=0;
            }

        }
    }
}
