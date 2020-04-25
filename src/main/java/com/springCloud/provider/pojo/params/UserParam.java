package com.springCloud.provider.pojo.params;

import com.springCloud.provider.annotation.PatternInt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */
@ApiModel(value = "UserParams", description = "用户信息")
@Data
@Accessors(chain=true)
public class UserParam {
    @ApiModelProperty(value = "用户id", position = 1, required = true, example = "100")
    private Integer id;

    @ApiModelProperty(value = "名称", position = 2,  required = true, example = "Lily")
    @NotBlank(message = "用户名不能为空")  //此注解是不能为空的意思，包括空字符串，此注解不能用在Integer上，只用于String
    private String name;

    @ApiModelProperty(value = "年龄", position = 3, required = true, example = "28")
    @NotNull(message = "不可传null过来呀，宏迪") //这个是专门判断integer和int型是否为空的， 如果客户端传个空字符串，会被认为是null
    private Integer age;

    @ApiModelProperty(position = 4, value = "1 男性1； 0 女性；", required = true, example = "1")
    @PatternInt(val = {0,1}, message = "性别只能是0或1")
    private Integer sex;

    @ApiModelProperty(position = 5, value = "1 男性1； 0 女性；", required = true, example = "1")
    @PatternInt(val = {0,1}, message = "性别只能是0或1")
    private Integer hello;

}