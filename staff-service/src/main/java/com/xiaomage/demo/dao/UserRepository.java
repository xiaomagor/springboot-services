package com.xiaomage.demo.dao;


import com.xiaomage.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
* @program: UserRepository
*
* @description: dao
*
* @author: xiaomage
*
* @create: 2019-11-12 21:57
**/

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);


}
