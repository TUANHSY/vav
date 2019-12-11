package com.chinasoftware.aboutinterface;

/**
 * @author: DX
 * @date: 2019/12/5 9:58
 */
public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Udisk udisk = new Udisk();
        camera.read();
        udisk.read();
    }
}
