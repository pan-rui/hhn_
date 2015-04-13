package com.hhn.pojo;

// Generated 2014-12-2 15:40:14 by Hibernate Tools 3.4.0.CR1

import org.apache.ibatis.type.Alias;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * FundComplaint generated by hbm2java
 */
@Alias("fund_complaint")
public class FundComplaint implements java.io.Serializable {

	private Integer complaint_id;
	@NotNull
	private int to_user_id;
	@NotNull
	private int from_user_id;
	@NotNull
	private String reason;
	private String remark;
	private Date create_time;
	private Date update_time;

	public FundComplaint() {
	}

	public FundComplaint(Integer complaint_id, int to_user_id, int from_user_id, String reason, String remark, Date create_time, Date update_time) {
		this.complaint_id = complaint_id;
		this.to_user_id = to_user_id;
		this.from_user_id = from_user_id;
		this.reason = reason;
		this.remark = remark;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public Integer getComplaint_id() {
		return complaint_id;
	}

	public void setComplaint_id(Integer complaint_id) {
		this.complaint_id = complaint_id;
	}

	public int getTo_user_id() {
		return to_user_id;
	}

	public void setTo_user_id(int to_user_id) {
		this.to_user_id = to_user_id;
	}

	public int getFrom_user_id() {
		return from_user_id;
	}

	public void setFrom_user_id(int from_user_id) {
		this.from_user_id = from_user_id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
