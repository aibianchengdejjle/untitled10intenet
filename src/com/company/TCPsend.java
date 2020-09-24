package com.company;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
*       创建发送端Socket对象(创建链接)
*       获取输出流对象
*       发送对象
*
* */
public class TCPsend {
    public static void main(String[] args) throws IOException {
        //创建发送端对象
        Socket s = new Socket(InetAddress.getByName("PC-202003251636"),10086);
        //获取输出流对象
        OutputStream os = s.getOutputStream();
        //发送数据
        String str = "hello tcp,im\n";
        os.write(str.getBytes());
        //释放资源
        s.close();


    }

}
