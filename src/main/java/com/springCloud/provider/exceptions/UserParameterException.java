package com.springCloud.provider.exceptions;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */
public class UserParameterException extends UserRuntimeException{
    private static final long serialVersionUID = -6164729939471924058L;

    public UserParameterException() {
        super(4010, "请求参数异常");
    }

    public UserParameterException(int code) {
        super(code);
    }

    public UserParameterException(String msg) {
        super(4010, msg);
    }

    public UserParameterException(int code, String description) {
        super(code, description);
    }

    public UserParameterException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UserParameterException(int code, String description, Throwable cause) {
        super(code, description, cause);
    }

}