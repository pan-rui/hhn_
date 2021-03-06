package com.hhn.pojo;

// Generated 2014-12-2 15:40:14 by Hibernate Tools 3.4.0.CR1

import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;
import java.util.Date;

/**
 * FundInvestmentDetail generated by hbm2java
 */
@Alias("fund_investment_detail")
public class FundInvestmentDetail implements java.io.Serializable {

	private Integer investment_detail_id;
	private Integer product_id;
	private String product_name;
	private Integer user_id;
	private Integer user_account_id;
	private BigDecimal trade_amount;
	private String remark;
	private Date invest_time;
	private Date update_time;
	private Integer fund_trade_id;
	private Short invest_period;
	private BigDecimal income;
	private Integer status;
	private Integer loan_user_id;
	private FundProduct fundProduct;

	public FundInvestmentDetail() {
	}

	public BigDecimal getIncome() {
		return income;
	}
	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	public Short getInvest_period() {
		return invest_period;
	}

	public void setInvest_period(Short invest_period) {
		this.invest_period = invest_period;
	}

	public Integer getFund_trade_id() {
		return fund_trade_id;
	}

	public void setFund_trade_id(Integer fund_trade_id) {
		this.fund_trade_id = fund_trade_id;
	}

	public FundInvestmentDetail(Integer investment_detail_id) {
		this.investment_detail_id = investment_detail_id;

	}

	public Integer getLoan_user_id() {
		return loan_user_id;
	}

	public void setLoan_user_id(Integer loan_user_id) {
		this.loan_user_id = loan_user_id;
	}

	public FundProduct getFundProduct() {
		return fundProduct;
	}

	public void setFundProduct(FundProduct fundProduct) {
		this.fundProduct = fundProduct;
	}

	public Integer getInvestment_detail_id() {
		return investment_detail_id;
	}

	public void setInvestment_detail_id(Integer investment_detail_id) {
		this.investment_detail_id = investment_detail_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getUser_account_id() {
		return user_account_id;
	}

	public void setUser_account_id(Integer user_account_id) {
		this.user_account_id = user_account_id;
	}

	public BigDecimal getTrade_amount() {
		return trade_amount;
	}

	public void setTrade_amount(BigDecimal trade_amount) {
		this.trade_amount = trade_amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getInvest_time() {
		return invest_time;
	}

	public void setInvest_time(Date invest_time) {
		this.invest_time = invest_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
