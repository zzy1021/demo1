package com.example.demo1;

import com.example.demo1.mapper.UserMapper;
import com.example.demo1.pojo.user;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
@Log4j
@SpringBootTest
class Demo1ApplicationTests {
//    @Autowired
//    JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;
//    @Test
//    void contextLoads() {
//        Long aLong = jdbcTemplate.queryForObject("SELECT count(*) FROM t_user", Long.class);
//        System.out.println("总记录数:{}" + aLong);
//    }
    @Test
    void textusermapper() {
        user user = userMapper.selectById(2);
        System.out.println(user);
    }

}
