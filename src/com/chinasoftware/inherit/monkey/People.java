package com.chinasoftware.inherit.monkey;

/**
 * @author: DX
 * @date: 2019/12/3 13:49
 */
public class People extends Monkey {

    public People(String s) {
        super(s);
    }
    public void think(){
        System.out.println(this.getS()+":被说话！仁增司考！");
    }

    @Override
    public void speak() {
        System.out.println(this.getS()+":小样，不错嘛！会说话了。");
    }
}
