package com.lzlgdx.elts.ui;

import com.lzlgdx.elts.entity.Question;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/1 下午 03:00
 * @Description
 */
public class ExamWindow extends AbstractBaseUIWindow {
    private static final long serialVersionUID = 8169931941903071979L;
    private static int index = 0;
    private static int largeIndex = 0;
    private Question[] questions;

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    private JTextArea questionArea;


    //logo
    @Override
    public JPanel createTopPane() {
        JPanel panel = new JPanel();
        panel.add(new JLabel(new ImageIcon("elts\\exam_title.png")));
        return panel;
    }

    //考生信息、考题、ABCD选项
    @Override
    public JPanel createCenterPane() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel examInfo = new JLabel("姓名:xxx  考试:xxx  考试时间:   ", JLabel.CENTER);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new TitledBorder("题目"));

        questionArea = new JTextArea();
        //JScrollPane是由水平和数值方向的JScrollBar以及
        //一个JViewport组成，多行文本域questionArea是要
        //添加到JViewport中
        scrollPane.getViewport().add(questionArea);
        questionArea.setEditable(false);
        questionArea.setLineWrap(true);

        JPanel southPane = new JPanel(new GridLayout(1, 4, 3, 0));
        southPane.setBorder(new EmptyBorder(0, 130, 0, 0));
        Option a = new Option(0, "A");
        Option b = new Option(1, "B");
        Option c = new Option(2, "C");
        Option d = new Option(3, "D");

        southPane.add(a);
        southPane.add(b);
        southPane.add(c);
        southPane.add(d);

        panel.add(BorderLayout.NORTH, examInfo);
        panel.add(BorderLayout.CENTER, scrollPane);
        panel.add(BorderLayout.SOUTH, southPane);
        return panel;
    }

    private JButton pre, submit, next;

    //第xx题、3个按钮、剩余时间
    @Override
    public JPanel createBottomPane() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(0, 10, 0, 10));
        JLabel label = new JLabel("共xx题，还剩xx题");

        JPanel buttonPane = new JPanel(new GridLayout(1, 3, 80, 0));
        buttonPane.setBorder(new EmptyBorder(0, 70, 0, 70));

        ButtonWasClicked buttonWasClicked = new ButtonWasClicked();
        pre = new JButton("上一题");
        pre.addActionListener(buttonWasClicked);
        next = new JButton("下一题");
        next.addActionListener(buttonWasClicked);
        submit = new JButton("交卷");
        submit.addActionListener(buttonWasClicked);
        buttonPane.add(pre);
        buttonPane.add(submit);
        buttonPane.add(next);

        JLabel timeLabel = new JLabel("剩余xx时间");

        panel.add(BorderLayout.WEST, label);
        panel.add(BorderLayout.CENTER, buttonPane);
        panel.add(BorderLayout.EAST, timeLabel);

        return panel;
    }

    @Override
    void setExamSize() {
        setSize(800, 600);
    }


    //监听底部按钮的内部类
    public class ButtonWasClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Question question;
            if (e.getSource() == pre) {
                index--;
                next.setEnabled(true);
                if (index==0){
                    pre.setEnabled(false);
                }
                if (index >= 0) {
                    question = questions[index];
                    showQuestion(question);
                }
            } else if (e.getSource() == next) {
                pre.setEnabled(true);
                index++;
                if (index > largeIndex) {
                    question = AbstractBaseUIWindow.getClientContext().getQuestion();
                    questions[index] = question;
                    largeIndex = index;
                } else {
                    question = questions[index];
                }
                next.setEnabled(index <= 59);
                showQuestion(question);
            } else if (e.getSource() == submit) {
                AbstractBaseUIWindow.getClientContext().exit(ExamWindow.this);
            }
        }
    }
    public void showQuestion(Question question) {
        questionArea.setText("");
        questionArea.append(question.getName() + "\n");
        for (int i = 0; i < question.getOptions().length; i++) {
            questionArea.append(question.getOptions()[i] + "\n");
        }
    }

    //判断对错，并对其分数进行计算,
    //直接int[questions.length][4] 每道题的被选择项都得到它的value
    public void judgeAndCalculate(){

    }
}
//外部类，继承JCheckBox
class Option extends JCheckBox {
    private static final long serialVersionUID = -6836526007190143004L;
    public int value;

    public Option(int value, String txt) {
        super(txt);
        this.value = value;
    }
}