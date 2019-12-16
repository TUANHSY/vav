package com.chinasoftware.networkprogramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

/**
 * @author: DX
 * @date: 2019/12/16 11:01
 */
public class AboutUdpClient {
    public static void sentMassage(String massage) throws IOException {
        System.out.println("发送数据······");
        DatagramSocket client = new DatagramSocket(6666);
        String string = massage;
        byte[] bytes = string.getBytes();
        DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length,new InetSocketAddress("localhost",8888));
        client.send(packet);
        client.close();

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入信息");
        String massage = scanner.next();
        String quit = "quit";
        do {
            sentMassage(massage);
            massage = scanner.next();
        }while (!quit.equals(massage));

    }
}
