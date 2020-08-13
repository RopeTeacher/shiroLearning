package com.ztx.service;

import com.ztx.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author rope
 * @Date 2020/8/11 18:16
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void queryUserByName() {
        User user = userService.queryUserByName("gary");
        System.out.println(user);
    }
}