package com.chinasoftware.inherit.role;

/**
 * @author: DX
 * @date: 2019/12/4 15:28
 */
public class Manager extends Employee {
    private final String vehicle;

    public String getVehicle() {
        return vehicle;
    }

    public Manager(String name,int age,double sal,String gender,String vehicle){
        super(name,age,sal,gender);
        this.vehicle = vehicle;
    }
}
