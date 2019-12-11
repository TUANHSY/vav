package com.chinasoftware.inherit.rectangle;

/**
 * @author: DX
 * @date: 2019/12/3 13:58
 */
public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return this.getLength()*this.getWidth();
    }
}
