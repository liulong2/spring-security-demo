package com.liu.dao.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liu.dao.mybatis.entity.UserEntity;
import com.liu.dao.mybatis.mapper.UserDAO;
import com.liu.dao.mybatis.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liu
 * @since 2020-09-23
 */
@Service
@Primary
public class UserEntityServiceImpl extends ServiceImpl<UserDAO, UserEntity> implements UserEntityService {

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public UserEntity findByUserName(String username) {
        return getOne(lambdaQuery().eq(UserEntity::getUsername, username));
    }

    @Override
    public void processRegistratration(UserEntity userEntity) {
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
        save(userEntity);
    }

}
