package com.chinasoftware.inherit.shape;

/**
 * @author: DX
 * @date: 2019/12/3 16:15
 */
public class Triangle extends Shape {
    private double c;

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(double a, double b, double c) {
        if(a+b>c&&a>c-b&& b+c>a&&b>a-c&& a+c>b&&c>b-a){
            this.setA(a);
            this.setB(b);
            this.setC(c);
        }else {
            System.out.println("不满足三角形三边关系，构造三角形失败");
        }
    }



    @Override
    public double perimeter(){
        return this.getA()+this.getB()+this.getC();
    }

    @Override
    public double area(){
        double p = perimeter()/2;
        return Math.sqrt(p*(p-this.getA())*(p-this.getB())*(p-this.getC()));
    }

}
