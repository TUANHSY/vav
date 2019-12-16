package com.chinasoftware.networkprogramming;

import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * 构造器
 * InetAddress("IP或域名",端口);
 * 常用IP方法
 * getAddress
 * getPort
 * getHostName
 * @author: DX
 * @date: 2019/12/16 10:15
 */
public class Socket {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("localhost",8888);
        try {
            URL url = new URL("http://www.baidu.com");
            System.out.println("协议: "+url.getProtocol()+"\n域名: https://"+url.getHost()+"\n端口："+url.getPort());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
