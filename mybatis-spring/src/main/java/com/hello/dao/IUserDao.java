package com.hello.dao;

import com.hello.model.User;

/**
 * Created by peker on 16/5/30.
 */
public interface IUserDao {
    User selectById(Integer id);
}
