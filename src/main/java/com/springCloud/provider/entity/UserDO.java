package com.springCloud.provider.entity;

import java.math.BigDecimal;
import java.util.Date;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getHeadPortraitUrl() {
        return headPortraitUrl;
    }

    public void setHeadPortraitUrl(String headPortraitUrl) {
        this.headPortraitUrl = headPortraitUrl == null ? null : headPortraitUrl.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber == null ? null : idCardNumber.trim();
    }

    public String getIdCardUrl() {
        return idCardUrl;
    }

    public void setIdCardUrl(String idCardUrl) {
        this.idCardUrl = idCardUrl == null ? null : idCardUrl.trim();
    }

    public String getDrivingLicenseUrl() {
        return drivingLicenseUrl;
    }

    public void setDrivingLicenseUrl(String drivingLicenseUrl) {
        this.drivingLicenseUrl = drivingLicenseUrl == null ? null : drivingLicenseUrl.trim();
    }

    public Integer getAuditFlag() {
        return auditFlag;
    }

    public void setAuditFlag(Integer auditFlag) {
        this.auditFlag = auditFlag;
    }

    public Integer getInterimAuditFlag() {
        return interimAuditFlag;
    }

    public void setInterimAuditFlag(Integer interimAuditFlag) {
        this.interimAuditFlag = interimAuditFlag;
    }

    public Integer getInterimTimesRemained() {
        return interimTimesRemained;
    }

    public void setInterimTimesRemained(Integer interimTimesRemained) {
        this.interimTimesRemained = interimTimesRemained;
    }

    public String getInterimIdCardNumber() {
        return interimIdCardNumber;
    }

    public void setInterimIdCardNumber(String interimIdCardNumber) {
        this.interimIdCardNumber = interimIdCardNumber == null ? null : interimIdCardNumber.trim();
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getIssuingTime() {
        return issuingTime;
    }

    public void setIssuingTime(Date issuingTime) {
        this.issuingTime = issuingTime;
    }

    public String getOcrId() {
        return ocrId;
    }

    public void setOcrId(String ocrId) {
        this.ocrId = ocrId == null ? null : ocrId.trim();
    }

    public String getOcrDrivingLicense() {
        return ocrDrivingLicense;
    }

    public void setOcrDrivingLicense(String ocrDrivingLicense) {
        this.ocrDrivingLicense = ocrDrivingLicense == null ? null : ocrDrivingLicense.trim();
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason == null ? null : failureReason.trim();
    }

    public Byte getScanFaceFlag() {
        return scanFaceFlag;
    }

    public void setScanFaceFlag(Byte scanFaceFlag) {
        this.scanFaceFlag = scanFaceFlag;
    }

    public String getValidationIdCardNumber() {
        return validationIdCardNumber;
    }

    public void setValidationIdCardNumber(String validationIdCardNumber) {
        this.validationIdCardNumber = validationIdCardNumber == null ? null : validationIdCardNumber.trim();
    }

    public String getValidationName() {
        return validationName;
    }

    public void setValidationName(String validationName) {
        this.validationName = validationName == null ? null : validationName.trim();
    }

    public Date getValidationIdCardExpireDate() {
        return validationIdCardExpireDate;
    }

    public void setValidationIdCardExpireDate(Date validationIdCardExpireDate) {
        this.validationIdCardExpireDate = validationIdCardExpireDate;
    }

    public Date getIdCardExpireDate() {
        return idCardExpireDate;
    }

    public void setIdCardExpireDate(Date idCardExpireDate) {
        this.idCardExpireDate = idCardExpireDate;
    }

    public String getIdCardBackUrl() {
        return idCardBackUrl;
    }

    public void setIdCardBackUrl(String idCardBackUrl) {
        this.idCardBackUrl = idCardBackUrl == null ? null : idCardBackUrl.trim();
    }

    public String getIdCardBackUrlHistory() {
        return idCardBackUrlHistory;
    }

    public void setIdCardBackUrlHistory(String idCardBackUrlHistory) {
        this.idCardBackUrlHistory = idCardBackUrlHistory == null ? null : idCardBackUrlHistory.trim();
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl == null ? null : faceUrl.trim();
    }

    public String getFaceUrlHistory() {
        return faceUrlHistory;
    }

    public void setFaceUrlHistory(String faceUrlHistory) {
        this.faceUrlHistory = faceUrlHistory == null ? null : faceUrlHistory.trim();
    }

    public String getValidationLicenseNumber() {
        return validationLicenseNumber;
    }

    public void setValidationLicenseNumber(String validationLicenseNumber) {
        this.validationLicenseNumber = validationLicenseNumber == null ? null : validationLicenseNumber.trim();
    }

    public String getValidationLicenseName() {
        return validationLicenseName;
    }

    public void setValidationLicenseName(String validationLicenseName) {
        this.validationLicenseName = validationLicenseName == null ? null : validationLicenseName.trim();
    }

    public Date getValidationLicenseExpireDate() {
        return validationLicenseExpireDate;
    }

    public void setValidationLicenseExpireDate(Date validationLicenseExpireDate) {
        this.validationLicenseExpireDate = validationLicenseExpireDate;
    }

    public String getValidationOcrIdFront() {
        return validationOcrIdFront;
    }

    public void setValidationOcrIdFront(String validationOcrIdFront) {
        this.validationOcrIdFront = validationOcrIdFront == null ? null : validationOcrIdFront.trim();
    }

    public String getValidationOcrDrivingLicense() {
        return validationOcrDrivingLicense;
    }

    public void setValidationOcrDrivingLicense(String validationOcrDrivingLicense) {
        this.validationOcrDrivingLicense = validationOcrDrivingLicense == null ? null : validationOcrDrivingLicense.trim();
    }

    public String getDrivingLicenseBackUrl() {
        return drivingLicenseBackUrl;
    }

    public void setDrivingLicenseBackUrl(String drivingLicenseBackUrl) {
        this.drivingLicenseBackUrl = drivingLicenseBackUrl == null ? null : drivingLicenseBackUrl.trim();
    }

    public String getDrivingLicenseBackUrlHistory() {
        return drivingLicenseBackUrlHistory;
    }

    public void setDrivingLicenseBackUrlHistory(String drivingLicenseBackUrlHistory) {
        this.drivingLicenseBackUrlHistory = drivingLicenseBackUrlHistory == null ? null : drivingLicenseBackUrlHistory.trim();
    }

    public String getDrivingLicenseArchiveNo() {
        return drivingLicenseArchiveNo;
    }

    public void setDrivingLicenseArchiveNo(String drivingLicenseArchiveNo) {
        this.drivingLicenseArchiveNo = drivingLicenseArchiveNo == null ? null : drivingLicenseArchiveNo.trim();
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo == null ? null : drivingLicenseNo.trim();
    }

    public Integer getDrivingLicenseReducePoint() {
        return drivingLicenseReducePoint;
    }

    public void setDrivingLicenseReducePoint(Integer drivingLicenseReducePoint) {
        this.drivingLicenseReducePoint = drivingLicenseReducePoint;
    }

    public String getDrivingLicenseCityName() {
        return drivingLicenseCityName;
    }

    public void setDrivingLicenseCityName(String drivingLicenseCityName) {
        this.drivingLicenseCityName = drivingLicenseCityName == null ? null : drivingLicenseCityName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Long getCancelCnt() {
        return cancelCnt;
    }

    public void setCancelCnt(Long cancelCnt) {
        this.cancelCnt = cancelCnt;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public BigDecimal getHkcoin() {
        return hkcoin;
    }

    public void setHkcoin(BigDecimal hkcoin) {
        this.hkcoin = hkcoin;
    }

    public String getRegisteredCityId() {
        return registeredCityId;
    }

    public void setRegisteredCityId(String registeredCityId) {
        this.registeredCityId = registeredCityId == null ? null : registeredCityId.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getChannelCityId() {
        return channelCityId;
    }

    public void setChannelCityId(String channelCityId) {
        this.channelCityId = channelCityId == null ? null : channelCityId.trim();
    }

    public String getInviteUserId() {
        return inviteUserId;
    }

    public void setInviteUserId(String inviteUserId) {
        this.inviteUserId = inviteUserId == null ? null : inviteUserId.trim();
    }

    public String getLocationCityId() {
        return locationCityId;
    }

    public void setLocationCityId(String locationCityId) {
        this.locationCityId = locationCityId == null ? null : locationCityId.trim();
    }

    public Integer getZhimaScore() {
        return zhimaScore;
    }

    public void setZhimaScore(Integer zhimaScore) {
        this.zhimaScore = zhimaScore;
    }

    public String getZhimaOpenId() {
        return zhimaOpenId;
    }

    public void setZhimaOpenId(String zhimaOpenId) {
        this.zhimaOpenId = zhimaOpenId == null ? null : zhimaOpenId.trim();
    }

    public Integer getZhimaAuth() {
        return zhimaAuth;
    }

    public void setZhimaAuth(Integer zhimaAuth) {
        this.zhimaAuth = zhimaAuth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCardUrlHistory() {
        return idCardUrlHistory;
    }

    public void setIdCardUrlHistory(String idCardUrlHistory) {
        this.idCardUrlHistory = idCardUrlHistory == null ? null : idCardUrlHistory.trim();
    }

    public String getDrivingLicenseUrlHistory() {
        return drivingLicenseUrlHistory;
    }

    public void setDrivingLicenseUrlHistory(String drivingLicenseUrlHistory) {
        this.drivingLicenseUrlHistory = drivingLicenseUrlHistory == null ? null : drivingLicenseUrlHistory.trim();
    }

    public String getSelfieUrl() {
        return selfieUrl;
    }

    public void setSelfieUrl(String selfieUrl) {
        this.selfieUrl = selfieUrl == null ? null : selfieUrl.trim();
    }

    public String getSelfieUrlHistory() {
        return selfieUrlHistory;
    }

    public void setSelfieUrlHistory(String selfieUrlHistory) {
        this.selfieUrlHistory = selfieUrlHistory == null ? null : selfieUrlHistory.trim();
    }

    public Integer getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(Integer creditStatus) {
        this.creditStatus = creditStatus;
    }

    public Date getCreditStatusUpdatedAt() {
        return creditStatusUpdatedAt;
    }

    public void setCreditStatusUpdatedAt(Date creditStatusUpdatedAt) {
        this.creditStatusUpdatedAt = creditStatusUpdatedAt;
    }

    public Byte getEnterpriseAuthFlag() {
        return enterpriseAuthFlag;
    }

    public void setEnterpriseAuthFlag(Byte enterpriseAuthFlag) {
        this.enterpriseAuthFlag = enterpriseAuthFlag;
    }

    public String getEnterpriseAuthImgUrl() {
        return enterpriseAuthImgUrl;
    }

    public void setEnterpriseAuthImgUrl(String enterpriseAuthImgUrl) {
        this.enterpriseAuthImgUrl = enterpriseAuthImgUrl == null ? null : enterpriseAuthImgUrl.trim();
    }

    public String getEnterpriseAuthImgUrlHistory() {
        return enterpriseAuthImgUrlHistory;
    }

    public void setEnterpriseAuthImgUrlHistory(String enterpriseAuthImgUrlHistory) {
        this.enterpriseAuthImgUrlHistory = enterpriseAuthImgUrlHistory == null ? null : enterpriseAuthImgUrlHistory.trim();
    }

    public Date getValidationStartTime() {
        return validationStartTime;
    }

    public void setValidationStartTime(Date validationStartTime) {
        this.validationStartTime = validationStartTime;
    }

    public Date getValidationSubmitTime() {
        return validationSubmitTime;
    }

    public void setValidationSubmitTime(Date validationSubmitTime) {
        this.validationSubmitTime = validationSubmitTime;
    }

    public Date getValidationDoneTime() {
        return validationDoneTime;
    }

    public void setValidationDoneTime(Date validationDoneTime) {
        this.validationDoneTime = validationDoneTime;
    }

    public Integer getIsValidateBadInformation() {
        return isValidateBadInformation;
    }

    public void setIsValidateBadInformation(Integer isValidateBadInformation) {
        this.isValidateBadInformation = isValidateBadInformation;
    }

    public Integer getValidateType() {
        return validateType;
    }

    public void setValidateType(Integer validateType) {
        this.validateType = validateType;
    }
}