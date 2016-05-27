package com.hello.service.impl;

import com.hello.mapper.UserMapper;
import com.hello.model.User;
import com.hello.service.UserService;

/**
 * Created by peker on 16/5/27.
 */
public class UserServiceImpl implements UserService{

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUser(String userId) {
        return userMapper.getUser(userId);
    }
}
