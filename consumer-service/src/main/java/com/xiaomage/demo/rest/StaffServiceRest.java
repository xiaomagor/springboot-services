package com.xiaomage.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class StaffServiceRest {

    @Autowired
    RestTemplate restTemplate;
    /**
     * 查询所有
     * @return
     */
    @GetMapping("/get/staff")
    public List findAll() {

        return restTemplate.getForObject("http://staff-service:8100/user", List.class);

    }
}
