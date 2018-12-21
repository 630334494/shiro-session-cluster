package com.wjq.www.service.impl;

import com.wjq.www.mapper.UserEntityMapper;
import com.wjq.www.po.UserEntity;
import com.wjq.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:用户表相关的servie接口实现类
 *
 * Created by wjq.zhang on 2016/8/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper mapper;

    @Override
    public List<UserEntity> getAllUsers() {
        return mapper.getAllUsers();
    }

    @Override
    public List<UserEntity> getByUserName(String userName) {
        if (userName == null) {
           return new ArrayList<>();
        }
        return mapper.getByUserName(userName);
    }
}
