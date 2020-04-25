package com.springCloud.provider.pojo.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 三牛
 */
@ApiModel(value = "UserParams2", description = "用户信息")
@Data
public class UserParam2 {

    @ApiModelProperty(value = "用户id", position = 1, required = true, example = "100")
    private Long userId;

    @ApiModelProperty(value = "用户名称", position = 1, required = true, example = "100")
    private String userName;

    @ApiModelProperty(value = "密码", position = 1, required = true, example = "100")
    private String password;
}