package com.springCloud.provider.controller;

import com.springCloud.provider.Constants;
import com.springCloud.provider.pojo.result.UserResult;
import com.springCloud.provider.response.Response;
import com.springCloud.provider.response.ResponseHelper;
import com.springCloud.provider.service.UserService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.concurrent.ExecutionException;

@Api(value = "用户中心控制器")
@RestController
@Slf4j
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "swagger测试api", notes = "swagger测试api")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "testParam", value = "订单ID", required = false, dataType = "String", paramType = "query" )
    })
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public Response<String> testProvider(@RequestParam(value = "testParam", required = false)  String testParam){
        if (StringUtils.isEmpty(testParam)) {
            return ResponseHelper.createNotFoundResponse();
        }
        return ResponseHelper.createSuccessResponse(testParam);
    }

    @ApiOperation(value = "根据用户id，查询用户信息", notes = "根据用户id，查询用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "long", paramType = "path")
    })
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value = "{userId}",method = RequestMethod.GET)
    public Response<UserResult> findUserByName(@PathVariable("userId") Long userId ) throws ExecutionException, InterruptedException {
        if (Objects.isNull(userId)) {
            log.error("参数id为空");
            return ResponseHelper.createResponse(Constants.SERVER_ERROR, Constants.SERVER_ERROR_MESSAGE);
        }
        UserResult user = userService.findUserById(userId);
        if (Objects.isNull(user)) {
            return ResponseHelper.createNotFoundResponse();
        }
        return ResponseHelper.createSuccessResponse(user);
    }
}
