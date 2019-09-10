package com.springCloud.provider.service;



import com.springCloud.provider.entity.UserDO;

import java.util.concurrent.ExecutionException;

public interface UserService {
    UserDO findUserById(Long id) throws ExecutionException, InterruptedException;
}
