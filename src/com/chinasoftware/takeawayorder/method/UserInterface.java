package com.chinasoftware.takeawayorder.method;

import com.chinasoftware.takeawayorder.entity.User;

import java.util.ArrayList;

/**
 * 用户接口
 * @author: DX
 * @date: 2019/12/11 19:17
 */
public interface UserInterface {

    /**
     * 判断是存在该用户
     * @param userId 用户Id
     * @param users 所有用户
     * @return 存在否
     */
    boolean isExist(String userId, ArrayList<User> users);

    /**
     * 根据用户名编号 和 用户密码返回一个用户
     * @param userId 用户id
     * @param userPassword 用户密码
     * @param users 所有用户
     * @return 用户
     */
    User getUser(String userId, String userPassword, ArrayList<User> users);

    /**
     * 增加用户
     * @return 1：成功 -1：失败
     */
    int addUser();


}
