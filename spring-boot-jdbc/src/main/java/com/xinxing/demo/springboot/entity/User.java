package com.xinxing.demo.springboot.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -8034258970945292288L;

    private Long userId;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userAddress;
}
