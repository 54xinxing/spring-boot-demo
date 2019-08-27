package com.xinxing.demo.springboot.service;

import com.xinxing.demo.springboot.entity.User;

public interface UserService {

    void saveUser(User user);

    User getUserById(Long id);

    String getUserNameById(Long id);
}
