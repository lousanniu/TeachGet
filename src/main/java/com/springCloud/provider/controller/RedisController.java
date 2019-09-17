package com.springCloud.provider.controller;

import com.springCloud.provider.Constants;
import com.springCloud.provider.response.Response;
import com.springCloud.provider.response.ResponseHelper;
import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/9/16
 */
@Api(value = "用户中心控制器")
@RestController
@Slf4j
@RequestMapping("/api/v1/user/redis")
public class RedisController {

    @Autowired
    private  RedisTemplate stringSerializerRedisTemplate;

    @ApiOperation(value = "Redis测试", notes = "Redis测试")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "testParam", value = "订单ID", required = false, dataType = "String", paramType = "query" )
    })
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public Response<String> testRedis(@RequestParam(value = "testParam", required = false)  String testParam) {
        log.info("参数为{}", testParam);
        if (StringUtils.isEmpty(testParam)) {
            return ResponseHelper.createNotFoundResponse();
        }
        stringSerializerRedisTemplate.opsForValue().set(testParam, String.valueOf(Math.random()));
        return ResponseHelper.createSuccessResponse(String.valueOf(stringSerializerRedisTemplate.opsForValue().get(testParam)));
    }

}