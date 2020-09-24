package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPreceive {
    public static void main(String[] args) throws IOException {
        //创建Socket对象，需要明确端口号
        ServerSocket ss = new ServerSocket(10086);
        //监听（阻塞）
        System.out.println("1");
        Socket s = ss.accept();
        //获取输入流对象
        InputStream is = s.getInputStream();
        //获取数据
        byte[] bys = new byte[20];
        int len;//用于存储读到的字节个数
        len = is.read(bys);
        //输出数据
        InetAddress address = s.getInetAddress();
        System.out.println("client ---> " + address.getHostName());
        System.out.println(new String(bys,0,len));
        //释放资源
        s.close();
        //ss.close();

    }
}
