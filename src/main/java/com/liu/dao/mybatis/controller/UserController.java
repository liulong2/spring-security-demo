package com.liu.dao.mybatis.controller;


import com.liu.dao.mybatis.entity.UserEntity;
import com.liu.dao.mybatis.service.UserEntityService;
import com.liu.dao.mybatis.service.impl.UserEntityServiceImpl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
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
@RequestMapping(value = "/user/entity", produces = "application/json")
@CrossOrigin(origins = "*")
//@ConfigurationProperties(prefix = "tace.order")
public class UserController {

    private int pageSize = 10;
    @Autowired
    private UserEntityService userentityService;

    @PostMapping
    public String processRegistratration(UserEntity userEntity) {

        userentityService.processRegistratration(userEntity);
        return "成功";
    }

//    @GetMapping
//    public String ordersForUser() {
//        return "";
//    }
    @PostMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    
    public String strCollection() {
        return "";
    }

}
