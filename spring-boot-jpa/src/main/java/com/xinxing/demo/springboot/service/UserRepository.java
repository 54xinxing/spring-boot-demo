package com.xinxing.demo.springboot.service;

import com.xinxing.demo.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByUserId(Long userId);

    List<User> getUsersByUserAddress(String userAddress);

}
