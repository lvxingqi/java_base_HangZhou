package com.lzlgdx.elts.service;

import com.lzlgdx.elts.entity.EntityContext;
import com.lzlgdx.elts.entity.Question;
import com.lzlgdx.elts.entity.User;

import java.io.*;
import java.util.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 下午 05:09
 * @Description 是ExamService接口的实现类
 */
public class ExamServiceImpl implements ExamService{
    private EntityContext context;

    public void setContext(EntityContext context) {
        this.context = context;
    }

    //重写login方法
    @Override
    public User login(int id, String pwd) throws IdOrPwdException {
        User user=context.findUserById(id);
        if (user==null){
            //说明id账号是不正确的
            throw new IdOrPwdException("没有ID用户");
        }
        if (user.getPassword().equals(pwd)){
            //user中的密码和参数传递的pwd一致，
            //说明输入的id正确，密码正确
            return user;
        }
        throw  new IdOrPwdException("密码不一致");
    }

    @Override
    public Question getQuestion() {
        return context.getRandomUniqueQuestion();
    }
}