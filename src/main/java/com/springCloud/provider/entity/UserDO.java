package com.springCloud.provider.entity;

import lombok.Data;
import org.hibernate.validator.internal.util.stereotypes.ThreadSafe;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserDO {
    private Long userId;

    private String userName;

    private String password;

    private String headPortraitUrl;

    private String nickName;

    private Boolean gender;

    private Date birthday;

    private String mail;

    private String idCardNumber;

    private String idCardUrl;

    private String drivingLicenseUrl;

    private Integer auditFlag;

    private Integer interimAuditFlag;

    private Integer interimTimesRemained;

    private String interimIdCardNumber;

    private Date expiryDate;

    private Date issuingTime;

    private String ocrId;

    private String ocrDrivingLicense;

    private BigDecimal accountBalance;

    private BigDecimal deposit;

    private Integer refundStatus;

    private String failureReason;

    private Byte scanFaceFlag;

    private String validationIdCardNumber;

    private String validationName;

    private Date validationIdCardExpireDate;

    private Date idCardExpireDate;

    private String idCardBackUrl;

    private String idCardBackUrlHistory;

    private String faceUrl;

    private String faceUrlHistory;

    private String validationLicenseNumber;

    private String validationLicenseName;

    private Date validationLicenseExpireDate;

    private String validationOcrIdFront;

    private String validationOcrDrivingLicense;

    private String drivingLicenseBackUrl;

    private String drivingLicenseBackUrlHistory;

    private String drivingLicenseArchiveNo;

    private String drivingLicenseNo;

    private Integer drivingLicenseReducePoint;

    private String drivingLicenseCityName;

    private Date createDate;

    private String createBy;

    private Date updateDate;

    private String updateBy;

    private String remarks;

    private String delFlag;

    private Long cancelCnt;

    private String openId;

    private Integer source;

    private BigDecimal hkcoin;

    private String registeredCityId;

    private String channel;

    private String channelCityId;

    private String inviteUserId;

    private String locationCityId;

    private Integer zhimaScore;

    private String zhimaOpenId;

    private Integer zhimaAuth;

    private String name;

    private String idCardUrlHistory;

    private String drivingLicenseUrlHistory;

    private String selfieUrl;

    private String selfieUrlHistory;

    private Integer creditStatus;

    private Date creditStatusUpdatedAt;

    private Byte enterpriseAuthFlag;

    private String enterpriseAuthImgUrl;

    private String enterpriseAuthImgUrlHistory;

    private Date validationStartTime;

    private Date validationSubmitTime;

    private Date validationDoneTime;

    private Integer isValidateBadInformation;

    private Integer validateType;

}