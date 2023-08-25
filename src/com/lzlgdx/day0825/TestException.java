package com.lzlgdx.day0825;

import java.util.Scanner;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/25 上午 09:35
 * @since jdk1.0
 * @Description
 * 测试自定义异常
 */

public class TestException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String pwd=scanner.toString();

        try {
            login(pwd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public static void login(String pwd) throws MyException {
        if (pwd.equals("1234")){
            System.out.println("登录成功");
        }else {
                throw new MyException("密码错误");
        }
    }
}
