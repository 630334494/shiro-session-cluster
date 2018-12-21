package com.wjq.www.service;

import com.wjq.www.po.UserEntity;

import java.util.List;

/**
 * Desc:用户表相关的service接口
 * Created by wjq.zhang on 2016/8/27.
 */
public interface UserService {

    /**
     * 获取所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();

    /**
     * 通过用户名获取用户信息
     *
     * @param userName 用户名
     *
     * @return
     */
    List<UserEntity> getByUserName(String userName);
}
