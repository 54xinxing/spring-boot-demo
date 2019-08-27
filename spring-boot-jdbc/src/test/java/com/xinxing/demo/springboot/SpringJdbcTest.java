package com.xinxing.demo.springboot;

import com.xinxing.demo.springboot.entity.User;
import com.xinxing.demo.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringJdbcTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSaveUser(){
        User user = new User();
        user.setUserName("xinxing");
        user.setUserPassword("54xinxing");
        user.setUserEmail("54xinxing@gmail.com");
        user.setUserAddress("成都");
        userService.saveUser(user);
    }

    //("throw org.springframework.jdbc.IncorrectResultSetColumnCountException: Incorrect column count: expected 1, actual 5. desc：<T>org.springframework.jdbc.core.JdbcTemplate only support Integer/String ... , not support user-defined (eg: com.xinxing.springboot.entity.User)")
    @Test
    public void testGetUserById(){
        User user = userService.getUserById(1L);
        System.out.println(user.toString());
    }

    @Test
    public void testGetUserNameById(){
        String userName = userService.getUserNameById(1L);
        System.out.println("user name >>>> " + userName);
    }
}
