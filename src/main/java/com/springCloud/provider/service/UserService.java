package com.springCloud.provider.service;


import com.springCloud.provider.pojo.result.User;

import java.util.concurrent.ExecutionException;

public interface UserService {
    User findUserById(Long id) throws ExecutionException, InterruptedException;
}
