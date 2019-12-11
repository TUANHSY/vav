package com.chinasoftware.aboutinterface;

/**
 * @author: DX
 * @date: 2019/12/5 9:55
 */
public class Camera implements Usb {
    @Override
    public void read() {
        System.out.println("读取📷资料");
    }
}
