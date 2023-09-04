package com.lzlgdx.day0904.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author 吕星琪
 * @version 1.10 2023/9/4 下午 04:37
 * @Description
 */
public class ServerDemo1 {
    private final ServerSocket server;
    public static void main(String[] args) {
        ServerDemo1 serverDemo1=new ServerDemo1();
        serverDemo1.start();
    }
    public ServerDemo1(){
        try {
            System.out.println("服务器开始启动");
            server=new ServerSocket(8098);
            System.out.println("服务器启动成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start(){
        try {
            System.out.println("等待客户端连接");
            Socket socket=server.accept();
            System.out.println("一个客户端连接了");
            //注意指定编码格式,不指定或指定错误可能会抛异常 Connection Reset
            BufferedReader br=new BufferedReader(new InputStreamReader(
                    socket.getInputStream(),StandardCharsets.UTF_8));
            String msg;
            while ((msg = br.readLine()) != null){
                System.out.println(msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
