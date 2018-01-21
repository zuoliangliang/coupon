package com.xiao6.coupon;

import com.xiao6.coupon.mapper.model.User;
import com.xiao6.coupon.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void save() {
        User user = new User();
        user.setAge(31);
        user.setUserName("zuoliangliang");
        userService.save(user);
    }

    @Test
    public void list() {
        List<User> users = userService.list();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void contextLoads() {
    }

}
