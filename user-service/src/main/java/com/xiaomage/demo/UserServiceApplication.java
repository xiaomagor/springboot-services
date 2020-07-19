package com.xiaomage.demo;

import com.xiaomage.demo.jpa.repository.CustomSimpleJpaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
* @program: SpringBootDemoApplication
*
* @description: 服务启动
*
* @author: xiaomage
*
* @create: 2019-11-12 21:59
**/

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.xiaomage.demo.dao"},repositoryBaseClass = CustomSimpleJpaRepository.class)
public class UserServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserServiceApplication.class, args);
       // Persistence.generateSchema("default", null);
    }
}
