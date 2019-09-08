package com.springCloud.provider.exceptions.UserErrorException;

import com.springCloud.provider.exceptions.UserBuisenessException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */
public class ErrorException extends UserBuisenessException {

    public ErrorException() {
        super(9001, "您的用户名已被注册");
    }

}