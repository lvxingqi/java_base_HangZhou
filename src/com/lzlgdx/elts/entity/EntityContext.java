package com.lzlgdx.elts.entity;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 下午 05:18
 * @Description
 */
public class EntityContext {

    public Map<Integer, User> getUsers() {
        return users;
    }

    private final Map<Integer,User> users=new HashMap<>();
    //无参构造
    public EntityContext(){
        loadUser();
    }

    //读取user.txt文件中的内容
    private void loadUser() {
        File file=new File("elts\\user.txt");
        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader
                    (new FileInputStream(file)));
            String str;
            String[] attributes;
            //一次读一行
            while ((str=reader.readLine())!=null){
                //读出文件中不以#开头的行和不含空行的行数据
                if (!str.startsWith("#")&&!str.equals("")){
                    //对读到的一行数据以:为记号，分割成一个字符串数组
                    attributes=str.split(":");
                    //使用分割出来的字符串数组创建一个用户，并以id为键，User为对象进行存储。
                    users.put(Integer.parseInt(attributes[0]),
                            new User(Integer.parseInt(attributes[0]),
                                    attributes[1], attributes[2],
                                    attributes[3], attributes[4]));
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
