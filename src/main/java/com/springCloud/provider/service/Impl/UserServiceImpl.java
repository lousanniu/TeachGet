package com.springCloud.provider.service.Impl;

import com.springCloud.provider.entity.UserDO;
import com.springCloud.provider.persistence.UserDOMapper;
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
    private UserDOMapper userDoMapper;

    @Override
    public UserDO findUserById(Long id) throws ExecutionException, InterruptedException {
        Future result = ProviderThreadPoolUtil.execAsync(new MyTask(id));
        return (UserDO)result.get();
    }

    class MyTask implements Callable{
        private Long id;

        public MyTask(Long id) {
            this.id = id;
        }

        @Override
        public UserDO call() throws Exception {
            log.info("当前线程是:{}", Thread.currentThread().getName());
            UserDO userResult = userDoMapper.selectByPrimaryKey(id);
            return userResult;
        }
    }

}
