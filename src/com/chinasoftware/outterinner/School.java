package com.chinasoftware.outterinner;

/**
 * @author: DX
 * @date: 2019/12/4 11:53
 */
public class School {
    public static class WaterFountain{
        private double water;
        public double getWater() {
            return water;
        }

        public void setWater(double water) {
            this.water = water;
        }

        public WaterFountain(double water) {
            this.water = water;
        }

        public void manageWater(){
            System.out.println(this.getWater());
        }
    }
}
