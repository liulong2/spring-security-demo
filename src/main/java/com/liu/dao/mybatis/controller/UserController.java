package com.liu.dao.mybatis.controller;


import com.liu.dao.mybatis.entity.UserEntity;
import com.liu.dao.mybatis.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liu
 * @since 2020-09-23
 */
@RestController
@RequestMapping("/user/entity")
public class UserController {
    @Autowired
    private UserService userentityService;

    @PostMapping
    public String processRegistratration(UserEntity userEntity) {

        userentityService.processRegistratration(userEntity);


        return "成功";
    }

}
