package com.chinasoftware.employee;

/**
 * @author: DX
 * @date: 2019/12/4 14:54
 */
public class Employ {
    private String name;
    private String num;
    private double sal;

    public Employ() {
    }

    public Employ(String name, String num, double sal) {
        this.name = name;
        this.num = num;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void work(){
        System.out.println(this.getName()+"工作");
    }
}
