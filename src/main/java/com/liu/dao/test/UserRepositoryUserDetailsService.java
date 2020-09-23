package com.liu.dao.test;

import com.liu.dao.mybatis.entity.UserEntity;
import com.liu.dao.mybatis.service.UserEntityService;
import com.liu.dao.mybatis.service.impl.UserEntityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserRepositoryUserDetailsService implements UserDetailsService {
    @Autowired
    private UserEntityService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity byUserName = userService.findByUserName(username);
        if (!StringUtils.isEmpty(byUserName)) {
            return byUserName;
        }
        throw new UsernameNotFoundException("用户:" + username + "错误");
    }
}
