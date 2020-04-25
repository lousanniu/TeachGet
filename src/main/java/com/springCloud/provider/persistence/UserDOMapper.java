package com.springCloud.provider.persistence;

import com.springCloud.provider.entity.UserDO;

import java.util.List;

public interface UserDOMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);

    List<UserDO> selectAll();

    //List<RentalOrder> ordersByUid(Long userId);

}