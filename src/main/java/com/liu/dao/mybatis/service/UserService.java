package com.liu.dao.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liu.dao.mybatis.entity.UserEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liu
 * @since 2020-09-23
 */
public interface UserService extends IService<UserEntity> {
    UserEntity findByUserName(String username);

    void processRegistratration(UserEntity userEntity);
}
