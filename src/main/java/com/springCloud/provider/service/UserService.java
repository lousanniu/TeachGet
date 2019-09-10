package com.springCloud.provider.service;


import com.springCloud.provider.entity.UserDo;

import java.util.concurrent.ExecutionException;

public interface UserService {
    UserDo findUserById(Long id) throws ExecutionException, InterruptedException;
}
