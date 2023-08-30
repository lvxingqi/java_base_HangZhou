package com.lzlgdx.fish;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/30 下午 02:32
 * @Description
 */
public class Net {
    public BufferedImage getNet() {
        return net;
    }

    BufferedImage net;
    private int x;
    private int y;

    private boolean isShow;

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Net() throws IOException {
        net= ImageIO.read(new File("images/net09.png"));
        x=1800;
        y=1800;
    }

    //渔网捕鱼的规则
    //参数f，表示要检测的鱼
    //方法返回布尔类型，返回true表示渔网捕捉到鱼了
    //返回false表示渔网没有捕捉到鱼
    public boolean isCanCatchFish(Fish f){
        return (x>=f.getX() && x<=f.getX() +f.getType().getWidth()
                && y>=f.getY() && y<=f.getY()+f.getType().getHeight());
    }
}
