package com.lzlgdx.day0904.socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 下午 04:23
 * @Description
 */
public class ClientDemo1 {
    Socket socket;
    public static void main(String[] args) throws IOException {
        ClientDemo1 clientDemo1=new ClientDemo1();
        clientDemo1.start();
    }

    private void start() {
        try {
            System.out.println("开始写...");
            OutputStream os=socket.getOutputStream();
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(
                    os,StandardCharsets.UTF_8));
            PrintWriter printWriter=new PrintWriter(writer);
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入内容(空行回车直接退出)");
            String str="";
            while (!str.equals("\n")){
                str=sc.next();
                printWriter.println(str);
                printWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ClientDemo1() {
        try{
            System.out.println("开始连接");
            socket=new Socket("localhost",8098);
            System.out.println("连接成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
