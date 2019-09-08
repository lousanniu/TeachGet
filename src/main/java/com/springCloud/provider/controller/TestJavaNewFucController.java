package com.springCloud.provider.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.springCloud.provider.entity.UserDo;
import com.springCloud.provider.mapper.UserMapper;
import com.springCloud.provider.persistence.UserDoMapper;
import com.springCloud.provider.pojo.result.UserResult;
import com.springCloud.provider.pojo.vo.UserVo;
import com.springCloud.provider.response.Response;
import com.springCloud.provider.response.ResponseHelper;
import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/9/7
 */
@Api(value = "测试java8新特性")
@RestController
@RequestMapping("/api/v1/test_java8_new")
public class TestJavaNewFucController {

    @Autowired
    private UserMapper userMapper;

    @ApiOperation(value = "流式操作，取出list中对象的id，用逗号连接成字符串", notes = "功能： 流式操作，取出list中对象的id，用逗号连接成字符串 <p> list中封装User对象，把user对象的id取出来，连接成字符串</p>")
    @RequestMapping(value = "/stream", method = RequestMethod.GET)
    public Response<String> testOptional() {

        UserResult userResult1 = new UserResult().setAge(4500).setId(1).setName("黑熊精").setSex("女");
        UserResult userResult2 = new UserResult().setAge(1000000).setId(2).setName("八戒").setSex("女");
        UserResult userResult3 = new UserResult().setAge(99991).setId(3).setName("悟空").setSex("女");

        List<UserResult> list = Arrays.asList(userResult1, userResult2, userResult3);

        String userIdsStr = list.stream().map(UserResult::getId).map(String::valueOf).collect(Collectors.joining(","));
        return ResponseHelper.createSuccessResponse(userIdsStr);
    }

    @ApiOperation(value = "查询id < 10的用户", notes = "查询id < 10的用户，返回用户列表")
    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public Response<List<UserVo>> getUserListlt0() {
        QueryWrapper<UserResult> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(UserResult::getId, 1).or().eq(UserResult::getId, 2).or().eq(UserResult::getId, 3);
        List<UserResult> list = userMapper.selectList(wrapper);
        List<UserVo> userVos = new ArrayList<>(list.size());

        list.stream().forEach(
                userResult -> userVos.add(UserVo.builder().age(userResult.getAge()).id(userResult.getId()).sex(userResult.getSex()).name(userResult.getName()).build())

        );

        return ResponseHelper.createSuccessResponse(userVos);
    }
}