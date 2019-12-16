package com.chinasoftware.networkprogramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 定位一个节点
 * IP 计算机 路由 通讯设备
 * InetAddress
 * @author: DX
 * @date: 2019/12/16 9:34
 */
public class AboutIp {
    public static void main(String[] args) {
        //getLocalhost(); 创建本机对象
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress()+address.getHostName());
            address = InetAddress.getByName("www.baidu.com");
            System.out.println(address.getHostAddress()+address.getHostName());

            address = InetAddress.getByName("192.168.174.1");
            System.out.println(address.getHostAddress()+address.getHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
