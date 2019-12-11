package com.chinasoftware.takeawayorder.method;

import com.chinasoftware.takeawayorder.entity.Food;
import com.chinasoftware.takeawayorder.entity.Order;
import com.chinasoftware.takeawayorder.entity.Shop;
import com.chinasoftware.takeawayorder.entity.User;

import java.util.ArrayList;

/**
 * @author: DX
 * @date: 2019/12/10 13:42
 */
public class InitializeData {
    /**
     * 初始化测试用户
     * @return 用户列表
     */
    public static ArrayList<User> initializeUser(){
        //用户
        User user0 = new User("15588889999","1","张三","123456","*区*栋*室");
        //店主
        User user1 = new User("15688889999","2","李二","123456","*区*栋*室");
        //超管
        User user2 = new User("15788889999","3","赵四","123456","*区*栋*室");
        ArrayList<User> userList = new ArrayList<>();
        userList.add(user0);
        userList.add(user1);
        userList.add(user2);
        return userList;
    }

    public static ArrayList<Shop> initializeShop(ArrayList<User> users) {
        ArrayList<Shop> shopList = new ArrayList<>();
        Shop shop0 = new Shop("10001","李二的小店",users.get(1),"******","url","021-2345679"," "," ");
        Shop shop1 = new Shop("10001","李二的大店",users.get(1),"******","url","021-2345678"," "," ");
        shopList.add(shop0);
        shopList.add(shop1);
        return shopList;
    }

    /**
     * 初始化食物
     * @return 有四道食物的数组
     */
    public static ArrayList<Food> initializeFood(ArrayList<Shop> shopList){
        Food food0 = new Food("1001","茄子",shopList.get(0),"url"," ",12.5d);
        Food food1 = new Food("1001","辣椒",shopList.get(1),"url"," ",13.5d);
        Food food2 = new Food("1002","土豆",shopList.get(1),"url"," ",10d);
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(food0);
        foodList.add(food1);
        foodList.add(food2);
        return foodList;
    }



    public static ArrayList<Order> initializeOrder(ArrayList<User> users,ArrayList<Food> foods) {
        ArrayList<Order> orders = new ArrayList<>();

        Order order0 = new Order("100000001",users.get(0),foods.get(0),"不要放肉");
        Order order1 = new Order("100000002",users.get(0),foods.get(1),"不要辣椒");
        Order order2 = new Order("100000003",users.get(0),foods.get(2),"不要土豆");
        orders.add(order0);
        orders.add(order1);
        orders.add(order2);
        return orders;
    }
}
