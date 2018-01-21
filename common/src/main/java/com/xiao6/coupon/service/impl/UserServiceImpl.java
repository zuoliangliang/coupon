package com.xiao6.coupon.service.impl;

import com.xiao6.coupon.mapper.UserMapper;
import com.xiao6.coupon.mapper.model.User;
import com.xiao6.coupon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        userMapper.save(user);
        return user.getId();
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
