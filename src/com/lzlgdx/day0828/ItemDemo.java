package com.lzlgdx.day0828;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/28 下午 02:11
 * @Description
 */
public class ItemDemo {

    private final String [][] s_city={
            {"兰州","庆阳","酒泉","张掖","平凉","酒泉"},
            {"石家庄","唐山"},
            {"南京","苏州","徐州","连云港"}
    };
    private JComboBox<String> province;
    private final JComboBox<String> city=new JComboBox<>(s_city[0]);
    ;
    public static void main(String[] args) {
        ItemDemo id=new ItemDemo();
        id.init();
    }

    public void init(){

        JFrame w=new JFrame();
        JPanel p=new JPanel();

        JLabel label1=new JLabel("省份:");

        String[] s_province={"甘肃","河北","江苏"};


        province=new JComboBox<>(s_province);
        province.addItemListener(new MyItemListener());
        JLabel label2=new JLabel("城市:");

        p.add(label1);
        p.add(province);
        p.add(label2);
        p.add(city);

        w.add(p);
        w.setBounds(300,300,500,500);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
    }

    public class MyItemListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            int index=province.getSelectedIndex();
            city.removeAllItems();
            for (String s:s_city[index]){
                city.addItem(s);
            }
        }

    }
}
