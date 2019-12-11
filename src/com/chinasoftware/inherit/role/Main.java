package com.chinasoftware.inherit.role;

/**
 * @author: DX
 * @date: 2019/12/4 15:36
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("张三",58,8000d,"男","自行车");
        manager.play();
        manager.sing();
        Employee employee = new Employee("李四",22,4000d,"男");
        employee.play();
        employee.sing();
    }
}
