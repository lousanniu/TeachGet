package com.springCloud.provider.handler;

import com.springCloud.provider.exceptions.UserRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.util.Locale;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */
@Order(-2147483648)
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    private static final Locale DEFAULT_LOCALE;
    @Autowired
    private MessageSource messageSource;

    public GlobalExceptionHandler() {
    }

    @ResponseBody
    @ExceptionHandler({ConstraintViolationException.class})
    public RestApiError handleConstraintViolation(HttpServletRequest request, ConstraintViolationException ex) {
        RestApiError apiError = new RestApiError(ex);
        apiError.setDescription("Validation error");
        apiError.setCode(4010);
        apiError.addValidationErrors(ex.getConstraintViolations());
        log.error("path:{} 堆栈信息:{}", request.getRequestURL().toString(), ex);
        return apiError;
    }

    @ResponseBody
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public RestApiError handleMethodArgumentNotValidException(HttpServletRequest request, MethodArgumentNotValidException ex) {
        RestApiError apiError = new RestApiError(ex);
        apiError.setDescription("请求参数异常");
        apiError.setCode(4010);
        apiError.addValidationErrors(ex.getBindingResult().getFieldErrors());
        apiError.addValidationError(ex.getBindingResult().getGlobalErrors());
        log.error("path:{} 堆栈信息:{}", request.getRequestURL().toString(), ex);
        return apiError;
    }

    @ResponseBody
    @ExceptionHandler({BindException.class})
    public RestApiError handleBindException(HttpServletRequest request, BindException ex) {
        RestApiError apiError = new RestApiError(ex);
        apiError.setDescription("请求参数异常");
        apiError.setCode(4010);
        apiError.addValidationErrors(ex.getBindingResult().getFieldErrors());
        apiError.addValidationError(ex.getBindingResult().getGlobalErrors());
        log.error("path:{} 堆栈信息:{}", request.getRequestURL().toString(), ex);
        return apiError;
    }

    @ResponseBody
    @ExceptionHandler({HttpMessageNotReadableException.class})
    public RestApiError handleHttpMessageNotReadableException(HttpServletRequest request, HttpMessageNotReadableException ex) {
        RestApiError apiError = new RestApiError("JSON格式错误", ex);
        apiError.setCode(4011);
        log.error("path:{} 堆栈信息:{}", request.getRequestURL().toString(), ex);
        return apiError;
    }

    @ResponseBody
    @ExceptionHandler({UserRuntimeException.class})
    public RestApiError handleException(HttpServletRequest request, UserRuntimeException ex) {
        RestApiError apiError = new RestApiError(this.getErrorMessage(ex.getDescription()), ex);
        apiError.setCode(ex.getCode());
        log.error("path:{} 堆栈信息:{}", request.getRequestURL().toString(), ex);
        return apiError;
    }

    @ResponseBody
    @ExceptionHandler({Exception.class})
    public RestApiError handleException(HttpServletRequest request, Exception ex) {
        RestApiError apiError = new RestApiError(ex);
        apiError.setCode(3000);
        log.error("path:{} 堆栈信息:{}", request.getRequestURL().toString(), ex);
        return apiError;
    }

    protected String getErrorMessage(String key) {
        try {
            return this.messageSource.getMessage(key, (Object[])null, DEFAULT_LOCALE);
        } catch (Exception var3) {
            return key;
        }
    }

    protected void printLog(String exceptionName, HttpServletRequest request, Exception ex) {
        log.error(exceptionName + " ******************************************************");
        log.error("URL:" + request.getRequestURL().toString());
        if (ex instanceof UserRuntimeException) {
            log.error("Description:" + ((UserRuntimeException)ex).getDescription());
        }

        log.error(ex.getLocalizedMessage());
        log.error(ex.getMessage());
        log.error("堆栈信息:", ex);
        log.error(exceptionName + " ******************************************************");
    }

    static {
        DEFAULT_LOCALE = Locale.SIMPLIFIED_CHINESE;
    }
}