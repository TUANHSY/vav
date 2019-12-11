package com.chinasoftware.inherit.animal;

/**
 * @author: DX
 * @date: 2019/12/3 11:33
 */
public class Animal {
    private String name;
    private String age;
    private String color;

    public Animal() {
    }

    public Animal(String name, String age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat(){System.out.println("吃东西");}

    public void playGame(){ System.out.println("玩游戏");}
}
