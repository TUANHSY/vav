package com.chinasoftware.takeawayorder.method;

import com.chinasoftware.takeawayorder.entity.User;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 用户类的操作方法
 * 增 删 改 查
 * @author: DX
 * @date: 2019/12/10 14:22
 */
public class UserMethod {
    public void addUser(ArrayList<User> users){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户手机号");
        String uId = scanner.nextLine();
        System.out.println("请输入用户类型(1:顾客，2：店家,其他：非法输入，默认为顾客)");
        String uType = scanner.nextLine();
        System.out.println("请输入用户名");
        String uName = scanner.nextLine();
        System.out.println("请输入用户密码");
        String uPd = scanner.nextLine();
        System.out.println("请输入用户类型");
        String uLocation = scanner.nextLine();
        System.out.println("请输入用户地址");
        if(!"1".equals(uType) && !"2".equals(uType)){
            uType = "1";
        }
        User user = new User(uId,uType,uName,uPd,uLocation);
        users.add(user);
    }

    /**
     * 用户是否存在
     * @param uId 用户名
     * @param uPd 用户密码
     * @param users 用户表
     * @return 存在否
     */
    public User isUserExist(String uId,String uPd, ArrayList<User> users){
        User user = null;
        for (User use : users) {
            if (uId.equals(use.getUserId()) && uPd.equals(use.getUserPswd())) {
                user = use;
            }
        }
        return user;
    }
}
