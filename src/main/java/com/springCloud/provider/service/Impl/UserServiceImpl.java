package com.springCloud.provider.service.Impl;

import com.springCloud.provider.entity.UserDo;
import com.springCloud.provider.mapper.UserMapper;
import com.springCloud.provider.persistence.UserDoMapper;
import com.springCloud.provider.pojo.result.UserResult;
import com.springCloud.provider.service.UserService;
import com.springCloud.provider.util.ProviderThreadPoolUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserResult findUserById(Long id) throws ExecutionException, InterruptedException {
        Future result = ProviderThreadPoolUtil.execAsync(new MyTask(id));
        return (UserResult)result.get();
    }

    class MyTask implements Callable{
        private Long id;

        public MyTask(Long id) {
            this.id = id;
        }

        @Override
        public UserResult call() throws Exception {
            log.info("当前线程是:{}", Thread.currentThread().getName());
            return userMapper.selectById(id);
        }
    }

}
