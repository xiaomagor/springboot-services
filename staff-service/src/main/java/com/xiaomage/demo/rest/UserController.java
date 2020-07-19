package com.xiaomage.demo.rest;


import com.xiaomage.demo.dao.UserRepository;
import com.xiaomage.demo.entity.ResultMsg;
import com.xiaomage.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
/**
* @program: UserController
*
* @description:  user rest 服务
*
* @author: xiaomage
*
* @create: 2019-11-12 21:58
**/


@RestController
public class UserController {


    @Autowired
    private UserRepository userRepository;

    /**
     * 查询所有
     * @return
     */
    @GetMapping ("/user")
    public List<User> findById() {


        return this.userRepository.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @GetMapping ("/user/{id}")
    public Object findById(@PathVariable Long id) {

        User user =this.userRepository.findById(id).get();

        return user==null? new ResultMsg(404," Not Found  "):user;

    }

    /**
     * 新增
     * @param user
     * @return
     */
    @PostMapping("/user")
    public ResultMsg addUser(@RequestBody User user) {


        try {

            this.userRepository.save(user);

        }catch(Exception e){

            e.printStackTrace();

            return new ResultMsg(500,"Server Error ");
        }

        return new ResultMsg(200,"Success ");

    }

    /**
     * 修改
     * @param user
     * @return
     */
    @PutMapping("/user/{id}")
    public ResultMsg delUser(@RequestBody User user,@PathVariable Long id) {


        try {
            Optional<User> userOptional = userRepository.findById(id);



            if (!userOptional.isPresent())
                return  new ResultMsg(404,"Not Found ");
            user.setId(id);

            userRepository.save(user);

        }catch(Exception e){

            e.printStackTrace();
            return new ResultMsg(500,"Server Error ");
        }

        return new ResultMsg(200,"Success ");

    }


    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/user/{id}")
    public ResultMsg delUser(@PathVariable Long id) {


        try {

            this.userRepository.deleteById(id);

        }catch(Exception e){

            e.printStackTrace();
            return new ResultMsg(500,"Server Error ");
        }

        return new ResultMsg(200,"Success ");

    }

}
