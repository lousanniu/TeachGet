package com.springCloud.provider.mapper;

import com.springCloud.provider.pojo.result.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDoMapper{

    User selectByPrimaryKey(Long id);
}