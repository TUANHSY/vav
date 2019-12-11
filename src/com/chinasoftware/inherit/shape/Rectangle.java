package com.chinasoftware.inherit.shape;

/**
 * @author: DX
 * @date: 2019/12/3 16:16
 */
public class Rectangle extends Shape {
    public Rectangle(double a,double b) {
        this.setA(a);
        this.setB(b);
    }

    @Override
    public double perimeter() {
        return (this.getA()+this.getB())*2;
    }

    @Override
    public double area() {
        return this.getA()*this.getB();
    }
}
