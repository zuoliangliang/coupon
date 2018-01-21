package com.xiao6.coupon.service;

import com.xiao6.coupon.mapper.model.User;

import java.util.List;

public interface UserService {
    int save(User user);

    List<User> list();
}
