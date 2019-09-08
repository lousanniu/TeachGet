package com.springCloud.provider.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/9/7
 */
@Data
@Builder
@ApiModel
public class UserVo {

    @ApiModelProperty(value = "用户id")
    private Integer id;

    @ApiModelProperty(value = "名称", position = 2, example = "Lily")
    private String name;

    @ApiModelProperty(value = "年龄", position = 3, example = "28")
    private Integer age;

    @ApiModelProperty(position = 4, value = "1 男性； 0 女性；", required = true, example = "1")
    private String sex;

}