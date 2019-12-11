package com.chinasoftware.inherit.animal;

/**
 * @author: DX
 * @date: 2019/12/3 11:38
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+"是猫，它爱吃鱼");
    }

    @Override
    public void playGame() {
        System.out.println(this.getName()+"是猫，它会爬树");
    }
}
