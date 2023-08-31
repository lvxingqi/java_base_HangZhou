package com.lzlgdx.elts.service;

import com.lzlgdx.elts.entity.EntityContext;
import com.lzlgdx.elts.entity.User;

import java.io.*;
import java.util.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 下午 05:09
 * @Description 是ExamService接口的实现类
 */
public class ExamServiceImpl implements ExamService{
    private final EntityContext context;
    public ExamServiceImpl() {
        context=new EntityContext();
    }

    //重写login方法
    @Override
    public User login(int id, String pwd) throws IdOrPwdException {
        User user=null;
        for (Map.Entry<Integer, User> integerUserEntry : context.getUsers().entrySet()) {
            //找到用户
            if (id==integerUserEntry.getKey()){
                //验证密码
                user=integerUserEntry.getValue();
                //密码错误，假设用户唯一，直接跳出循环
                if (!user.getPassword().equals(pwd)){
                    user=null;
                    break;
                }
            }
        }
        return user;
    }
}
