package com.springCloud.provider.exceptions;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */
public class UserBuisenessException extends UserRuntimeException{
    public UserBuisenessException() {
        super(5010, "业务代码异常抛异常了");
    }

    public UserBuisenessException(int code) {
        super(code);
    }

    public UserBuisenessException(String description) {
        super(5010, description);
    }

    public UserBuisenessException(int code, String description) {
        super(code, description);
    }

    public UserBuisenessException(String description, Throwable cause) {
        super(description, cause);
    }

    public UserBuisenessException(int code, String description, Throwable cause) {
        super(code, description, cause);
    }

}