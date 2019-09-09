package com.springCloud.provider.service;

import com.springCloud.provider.entity.UserDo;
import com.springCloud.provider.pojo.result.UserResult;

import java.util.concurrent.ExecutionException;

public interface UserService {
    UserResult findUserById(Long id) throws ExecutionException, InterruptedException;
}
