package com.chinasoftware.takeawayorder.method;

import com.chinasoftware.takeawayorder.entity.Food;
import com.chinasoftware.takeawayorder.entity.Order;
import com.chinasoftware.takeawayorder.entity.Shop;
import com.chinasoftware.takeawayorder.entity.User;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 菜单
 * @author: DX
 * @date: 2019/12/10 11:53
 */
public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<User>  userList  = InitializeData.initializeUser();
    private ArrayList<Shop>  shopList  = InitializeData.initializeShop(userList);
    private ArrayList<Food>  foodList  = InitializeData.initializeFood(shopList);
    private ArrayList<Order> orderList = InitializeData.initializeOrder(userList,foodList);


    /**
     * 外卖系统
     * 1：登录
     * 2：注册
     */
    public void mainInterface(){
        while (true){
             System.out.print("* 外卖系统\n" +
                     "      1：登录\n" +
                     "      2：注册\n" +
                     "* 请选择：");
             String chose = scanner.nextLine();
             if ("1".equals(chose)){
                 login(userList,shopList,foodList,orderList);
             }else if ("2".equals(chose)){
                 register(userList);
             }else {
                 System.out.println("#输入错误!请继续#");
             }
         }
    }

    /**
     * 登录系统
     * @param userList  用户列表
     * @param shopList  店铺列表
     * @param foodList  食物列表
     * @param orderList 订单列表
     */
    public void login(ArrayList<User>  userList ,ArrayList<Shop> shopList , ArrayList<Food>  foodList , ArrayList<Order> orderList){
        UserMethod method = new UserMethod();
        System.out.println("用户账号（手机号，按 0 退出）：");
        String uId = scanner.nextLine();
        System.out.println("用户密码：按 0 退出");
        String uPd = scanner.nextLine();
        User user;
        user = method.isUserExist(uId,uPd,userList);
        while (true){
            if ("0".equals(uId)||"0".equals(uPd)){
                System.out.println("成功退出登录！");
                break;
            }else if (user != null){
                show(user,userList,shopList,foodList,orderList);
            }else {
                System.out.println("用户名或密码错误请重新输入：");
            }
            System.out.println("用户账号（手机号 按 0 退出）：");
            uId = scanner.nextLine();
            System.out.println("用户密码：按 0 退出");
            uPd = scanner.nextLine();
            user = method.isUserExist(uId,uPd,userList);
        }
    }

    /**
     * 登录成功 按角色展示相关的操作界面
     * @param user 登录成功的用户
     * @param userList 用户列表
     * @param shopList 店铺列表
     * @param foodList 食物列表
     * @param orderList 订单列表
     */
    private void show(User user, ArrayList<User> userList, ArrayList<Shop> shopList, ArrayList<Food> foodList, ArrayList<Order> orderList) {
        String customer  = "1";
        String shopOwner = "2";
        String manager   = "3";
        Scanner scanner = new Scanner(System.in);
        if (customer.equals(user.getUserType())){
            System.out.print("*欢迎 顾客 "+user.getUserName()+" 登陆,您可以进行以下操作：\n"+ "          *1.我要订餐\n"+
                    "          *2.查看餐袋\n"+
                    "          *3.签收订单\n"+
                    "          *4.删除订单\n"+
                    "          *5.我要点赞\n"+
                    "          *6.退出系统\n"+"请选择:");
            String chose = scanner.nextLine();
            System.out.println();
            while (true){
                if ("1".equals(chose)){
                    System.out.println("您已选择订餐功能：");
                    placeOrder(user,foodList,orderList);
                }else if ("2".equals(chose)){
                    System.out.println("您已选择查看餐袋：");
                }else if ("3".equals(chose)){
                    System.out.println("您已选择签收订单：");
                }else if ("4".equals(chose)){
                    System.out.println("您已选择删除订单：");
                }else if ("5".equals(chose)){
                    System.out.println("您已选择我要点赞：");
                }else if ("6".equals(chose)){
                    System.out.println("您已选择退出本次服务：");
                    break;
                }else {
                    System.out.println("输入有误，请重新输入!");
                }
                System.out.println("请输入选择：");
                chose = scanner.nextLine();
            }
        }else if (shopOwner.equals(user.getUserType())){
            System.out.println("欢迎 店主 "+user.getUserName()+" 登录");
        }else if (manager.equals(user.getUserType())){
            System.out.println("欢迎 超管 "+user.getUserName()+" 登录");
        }else {
            System.out.println("非法用户 "+user.getUserName()+" 登录");
        }
    }

    private void placeOrder(User user, ArrayList<Food> foodList, ArrayList<Order> orderList) {
        for (int i=0;i<foodList.size();i++){
            System.out.println("食物编号："+foodList.get(i).getFoodId()+"食物名称："+foodList.get(i).getFoodName()+"食物描述："+foodList.get(i).getFoodDescription());
        }
        System.out.println("请输入要点的食物编号");
        String foodId = scanner.nextLine();

    }

    public void register(ArrayList<User> userList){
        UserMethod method = new UserMethod();
        method.addUser(userList);
    }
}
