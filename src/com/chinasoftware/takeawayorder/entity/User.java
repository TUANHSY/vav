package com.chinasoftware.takeawayorder.entity;

import lombok.Data;

/**
 * @author: DX
 * @date: 2019/12/10 11:25
 */
@Data
public class User {
    /**
     * 用户手机号
     */
    private String userId;

    /**
     * 用户类型
     * 1：普通用户 -- 购买相关产品
     * 2：商家 -- 管理自家店铺产品
     * 3：超级管理员 -- 管理店铺及其他用户
     */
    private String userType;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPswd;

    /**
     * 用户地址
     */
    private String userLocation;


    /**
     *构造用户 构造时判断用户类型是否合法 将不合法的类型置空
     * 无法用构造器构造超级管理员 和其他未定义类型用户
     * @param userId userId
     * @param userType userType  1：顾客 2：店家
     * @param userName userName
     * @param userPswd userPswd
     * @param userLocation userLocation
     */
    public User(String userId, String userType, String userName, String userPswd, String userLocation){
        String customer   = "1";
        String shopkeeper = "2";
        this.userId = userId;
        if (customer.equals(userType)||shopkeeper.equals(userType)){
            this.userType = userType;
        }else {
            this.userType = null;
        }
        this.userName = userName;
        this.userPswd = userPswd;
        this.userLocation = userLocation;
    }
}
