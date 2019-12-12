package com.chinasoftware.takeawayorder.entity;

/**
 * @author: DX
 * @date: 2019/12/10 11:25
 */
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPswd() {
        return userPswd;
    }

    public void setUserPswd(String userPswd) {
        this.userPswd = userPswd;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public User() {
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }



    /**
     * @param userId userId
     * @param userType userType
     * @param userName userName
     * @param userPswd userPswd
     * @param userLocation userLocation
     */
    public User(String userId, String userType, String userName, String userPswd, String userLocation) {
        this.userId = userId;
        this.userType = userType;
        this.userName = userName;
        this.userPswd = userPswd;
        this.userLocation = userLocation;
    }

}
