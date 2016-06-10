package com.hello.service.impl;

import com.hello.mapper.UserMapper;
import com.hello.model.User;
import com.hello.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by peker on 16/5/27.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    public User getUser(Integer id) {
        logger.debug("getUser() is executed {}", "OK");
        logger.error("This is error message", new Exception("Testing"));

        return userMapper.selectByPrimaryKey(id);
    }

}
