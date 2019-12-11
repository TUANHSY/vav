package com.chinasoftware.aboutinterface;

/**
 * @author: DX
 * @date: 2019/12/5 9:56
 */
public class Udisk implements Usb {
    @Override
    public void read() {
        System.out.println("读取U盘资料");
    }
}
