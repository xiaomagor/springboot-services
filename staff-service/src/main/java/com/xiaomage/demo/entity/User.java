package com.xiaomage.demo.entity;

import com.xiaomage.demo.jpa.annotation.IgnoreNullValue;

import javax.persistence.*;
import java.math.BigDecimal;

/**
* @program: User
*
* @description:  user pojo
*
* @author: xiaomage
*
* @create: 2019-11-12 21:58
**/

@Entity
@IgnoreNullValue
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column
    private String userid;
    @Column
    private String username;
    @Column
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
