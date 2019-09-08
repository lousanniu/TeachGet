package com.springCloud.provider.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 娜苏苏
 */
@ApiModel
@Data
public class Entity implements Serializable {

    private static final long serialVersionUID = -9073095998693952756L;

    @ApiModelProperty(
            position = 0,
            value = "唯一索引标识"
    )
    private Long id;
    @ApiModelProperty(
            position = 31,
            value = "备注"
    )
    private String remarks;
    @JsonIgnore
    private Integer deleted = Integer.valueOf(0);
    @ApiModelProperty(
            position = 32,
            value = "创建人标识"
    )
    private String createdBy;
    @ApiModelProperty(
            position = 33,
            value = "创建时间"
    )
    private Date createdAt;
    @ApiModelProperty(
            position = 34,
            value = "最后更新人标识"
    )
    private String updatedBy;
    @ApiModelProperty(
            position = 35,
            value = "最后更新时间"
    )
    private Date updatedAt;
}