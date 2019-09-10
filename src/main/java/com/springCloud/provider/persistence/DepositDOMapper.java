package com.springCloud.provider.persistence;

import com.springCloud.provider.entity.DepositDO;

public interface DepositDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DepositDO record);

    int insertSelective(DepositDO record);

    DepositDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DepositDO record);

    int updateByPrimaryKey(DepositDO record);
}