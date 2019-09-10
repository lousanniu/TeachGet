package com.springCloud.provider.persistence;

import com.springCloud.provider.entity.MemberDO;

public interface MemberDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberDO record);

    int insertSelective(MemberDO record);

    MemberDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberDO record);

    int updateByPrimaryKey(MemberDO record);
}