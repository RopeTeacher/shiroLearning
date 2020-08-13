package com.ztx.mapper;

import com.ztx.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author rope
 * @Date 2020/8/11 18:27
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void queryUserByName() {
        User user = userMapper.queryUserByName("gary");
        if(user==null){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}