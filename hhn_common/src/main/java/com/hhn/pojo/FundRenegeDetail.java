package com.hhn.pojo;

// Generated 2014-12-2 15:40:14 by Hibernate Tools 3.4.0.CR1

import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;
import java.util.Date;

/**
 * FundRenegeDetail generated by hbm2java
 */
@Alias("fund_renege_detail")
public class FundRenegeDetail implements java.io.Serializable {

	private Integer renege_detail_id;
	private Integer product_id;
	private Date repay_date;
	private BigDecimal principal_amount;
	private BigDecimal interest_amount;
	private BigDecimal penalty_amount;
	private Date create_time;
	private Date update_time;

	public FundRenegeDetail() {
	}

	public FundRenegeDetail(Integer renege_detail_id, Integer product_id, Date repay_date, BigDecimal principal_amount, BigDecimal interest_amount, BigDecimal penalty_amount, Date create_time, Date update_time) {
		this.renege_detail_id = renege_detail_id;
		this.product_id = product_id;
		this.repay_date = repay_date;
		this.principal_amount = principal_amount;
		this.interest_amount = interest_amount;
		this.penalty_amount = penalty_amount;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public Integer getRenege_detail_id() {
		return renege_detail_id;
	}

	public void setRenege_detail_id(Integer renege_detail_id) {
		this.renege_detail_id = renege_detail_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Date getRepay_date() {
		return repay_date;
	}

	public void setRepay_date(Date repay_date) {
		this.repay_date = repay_date;
	}

	public BigDecimal getPrincipal_amount() {
		return principal_amount;
	}

	public void setPrincipal_amount(BigDecimal principal_amount) {
		this.principal_amount = principal_amount;
	}

	public BigDecimal getInterest_amount() {
		return interest_amount;
	}

	public void setInterest_amount(BigDecimal interest_amount) {
		this.interest_amount = interest_amount;
	}

	public BigDecimal getPenalty_amount() {
		return penalty_amount;
	}

	public void setPenalty_amount(BigDecimal penalty_amount) {
		this.penalty_amount = penalty_amount;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
}
