package com.springCloud.provider.persistence;

import com.springCloud.provider.entity.RentalOrder;

import java.util.List;

public interface RentalOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(RentalOrder record);

    int insertSelective(RentalOrder record);

    RentalOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(RentalOrder record);

    int updateByPrimaryKey(RentalOrder record);

    List<RentalOrder> selectAll();

    List<RentalOrder> selectByPhoneNo(Long phoneNo);
}