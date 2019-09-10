package com.springCloud.provider.persistence;

import com.springCloud.provider.entity.UserDo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    UserDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDo record);

    int updateByPrimaryKey(UserDo record);
}