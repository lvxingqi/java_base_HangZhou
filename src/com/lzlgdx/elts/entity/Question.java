package com.lzlgdx.elts.entity;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/2 下午 03:37
 * @Description
 */
public class Question {
    //全是选择题
    //一道题有题目，4个选项,每道题有自己的答案，可能是多选或者单选，每道题有对应的分数，有难度评级
    private String name;
    private String[] options = new String[4];

    private int[] answer;
    private int score;
    private int level;

    public Question() {
    }

    public Question(String name, String[] options, int[] answer, int score, int level) {
        this.name = name;
        this.options = options;
        this.answer = answer;
        this.score = score;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Question{" +
                "name='" + name + '\'' +
                ", options=" + Arrays.toString(options) +
                ", answer=" + Arrays.toString(answer) +
                ", score=" + score +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return score == question.score && level == question.level && Objects.equals(name, question.name) && Arrays.equals(options, question.options) && Arrays.equals(answer, question.answer);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, score, level);
        result = 31 * result + Arrays.hashCode(options);
        result = 31 * result + Arrays.hashCode(answer);
        return result;
    }

    public String[] getOptions() {
        return options;
    }

    public String getName() {
        return name;
    }

    public int[] getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }

    public int getLevel() {
        return level;
    }
}