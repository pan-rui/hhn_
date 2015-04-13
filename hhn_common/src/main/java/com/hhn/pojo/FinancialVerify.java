package com.hhn.pojo;

// Generated 2014-12-2 15:40:14 by Hibernate Tools 3.4.0.CR1

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * FinancialVerify generated by hbm2java
 */
@Alias("financial_verify")
public class FinancialVerify implements java.io.Serializable {

	private Integer productId;
	private Integer firstVerifyStatus;
	private Integer firstWorkerId;
	private Integer secondVerifyStatus;
	private Integer secondWorkerId;
	private Integer thirdVerifyStatus;
	private Integer thirdWorkerId;
	private Integer fourthVerifyStatus;
	private Integer fourthWorkerId;
	private Date createTime;
	private Date updateTime;
	private Integer verifyType;

	public FinancialVerify() {
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getVerifyType() {
		return verifyType;
	}

	public void setVerifyType(Integer verifyType) {
		this.verifyType = verifyType;
	}

	public FinancialVerify(Integer productId) {
		this.productId = productId;
	}

	public FinancialVerify(Integer productId, Integer firstVerifyStatus, Integer firstWorkerId, Integer secondVerifyStatus, Integer secondWorkerId, Integer thirdVerifyStatus, Integer thirdWorkerId, Integer fourthVerifyStatus, Integer fourthWorkerId, Date createTime, Date updateTime, Integer verifyType) {
		this.productId = productId;
		this.firstVerifyStatus = firstVerifyStatus;
		this.firstWorkerId = firstWorkerId;
		this.secondVerifyStatus = secondVerifyStatus;
		this.secondWorkerId = secondWorkerId;
		this.thirdVerifyStatus = thirdVerifyStatus;
		this.thirdWorkerId = thirdWorkerId;
		this.fourthVerifyStatus = fourthVerifyStatus;
		this.fourthWorkerId = fourthWorkerId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.verifyType = verifyType;
	}

	public Integer getFirstVerifyStatus() {
		return this.firstVerifyStatus;
	}

	public void setFirstVerifyStatus(Integer firstVerifyStatus) {
		this.firstVerifyStatus = firstVerifyStatus;
	}

	public Integer getFirstWorkerId() {
		return this.firstWorkerId;
	}

	public void setFirstWorkerId(Integer firstWorkerId) {
		this.firstWorkerId = firstWorkerId;
	}

	public Integer getSecondVerifyStatus() {
		return this.secondVerifyStatus;
	}

	public void setSecondVerifyStatus(Integer secondVerifyStatus) {
		this.secondVerifyStatus = secondVerifyStatus;
	}

	public Integer getSecondWorkerId() {
		return this.secondWorkerId;
	}

	public void setSecondWorkerId(Integer secondWorkerId) {
		this.secondWorkerId = secondWorkerId;
	}

	public Integer getThirdVerifyStatus() {
		return this.thirdVerifyStatus;
	}

	public void setThirdVerifyStatus(Integer thirdVerifyStatus) {
		this.thirdVerifyStatus = thirdVerifyStatus;
	}

	public Integer getThirdWorkerId() {
		return this.thirdWorkerId;
	}

	public void setThirdWorkerId(Integer thirdWorkerId) {
		this.thirdWorkerId = thirdWorkerId;
	}

	public Integer getFourthVerifyStatus() {
		return this.fourthVerifyStatus;
	}

	public void setFourthVerifyStatus(Integer fourthVerifyStatus) {
		this.fourthVerifyStatus = fourthVerifyStatus;
	}

	public Integer getFourthWorkerId() {
		return this.fourthWorkerId;
	}

	public void setFourthWorkerId(Integer fourthWorkerId) {
		this.fourthWorkerId = fourthWorkerId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}