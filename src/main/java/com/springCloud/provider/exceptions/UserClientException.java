package com.springCloud.provider.exceptions;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */
public class UserClientException extends UserRuntimeException{

    private static final long serialVersionUID = 6666556043522681444L;

    public UserClientException() {
        super(4000, String.format("[%s]", "调用端异常"));
    }

    public UserClientException(int code) {
        super(code, String.format("[%s]", "调用端异常"));
    }

    public UserClientException(String description) {
        super(4000, String.format("%s", description));
    }

    public UserClientException(int code, String description) {
        super(code, String.format("%s", description));
    }

    public UserClientException(String description, Throwable cause) {
        super(String.format("%s", description), cause);
    }

    public UserClientException(int code, String description, Throwable cause) {
        super(code, String.format("%s", description), cause);
    }

}