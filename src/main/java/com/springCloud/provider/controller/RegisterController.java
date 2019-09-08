package com.springCloud.provider.controller;

import com.springCloud.provider.Constants;
import com.springCloud.provider.pojo.params.UserParam;
import com.springCloud.provider.pojo.result.UserResult;
import com.springCloud.provider.response.Response;
import com.springCloud.provider.response.ResponseHelper;
import com.springCloud.provider.service.RegisterService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户注册〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */
@Api(value = "注册中心")
@RestController
@Slf4j
@RequestMapping("/api/v1/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @ApiOperation(value = "注册", notes = "注册")
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Response<UserResult> register(@RequestBody @Valid UserParam userParam) {
        log.info("参数结果未{}", userParam);
        registerService.register(userParam);
        return ResponseHelper.createResponse(Constants.REQ_SUCCESS_CODE, "注册成功");
    }
}