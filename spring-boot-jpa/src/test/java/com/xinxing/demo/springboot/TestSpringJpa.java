package com.xinxing.demo.springboot;

import com.xinxing.demo.springboot.entity.User;
import com.xinxing.demo.springboot.service.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestSpringJpa {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testGetUserByUserId(){
        User user = userRepository.getUserByUserId(1L);
        System.out.println(user.toString());
    }

    @Test
    public void testGetUsersByUserAddress(){
        List<User> users = userRepository.getUsersByUserAddress("上海");
        users.forEach(us ->{
            System.out.println(">>>> "+us.toString());
        });
    }
}
