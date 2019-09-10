package com.springCloud.provider.persistence;

import com.springCloud.provider.entity.UserDO;

public interface UserDOMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}