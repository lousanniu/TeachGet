package com.springCloud.provider.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DepositDO {
    private Long id;

    private Long userId;

    private BigDecimal deposit;

    private Integer refundStatus;

    private String cityId;

    private Date rechargeTime;

    private Date applyDate;

    private Date auditDate;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;

    private String remarks;

    private String deleted;

    private String phoneNo;

}