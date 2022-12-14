package com.chen.book.service.Impl;

import com.chen.book.mapper.UserMapper;
import com.chen.book.pojo.User;
import com.chen.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author CHEN
 * @create 2022-10-30-23:16
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String uname, String pwd) {
        return userMapper.getUser(uname, pwd);
    }

    @Override
    public void regist(User user) {
        userMapper.addUser(user);
    }
}
