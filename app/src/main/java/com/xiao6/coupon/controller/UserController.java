package com.xiao6.coupon.controller;

import com.xiao6.coupon.mapper.model.User;
import com.xiao6.coupon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/add/{userName}/{age}")
    public int add(@PathVariable String userName, @PathVariable int age) {
        User user = new User();
        user.setAge(age);
        user.setUserName(userName);
        return userService.save(user);
    }

    @RequestMapping("/user/list")
    public List<User> list() {
        return userService.list();
    }
}
