package com.springCloud.provider.controller;

import com.springCloud.provider.Constants;
import com.springCloud.provider.entity.RentalOrder;
import com.springCloud.provider.entity.UserDO;
import com.springCloud.provider.persistence.UserDOMapper;
import com.springCloud.provider.response.Response;
import com.springCloud.provider.response.ResponseHelper;
import com.springCloud.provider.service.UserService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

@Api(value = "用户中心控制器")
@RestController
@Slf4j
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDOMapper userDoMapper;

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
    public Response<UserDO> findUserByName(@PathVariable("userId") Long userId ) throws ExecutionException, InterruptedException {
        System.out.println(11);
        if (Objects.isNull(userId)) {
            log.error("参数id为空");
            return ResponseHelper.createResponse(Constants.SERVER_ERROR, Constants.SERVER_ERROR_MESSAGE);
        }
        UserDO user = userService.findUserById(userId);
        if (Objects.isNull(user)) {
            return ResponseHelper.createNotFoundResponse();
        }
        return ResponseHelper.createSuccessResponse(user);
    }

    @ApiOperation(value = "根据用户id，删除用户信息", notes = "根据用户id，删除用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "long", paramType = "path")
    })
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value = "{userId}",method = RequestMethod.DELETE)
    public Response deleteById(@PathVariable("userId") Long userId ) {

        Integer i = userDoMapper.deleteByPrimaryKey(userId);
        if (Objects.isNull(i)) {
            System.out.println("删除失败");
            return ResponseHelper.createNotFoundResponse();
        }
        System.out.println("删除成功");
        return ResponseHelper.createSuccessResponse();
    }

    @ApiOperation(value = "查询所有用户信息列表", notes = "查询所有用户信息")
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public Response<List<UserDO>> findAll(){
       List<UserDO> users = userDoMapper.selectAll();
       if (Objects.isNull(users)) {
           return ResponseHelper.createNotFoundResponse();
       }
       return ResponseHelper.createSuccessResponse(users);
    }

    @ApiOperation(value = "根据用户id查询用户订单", notes = "根据用户id查询用户订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", required = true, dataType = "long", paramType = "path")
    })
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value="/orders/{userId}",method = RequestMethod.GET)
    public Response<List<RentalOrder>> ordersByUserId(@PathVariable("userId") Long userId) {
       List<RentalOrder> orders = userService.findOrders(userId);
       if (Objects.isNull(orders)){
           return ResponseHelper.createNotFoundResponse();
       }
       return ResponseHelper.createSuccessResponse(orders);
    }
}
