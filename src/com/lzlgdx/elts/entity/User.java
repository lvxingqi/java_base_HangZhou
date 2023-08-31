package com.lzlgdx.elts.entity;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 上午 09:30
 * @Description 用户实体类
 */

public class User {
    private int userId;
    private String username;
    private String password;
    private String phoneNumber;
    private String email;

    public User(int userId, String username, String password, String phoneNumber, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
