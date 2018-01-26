package com.xiao6.coupon.controller;

import com.xiao6.coupon.mapper.model.User;
import com.xiao6.coupon.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api("用户信息相关信息处理")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "添加用户信息", notes = "添加用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", required = true, dataType = "String", paramType = "path"),
            @ApiImplicitParam(name = "age", required = true, dataType = "int", paramType = "path")
    })
    @RequestMapping(value = "/user/add/{userName}/{age}", method = RequestMethod.GET)
    public int add(@PathVariable String userName, @PathVariable int age) {
        User user = new User();
        user.setAge(age);
        user.setUserName(userName);
        return userService.save(user);
    }

    @ApiIgnore
    @RequestMapping("/user/list")
    public List<User> list() {
        return userService.list();
    }
}
