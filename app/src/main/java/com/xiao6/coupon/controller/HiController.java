package com.xiao6.coupon.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HiController {


    @RequestMapping("/hi/{name}")
    public String sayHi(@PathVariable String name, HttpServletRequest request) {
        return "From tomcat localPort:"+ request.getLocalPort()+" hi," + name;
    }

}
