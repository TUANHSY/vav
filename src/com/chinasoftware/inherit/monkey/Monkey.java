package com.chinasoftware.inherit.monkey;

/**
 * @author: DX
 * @date: 2019/12/3 11:54
 */
public class Monkey {
    private String s;
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Monkey(String s) {
        this.s = s;
    }
    public void speak(){
        System.out.println(this.s+":咿呀咿呀呦！");
    }
}
