package com.springCloud.provider.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RentalOrder {
    private Long orderId;

    private Long vehicleId;

    private String vno;

    private Long userId;

    private String phoneNo;

    private Date bookTime;

    private Integer orderStatus;

    private Date billingStime;

    private Date billingEtime;

    private Long branchSid;

    private String branchSname;

    private Long branchEid;

    private String branchEname;

    private Long intentionBranchEid;

    private Integer vehicleSmileage;

    private Integer vehicleEmileage;

    private BigDecimal firstUnitBilling;

    private BigDecimal addUnitBilling;

    private BigDecimal timeCost;

    private BigDecimal rentalCost;

    private BigDecimal actualPayment;

    private BigDecimal commonPayment;

    private BigDecimal benefitPayment;

    private BigDecimal giftPayment;

    private Integer inAdditionalPayment;

    private String terminateDesc;

    private Integer aerSupport;

    private Integer aerUseFlag;

    private BigDecimal aerCost;

    private BigDecimal aerUnitPrice;

    private Integer aerHour;

    private BigDecimal aerCostMaxInTime;

    private Byte aerCustomFlag;

    private Date closeTime;

    private String questionnaireId;

    private Byte answerFlag;

    private Byte fragranceUseFlag;

    private String fragranceScent;

    private String fragranceScentName;

    private BigDecimal dispatchFeeOrigin;

    private BigDecimal dispatchFee;

    private Byte dispatchRuleFlag;

    private BigDecimal fragranceCost;

    private String fragranceCostRuleId;

    private Byte fragranceCostFlag;

    private Integer fragranceReleaseDuration;

    private Date createDate;

    private String createBy;

    private Long billingTemplateId;

    private Date updateDate;

    private String updateBy;

    private String remarks;

    private String delFlag;

    private BigDecimal couponAmount;

    private BigDecimal originalAmount;

    private BigDecimal minimumCharge;

    private Integer useCouponFlag;

    private Integer useCoinFlag;

    private Integer coinPercent;

    private Integer valuationVersion;

    private String couponId;

    private BigDecimal startMileage;

    private BigDecimal endMileage;

    private BigDecimal mileageUnitBilling;

    private BigDecimal mileageAddBilling;

    private BigDecimal mileageCost;

    private Date payTime;

    private Integer costChangeFlag;

    private Integer spendsTime;

    private String runningMileage;

    private Integer cumulativeTime;

    private Integer source;

    private BigDecimal hkcoin;

    private String cancelReason;

    private String refundReason;

    private String cityId;

    private String bluetoothKey;

    private String bluetoothName;

    private Integer bluetoothType;

    private String bluetoothPassword;

    private Integer valuationRuleStatus;

    private String vehicleModelName;

    private String paymentId;

    private String tradeNo;

    private Integer paymentSource;

    private String preOrderId;

    private String prelicesingId;

    private Integer prelicesingFlag;

    private String prelicesingAuthNo;

    private String prelicesingOperationId;

    private BigDecimal prelicesingAmount;

    private BigDecimal prelicesingCreditAmount;

    private BigDecimal prelicesingFundAmount;

    private Integer prelicesingFlagOrigin;

    private Integer depositFree;

    private BigDecimal prelicesingAmountOrigin;

    private BigDecimal prelicesingCreditAmountOrigin;

    private BigDecimal prelicesingFundAmountOrigin;

    private BigDecimal prelicesingRestAmount;

    private BigDecimal prelicesingRestAmountOrigin;

    private Byte prelicesingType;

    private Byte tempAuth;

    private Byte typeNote;

    private Byte businessType;

    private Integer ubiScoreFlag;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVno() {
        return vno;
    }

    public void setVno(String vno) {
        this.vno = vno == null ? null : vno.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getBillingStime() {
        return billingStime;
    }

    public void setBillingStime(Date billingStime) {
        this.billingStime = billingStime;
    }

    public Date getBillingEtime() {
        return billingEtime;
    }

    public void setBillingEtime(Date billingEtime) {
        this.billingEtime = billingEtime;
    }

    public Long getBranchSid() {
        return branchSid;
    }

    public void setBranchSid(Long branchSid) {
        this.branchSid = branchSid;
    }

    public String getBranchSname() {
        return branchSname;
    }

    public void setBranchSname(String branchSname) {
        this.branchSname = branchSname == null ? null : branchSname.trim();
    }

    public Long getBranchEid() {
        return branchEid;
    }

    public void setBranchEid(Long branchEid) {
        this.branchEid = branchEid;
    }

    public String getBranchEname() {
        return branchEname;
    }

    public void setBranchEname(String branchEname) {
        this.branchEname = branchEname == null ? null : branchEname.trim();
    }

    public Long getIntentionBranchEid() {
        return intentionBranchEid;
    }

    public void setIntentionBranchEid(Long intentionBranchEid) {
        this.intentionBranchEid = intentionBranchEid;
    }

    public Integer getVehicleSmileage() {
        return vehicleSmileage;
    }

    public void setVehicleSmileage(Integer vehicleSmileage) {
        this.vehicleSmileage = vehicleSmileage;
    }

    public Integer getVehicleEmileage() {
        return vehicleEmileage;
    }

    public void setVehicleEmileage(Integer vehicleEmileage) {
        this.vehicleEmileage = vehicleEmileage;
    }

    public BigDecimal getFirstUnitBilling() {
        return firstUnitBilling;
    }

    public void setFirstUnitBilling(BigDecimal firstUnitBilling) {
        this.firstUnitBilling = firstUnitBilling;
    }

    public BigDecimal getAddUnitBilling() {
        return addUnitBilling;
    }

    public void setAddUnitBilling(BigDecimal addUnitBilling) {
        this.addUnitBilling = addUnitBilling;
    }

    public BigDecimal getTimeCost() {
        return timeCost;
    }

    public void setTimeCost(BigDecimal timeCost) {
        this.timeCost = timeCost;
    }

    public BigDecimal getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(BigDecimal rentalCost) {
        this.rentalCost = rentalCost;
    }

    public BigDecimal getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(BigDecimal actualPayment) {
        this.actualPayment = actualPayment;
    }

    public BigDecimal getCommonPayment() {
        return commonPayment;
    }

    public void setCommonPayment(BigDecimal commonPayment) {
        this.commonPayment = commonPayment;
    }

    public BigDecimal getBenefitPayment() {
        return benefitPayment;
    }

    public void setBenefitPayment(BigDecimal benefitPayment) {
        this.benefitPayment = benefitPayment;
    }

    public BigDecimal getGiftPayment() {
        return giftPayment;
    }

    public void setGiftPayment(BigDecimal giftPayment) {
        this.giftPayment = giftPayment;
    }

    public Integer getInAdditionalPayment() {
        return inAdditionalPayment;
    }

    public void setInAdditionalPayment(Integer inAdditionalPayment) {
        this.inAdditionalPayment = inAdditionalPayment;
    }

    public String getTerminateDesc() {
        return terminateDesc;
    }

    public void setTerminateDesc(String terminateDesc) {
        this.terminateDesc = terminateDesc == null ? null : terminateDesc.trim();
    }

    public Integer getAerSupport() {
        return aerSupport;
    }

    public void setAerSupport(Integer aerSupport) {
        this.aerSupport = aerSupport;
    }

    public Integer getAerUseFlag() {
        return aerUseFlag;
    }

    public void setAerUseFlag(Integer aerUseFlag) {
        this.aerUseFlag = aerUseFlag;
    }

    public BigDecimal getAerCost() {
        return aerCost;
    }

    public void setAerCost(BigDecimal aerCost) {
        this.aerCost = aerCost;
    }

    public BigDecimal getAerUnitPrice() {
        return aerUnitPrice;
    }

    public void setAerUnitPrice(BigDecimal aerUnitPrice) {
        this.aerUnitPrice = aerUnitPrice;
    }

    public Integer getAerHour() {
        return aerHour;
    }

    public void setAerHour(Integer aerHour) {
        this.aerHour = aerHour;
    }

    public BigDecimal getAerCostMaxInTime() {
        return aerCostMaxInTime;
    }

    public void setAerCostMaxInTime(BigDecimal aerCostMaxInTime) {
        this.aerCostMaxInTime = aerCostMaxInTime;
    }

    public Byte getAerCustomFlag() {
        return aerCustomFlag;
    }

    public void setAerCustomFlag(Byte aerCustomFlag) {
        this.aerCustomFlag = aerCustomFlag;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId == null ? null : questionnaireId.trim();
    }

    public Byte getAnswerFlag() {
        return answerFlag;
    }

    public void setAnswerFlag(Byte answerFlag) {
        this.answerFlag = answerFlag;
    }

    public Byte getFragranceUseFlag() {
        return fragranceUseFlag;
    }

    public void setFragranceUseFlag(Byte fragranceUseFlag) {
        this.fragranceUseFlag = fragranceUseFlag;
    }

    public String getFragranceScent() {
        return fragranceScent;
    }

    public void setFragranceScent(String fragranceScent) {
        this.fragranceScent = fragranceScent == null ? null : fragranceScent.trim();
    }

    public String getFragranceScentName() {
        return fragranceScentName;
    }

    public void setFragranceScentName(String fragranceScentName) {
        this.fragranceScentName = fragranceScentName == null ? null : fragranceScentName.trim();
    }

    public BigDecimal getDispatchFeeOrigin() {
        return dispatchFeeOrigin;
    }

    public void setDispatchFeeOrigin(BigDecimal dispatchFeeOrigin) {
        this.dispatchFeeOrigin = dispatchFeeOrigin;
    }

    public BigDecimal getDispatchFee() {
        return dispatchFee;
    }

    public void setDispatchFee(BigDecimal dispatchFee) {
        this.dispatchFee = dispatchFee;
    }

    public Byte getDispatchRuleFlag() {
        return dispatchRuleFlag;
    }

    public void setDispatchRuleFlag(Byte dispatchRuleFlag) {
        this.dispatchRuleFlag = dispatchRuleFlag;
    }

    public BigDecimal getFragranceCost() {
        return fragranceCost;
    }

    public void setFragranceCost(BigDecimal fragranceCost) {
        this.fragranceCost = fragranceCost;
    }

    public String getFragranceCostRuleId() {
        return fragranceCostRuleId;
    }

    public void setFragranceCostRuleId(String fragranceCostRuleId) {
        this.fragranceCostRuleId = fragranceCostRuleId == null ? null : fragranceCostRuleId.trim();
    }

    public Byte getFragranceCostFlag() {
        return fragranceCostFlag;
    }

    public void setFragranceCostFlag(Byte fragranceCostFlag) {
        this.fragranceCostFlag = fragranceCostFlag;
    }

    public Integer getFragranceReleaseDuration() {
        return fragranceReleaseDuration;
    }

    public void setFragranceReleaseDuration(Integer fragranceReleaseDuration) {
        this.fragranceReleaseDuration = fragranceReleaseDuration;
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

    public Long getBillingTemplateId() {
        return billingTemplateId;
    }

    public void setBillingTemplateId(Long billingTemplateId) {
        this.billingTemplateId = billingTemplateId;
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

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public BigDecimal getMinimumCharge() {
        return minimumCharge;
    }

    public void setMinimumCharge(BigDecimal minimumCharge) {
        this.minimumCharge = minimumCharge;
    }

    public Integer getUseCouponFlag() {
        return useCouponFlag;
    }

    public void setUseCouponFlag(Integer useCouponFlag) {
        this.useCouponFlag = useCouponFlag;
    }

    public Integer getUseCoinFlag() {
        return useCoinFlag;
    }

    public void setUseCoinFlag(Integer useCoinFlag) {
        this.useCoinFlag = useCoinFlag;
    }

    public Integer getCoinPercent() {
        return coinPercent;
    }

    public void setCoinPercent(Integer coinPercent) {
        this.coinPercent = coinPercent;
    }

    public Integer getValuationVersion() {
        return valuationVersion;
    }

    public void setValuationVersion(Integer valuationVersion) {
        this.valuationVersion = valuationVersion;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public BigDecimal getStartMileage() {
        return startMileage;
    }

    public void setStartMileage(BigDecimal startMileage) {
        this.startMileage = startMileage;
    }

    public BigDecimal getEndMileage() {
        return endMileage;
    }

    public void setEndMileage(BigDecimal endMileage) {
        this.endMileage = endMileage;
    }

    public BigDecimal getMileageUnitBilling() {
        return mileageUnitBilling;
    }

    public void setMileageUnitBilling(BigDecimal mileageUnitBilling) {
        this.mileageUnitBilling = mileageUnitBilling;
    }

    public BigDecimal getMileageAddBilling() {
        return mileageAddBilling;
    }

    public void setMileageAddBilling(BigDecimal mileageAddBilling) {
        this.mileageAddBilling = mileageAddBilling;
    }

    public BigDecimal getMileageCost() {
        return mileageCost;
    }

    public void setMileageCost(BigDecimal mileageCost) {
        this.mileageCost = mileageCost;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getCostChangeFlag() {
        return costChangeFlag;
    }

    public void setCostChangeFlag(Integer costChangeFlag) {
        this.costChangeFlag = costChangeFlag;
    }

    public Integer getSpendsTime() {
        return spendsTime;
    }

    public void setSpendsTime(Integer spendsTime) {
        this.spendsTime = spendsTime;
    }

    public String getRunningMileage() {
        return runningMileage;
    }

    public void setRunningMileage(String runningMileage) {
        this.runningMileage = runningMileage == null ? null : runningMileage.trim();
    }

    public Integer getCumulativeTime() {
        return cumulativeTime;
    }

    public void setCumulativeTime(Integer cumulativeTime) {
        this.cumulativeTime = cumulativeTime;
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

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getBluetoothKey() {
        return bluetoothKey;
    }

    public void setBluetoothKey(String bluetoothKey) {
        this.bluetoothKey = bluetoothKey == null ? null : bluetoothKey.trim();
    }

    public String getBluetoothName() {
        return bluetoothName;
    }

    public void setBluetoothName(String bluetoothName) {
        this.bluetoothName = bluetoothName == null ? null : bluetoothName.trim();
    }

    public Integer getBluetoothType() {
        return bluetoothType;
    }

    public void setBluetoothType(Integer bluetoothType) {
        this.bluetoothType = bluetoothType;
    }

    public String getBluetoothPassword() {
        return bluetoothPassword;
    }

    public void setBluetoothPassword(String bluetoothPassword) {
        this.bluetoothPassword = bluetoothPassword == null ? null : bluetoothPassword.trim();
    }

    public Integer getValuationRuleStatus() {
        return valuationRuleStatus;
    }

    public void setValuationRuleStatus(Integer valuationRuleStatus) {
        this.valuationRuleStatus = valuationRuleStatus;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName == null ? null : vehicleModelName.trim();
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId == null ? null : paymentId.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Integer getPaymentSource() {
        return paymentSource;
    }

    public void setPaymentSource(Integer paymentSource) {
        this.paymentSource = paymentSource;
    }

    public String getPreOrderId() {
        return preOrderId;
    }

    public void setPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId == null ? null : preOrderId.trim();
    }

    public String getPrelicesingId() {
        return prelicesingId;
    }

    public void setPrelicesingId(String prelicesingId) {
        this.prelicesingId = prelicesingId == null ? null : prelicesingId.trim();
    }

    public Integer getPrelicesingFlag() {
        return prelicesingFlag;
    }

    public void setPrelicesingFlag(Integer prelicesingFlag) {
        this.prelicesingFlag = prelicesingFlag;
    }

    public String getPrelicesingAuthNo() {
        return prelicesingAuthNo;
    }

    public void setPrelicesingAuthNo(String prelicesingAuthNo) {
        this.prelicesingAuthNo = prelicesingAuthNo == null ? null : prelicesingAuthNo.trim();
    }

    public String getPrelicesingOperationId() {
        return prelicesingOperationId;
    }

    public void setPrelicesingOperationId(String prelicesingOperationId) {
        this.prelicesingOperationId = prelicesingOperationId == null ? null : prelicesingOperationId.trim();
    }

    public BigDecimal getPrelicesingAmount() {
        return prelicesingAmount;
    }

    public void setPrelicesingAmount(BigDecimal prelicesingAmount) {
        this.prelicesingAmount = prelicesingAmount;
    }

    public BigDecimal getPrelicesingCreditAmount() {
        return prelicesingCreditAmount;
    }

    public void setPrelicesingCreditAmount(BigDecimal prelicesingCreditAmount) {
        this.prelicesingCreditAmount = prelicesingCreditAmount;
    }

    public BigDecimal getPrelicesingFundAmount() {
        return prelicesingFundAmount;
    }

    public void setPrelicesingFundAmount(BigDecimal prelicesingFundAmount) {
        this.prelicesingFundAmount = prelicesingFundAmount;
    }

    public Integer getPrelicesingFlagOrigin() {
        return prelicesingFlagOrigin;
    }

    public void setPrelicesingFlagOrigin(Integer prelicesingFlagOrigin) {
        this.prelicesingFlagOrigin = prelicesingFlagOrigin;
    }

    public Integer getDepositFree() {
        return depositFree;
    }

    public void setDepositFree(Integer depositFree) {
        this.depositFree = depositFree;
    }

    public BigDecimal getPrelicesingAmountOrigin() {
        return prelicesingAmountOrigin;
    }

    public void setPrelicesingAmountOrigin(BigDecimal prelicesingAmountOrigin) {
        this.prelicesingAmountOrigin = prelicesingAmountOrigin;
    }

    public BigDecimal getPrelicesingCreditAmountOrigin() {
        return prelicesingCreditAmountOrigin;
    }

    public void setPrelicesingCreditAmountOrigin(BigDecimal prelicesingCreditAmountOrigin) {
        this.prelicesingCreditAmountOrigin = prelicesingCreditAmountOrigin;
    }

    public BigDecimal getPrelicesingFundAmountOrigin() {
        return prelicesingFundAmountOrigin;
    }

    public void setPrelicesingFundAmountOrigin(BigDecimal prelicesingFundAmountOrigin) {
        this.prelicesingFundAmountOrigin = prelicesingFundAmountOrigin;
    }

    public BigDecimal getPrelicesingRestAmount() {
        return prelicesingRestAmount;
    }

    public void setPrelicesingRestAmount(BigDecimal prelicesingRestAmount) {
        this.prelicesingRestAmount = prelicesingRestAmount;
    }

    public BigDecimal getPrelicesingRestAmountOrigin() {
        return prelicesingRestAmountOrigin;
    }

    public void setPrelicesingRestAmountOrigin(BigDecimal prelicesingRestAmountOrigin) {
        this.prelicesingRestAmountOrigin = prelicesingRestAmountOrigin;
    }

    public Byte getPrelicesingType() {
        return prelicesingType;
    }

    public void setPrelicesingType(Byte prelicesingType) {
        this.prelicesingType = prelicesingType;
    }

    public Byte getTempAuth() {
        return tempAuth;
    }

    public void setTempAuth(Byte tempAuth) {
        this.tempAuth = tempAuth;
    }

    public Byte getTypeNote() {
        return typeNote;
    }

    public void setTypeNote(Byte typeNote) {
        this.typeNote = typeNote;
    }

    public Byte getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Byte businessType) {
        this.businessType = businessType;
    }

    public Integer getUbiScoreFlag() {
        return ubiScoreFlag;
    }

    public void setUbiScoreFlag(Integer ubiScoreFlag) {
        this.ubiScoreFlag = ubiScoreFlag;
    }
}