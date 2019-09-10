package com.springCloud.provider.pojo.result;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@ApiModel(value = "User", description = "用户信息")
@Data
@Accessors(chain=true)
public class User implements Serializable{

    private Integer id;

    @ApiModelProperty(value = "名称", position = 2, example = "Lily")
    private String name;

    @ApiModelProperty(value = "年龄", position = 3, example = "28")
    private Integer age;

    @ApiModelProperty(position = 4, value = "1 男性； 0 女性；", required = true, example = "1")
    private String sex;
}
