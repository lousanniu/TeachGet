package com.springCloud.provider.service.Impl;

import com.springCloud.provider.exceptions.UserErrorException.ErrorException;
import com.springCloud.provider.pojo.params.UserParam;
import com.springCloud.provider.service.RegisterService;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    public static final String finalName = "Lily";

    @Override
    public void register(UserParam user) {
        if (Objects.equals(user.getName(), finalName)) {
            throw new ErrorException();
        }

        return;
    }
}