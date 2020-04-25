package com.springCloud.provider.controller;

import com.springCloud.provider.Constants;
import com.springCloud.provider.entity.RentalOrder;
import com.springCloud.provider.persistence.RentalOrderMapper;
import com.springCloud.provider.response.Response;
import com.springCloud.provider.response.ResponseHelper;
import com.sun.org.apache.bcel.internal.generic.I2F;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 * @author 三牛
 */
@Api(value = "订单中心")
@RestController
@Slf4j
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private RentalOrderMapper orderMapper;


    @ApiOperation(value = "根据订单id查询订单信息", notes = "根据订单id查询一条订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", value = "订单id", required = true, dataType = "long", paramType = "path")
    })
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value = "orderByOid/{orderId}",method = RequestMethod.GET)
    public Response<RentalOrder> findOrderByOid(@PathVariable(value = "orderId") Long orderId){
        RentalOrder rentalOrder = orderMapper.selectByPrimaryKey(orderId);
        if (Objects.isNull(rentalOrder)) {
            return ResponseHelper.createNotFoundResponse();
        }
        return ResponseHelper.createSuccessResponse(rentalOrder);
    }

    @ApiOperation(value = "查询所有订单", notes = "查询所有订单列表")
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    public Response<List<RentalOrder>> findOrders() {
        List<RentalOrder> orders = orderMapper.selectAll();
        if (Objects.isNull(orders)) {
            return ResponseHelper.createNotFoundResponse();
        }
        return ResponseHelper.createSuccessResponse(orders);
    }

    @ApiOperation(value = "根据用户手机号查询订单", notes = "根据用户手机号查询订单")
    @ApiResponses({
            @ApiResponse(code = Constants.REQ_SUCCESS_CODE, message = Constants.REQ_SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.DATA_NOT_FOUND_CODE, message = Constants.DATA_NOT_FOUND_MESSAGE),
            @ApiResponse(code = Constants.SERVER_ERROR, message = Constants.SERVER_ERROR_MESSAGE)
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phoneNo", value = "手机号", required = true, dataType = "long", paramType = "path")
    })
    @RequestMapping(value = "findByPhoneNo/{phoneNo}",method = RequestMethod.GET)
    public Response<List<RentalOrder>> findByPhoneNo(@PathVariable(required = true) Long phoneNo) {
       List<RentalOrder> orders = orderMapper.selectByPhoneNo(phoneNo);
       if (Objects.isNull(orders)) {
           return ResponseHelper.createNotFoundResponse();
       }
       return ResponseHelper.createSuccessResponse(orders);
    }

}