package com.company;
/*
*       使用udp协议发送数据
*           创建发送端socket对象
*           创建数据并打包
*           发送数据
*           释放资源
* */
import java.io.IOException;
import java.net.*;

public class send {

    public static void main(String[] args) throws IOException {

        //method1();
        //创建数据并打包
		/*
		 * DatagramPacket :此类表示数据报包
		 * 数据 byte[]
		 * 设备的地址 ip
		 * 进程的地址  端口号
		   DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		 */
        DatagramSocket ds = new DatagramSocket();
        String s = "hello udp,im comming!";
        byte[] bys = s.getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("PC-202003251636");//发送给当前设备
        int port=8888;
        //打包数据nt port = 8888;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();
    }

    private static void method1() throws UnknownHostException {
        InetAddress address= InetAddress.getByName("PC-202003251636");
        // System.out.println(address);
        System.out.println(address.getHostAddress());//返回ip地址
        System.out.println(address.getHostName());//返回主机名
    }
}
