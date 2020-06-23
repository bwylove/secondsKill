package com.baijh.kill.model.mapper;

import com.baijh.kill.model.entity.RandomCode;

public interface RandomCodeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RandomCode record);

    int insertSelective(RandomCode record);

    RandomCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RandomCode record);

    int updateByPrimaryKey(RandomCode record);
}
