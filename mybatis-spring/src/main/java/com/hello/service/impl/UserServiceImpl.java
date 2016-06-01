package com.hello.service.impl;

import com.hello.dao.IUserDao;
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
public class UserServiceImpl implements UserService{

//    private UserMapper userMapper;
//
//    public void setUserMapper(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }
//
//    public User getUser(String userId) {
//        return userMapper.getUser(userId);
//    }
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private IUserDao userDao;

    public User getUser(Integer id) {
        logger.debug("getUser() is executed {}", "OK");
        logger.error("This is error message", new Exception("Testing"));

        return userDao.selectById(id);
    }

}
