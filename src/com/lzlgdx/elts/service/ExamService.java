package com.lzlgdx.elts.service;

import com.lzlgdx.elts.entity.User;

/**
 * ExamService 考试相关服务功能，是考试系统的核心部分
 * */
public interface ExamService {
    /**
     * @Description 检查登录功能，登录成功返回User对象,登录失败抛出异常
     * @Param  id pwd
     * @return User 登录成功返回
     * @throws IdOrPwdException 登录失败抛出异常
     */
    User login(int id,String pwd) throws IdOrPwdException;
}
