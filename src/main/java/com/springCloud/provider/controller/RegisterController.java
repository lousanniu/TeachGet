package com.springCloud.provider.controller;

import com.springCloud.provider.Constants;
import com.springCloud.provider.entity.UserDO;
import com.springCloud.provider.persistence.UserDOMapper;
import com.springCloud.provider.pojo.params.UserParam;
import com.springCloud.provider.pojo.params.UserParam2;
import com.springCloud.provider.pojo.result.User;
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
import java.util.Date;
import java.util.Objects;

@Api(value = "注册中心")
@RestController
@Slf4j
@RequestMapping("/api/v1/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @Autowired
    private UserDOMapper userDOMapper;

    @ApiOperation(value = "注册", notes = "注册")
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Response<User> register(@RequestBody @Valid UserParam userParam) {
        log.info("参数结果未{}", userParam);
        registerService.register(userParam);
        return ResponseHelper.createResponse(Constants.REQ_SUCCESS_CODE, "注册成功");
    }


    @ApiOperation(value = "注册2", notes = "注册2")
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value = "/register2", method = RequestMethod.POST)
    public Response<User> register2(@RequestBody @Valid UserParam2 userParam) {
        log.info("参数结果未{}", userParam);
        UserDO userDO = new UserDO();

        userDO.setUserId(Long.valueOf(userParam.getUserId()));
        userDO.setUserName(userParam.getUserName());
        userDO.setPassword(userParam.getPassword());
        userDO.setCreateDate(new Date());
        userDO.setCreateBy("zhangsan");
        userDO.setUpdateBy("lisi");
        userDO.setUpdateDate(new Date());
        userDO.setRemarks("说要由marks");

        int res = userDOMapper.insertSelective(userDO);

        if (Objects.isNull(res)) {
            return ResponseHelper.createResponse(200, "注册失败");
        }
        return ResponseHelper.createResponse(Constants.REQ_SUCCESS_CODE, "注册成功");
    }


}