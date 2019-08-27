package com.xinxing.demo.springboot.service.impl;

import com.xinxing.demo.springboot.entity.User;
import com.xinxing.demo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void saveUser(User user) {
        jdbcTemplate.update("insert user (user_name, user_password, user_email, user_address) values (?, ?, ?, ?)", user.getUserName(), user.getUserPassword(), user.getUserEmail(), user.getUserAddress());
    }

    //("throw org.springframework.jdbc.IncorrectResultSetColumnCountException: Incorrect column count: expected 1, actual 5. desc：<T>org.springframework.jdbc.core.JdbcTemplate only support Integer/String ... , not support user-defined (eg: com.xinxing.springboot.entity.User)")
    @Override
    public User getUserById(Long id) {
        return jdbcTemplate.queryForObject("select * from user where user_id = ?", User.class, id);
    }

    @Override
    public String getUserNameById(Long id) {
        return jdbcTemplate.queryForObject("select user_name from user where user_id = ?", String.class, id);
    }
}
