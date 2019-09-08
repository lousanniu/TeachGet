package com.springCloud.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springCloud.provider.pojo.result.UserResult;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserResult>{
	
}
