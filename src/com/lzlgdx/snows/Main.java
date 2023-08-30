package com.lzlgdx.snows;

import javax.swing.*;
import java.io.IOException;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/30 下午 09:17
 * @Description
 */
public class Main {
    public static void main(String[] args) throws IOException {
        new Main().init();
    }

    public void init() throws IOException {
        JFrame w=new JFrame("漫天风雪");

        SnowBackground snowBackground=new SnowBackground();
        w.add(snowBackground);
        w.setBounds(300,50,950,670);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
        snowBackground.action();
    }
}


