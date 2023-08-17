package com.lzlgdx.day0810;

/**
 * @author 20141
 */
public class Demo04 {
    public static void main(String[] args) {

    }
}


class User{
    private String name;
    private int pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(String name,int pwd) {
        if ("张三".equals(name)){
            this.pwd = pwd;
        }
    }
}
