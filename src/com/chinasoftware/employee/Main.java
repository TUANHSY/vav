package com.chinasoftware.employee;

/**
 * @author: DX
 * @date: 2019/12/4 15:02
 */
public class Main {

    public static void main(String[] args) {
        GeneralStaff staff = new GeneralStaff();
        Manager manager = new Manager();

        staff.setName("张三");
        staff.setNum("10010");
        staff.setSal(2000d);

        manager.setName("李素");
        manager.setNum("10000");
        manager.setSal(5000d);
        manager.setBonus(2000d);

        staff.work();
        manager.work();

    }
}
