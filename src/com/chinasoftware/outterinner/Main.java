package com.chinasoftware.outterinner;

/**
 * @author: DX
 * @date: 2019/12/4 11:36
 */
public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow(122d,199d);
        Cow.CowLeg cowLeg = cow.new CowLeg("red",110d);
        cowLeg.showCow();

        School school = new School();
        School.WaterFountain waterFountain = new School.WaterFountain(12.2d);
        waterFountain.manageWater();
    }
}
