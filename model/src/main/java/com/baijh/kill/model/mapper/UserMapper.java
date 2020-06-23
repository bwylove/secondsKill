package com.baijh.kill.model.mapper;

import com.baijh.kill.model.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUserName(@Param("userName") String userName);

    User selectByUserNamepsd(@Param("userName") String userName, @Param("password") String password);
}
