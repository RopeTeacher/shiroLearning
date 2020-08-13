package com.ztx.mapper;

import com.ztx.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author rope
 * @Date 2020/8/11 15:08
 * @Version 1.0
 */
@Repository
@Mapper
public interface UserMapper {

    public User queryUserByName(String name);

}
