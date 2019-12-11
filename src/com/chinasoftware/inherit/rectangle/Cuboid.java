package com.chinasoftware.inherit.rectangle;

/**
 * @author: DX
 * @date: 2019/12/3 14:02
 */
public class Cuboid extends Rectangle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return  super.getArea()*this.getHeight();
    }
}
