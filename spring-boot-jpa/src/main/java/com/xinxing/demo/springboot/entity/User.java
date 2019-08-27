package com.xinxing.demo.springboot.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = -8034258970945292288L;

    @Id
    @GeneratedValue
    private Long userId;

    @Column
    private String userName;

    @Column
    private String userPassword;

    @Column
    private String userEmail;

    @Column
    private String userAddress;
}
