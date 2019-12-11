package com.chinasoftware.inherit.animal;

/**
 * @author: DX
 * @date: 2019/12/3 11:38
 */
public class Dog extends Animal {
    public Dog() {
    }
    public Dog(String name, String age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat(){
        System.out.println(this.getName()+"狗吃肉！");
    }

    @Override
    public void playGame() {
        System.out.println(this.getName()+"狗狗游泳");
    }
}
