package com.lzlgdx.elts.ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 上午 10:45
 * @Description
 */
public class ScoreWindow extends AbstractBaseUIWindow{
    @Override
    JPanel createTopPane() {
        return null;
    }

    private JLabel label;

    public void setScore(String score) {
        label.setText(score);
    }

    @Override
    JPanel createCenterPane() {
        JPanel panel=new JPanel();
        label=new JLabel();
        Font font=new Font("楷体",Font.BOLD,30);
        label.setFont(font);
        return panel;
    }

    @Override
    JPanel createBottomPane() {
        return null;
    }
}
