package com.chinasoftware.networkprogramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author: DX
 * @date: 2019/12/16 11:01
 */
public class AboutUdpServer {
    public static String receiveMassage(DatagramSocket server) throws IOException {
        byte[] bytes = new byte[1024*50];
        DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
        server.receive(packet);
        byte[] datas = packet.getData();
        String string = new String(datas,0,packet.getLength());
        System.out.println(string);
        return string;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("接收数据······");
        DatagramSocket server = new DatagramSocket(8888);
        String string = receiveMassage(server);
        String quit = "quit";
        while (true){
            if (quit.equals(string)){
                server.close();
                break;
            }else {
                string = receiveMassage(server);
            }

        }
    }
}
