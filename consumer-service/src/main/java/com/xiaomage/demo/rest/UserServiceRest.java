package com.xiaomage.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
public class UserServiceRest {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/get/user")
    public List findAll() {

        return restTemplate.getForObject("http://user-service:8000/user", List.class);

    }

}
