package com.chinasoftware.inherit.role;

/**
 * @author: DX
 * @date: 2019/12/4 15:20
 */
public class Employee extends Role {
    private double salary;
    private static String  id;

    public Employee() {
        this.salary = salary;
    }


    public Employee(String name, int age, double sal, String gender) {
        super(name,age,gender);
        this.salary=sal;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Employee.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void play() {
        System.out.println(this.getName()+" 覆写play()");
    }

    public final void sing(){
        System.out.println(this.getName()+" FINAL SING");
    }
}
