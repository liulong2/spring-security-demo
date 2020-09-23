package com.liu.dao.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.dao.mybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liu
 * @since 2020-09-23
 */
 @Mapper
 @Repository
 @Scope("prototype")
public interface UserDAO extends BaseMapper<UserEntity> {

}
