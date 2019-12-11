package com.chinasoftware.takeawayorder.entity;

import sun.util.calendar.CalendarSystem;

import java.sql.Timestamp;
import java.util.Calendar;

/**
 * @author: DX
 * @date: 2019/12/10 11:36
 */
public class Order {
    /**
     * 订单编号
     */
    private String orderId;

    /**
     * 购买用户
     */
    private User orderUser;

    /**
     * 所购食物
     */
    private Food orderFood;

    /**
     * 时间
     */
    private Calendar orderTime;

    /**
     * 订单描述
     */
    private String orderDescription;

    /**
     * @param orderId orderId
     * @param orderUser orderUser
     * @param orderFood orderFood
     * @param orderDescription orderDescription
     */
    public Order(String orderId, User orderUser, Food orderFood, String orderDescription) {
        this.orderId = orderId;
        this.orderUser = orderUser;
        this.orderFood = orderFood;
        this.orderTime = Calendar.getInstance();
        this.orderDescription = orderDescription;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public User getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(User orderUser) {
        this.orderUser = orderUser;
    }

    public Food getOrderFood() {
        return orderFood;
    }

    public void setOrderFood(Food orderFood) {
        this.orderFood = orderFood;
    }

    public Calendar getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Calendar orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }
}
