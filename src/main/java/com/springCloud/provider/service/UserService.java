package com.springCloud.provider.service;



import com.springCloud.provider.entity.RentalOrder;
import com.springCloud.provider.entity.UserDO;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface UserService {
    UserDO findUserById(Long id) throws ExecutionException, InterruptedException;


    List<RentalOrder> findOrders(Long userId);
}
