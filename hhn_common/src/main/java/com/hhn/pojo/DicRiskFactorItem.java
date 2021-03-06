package com.hhn.pojo;

// Generated 2014-12-2 15:40:14 by Hibernate Tools 3.4.0.CR1

import org.apache.ibatis.type.Alias;

/**
 * DicRiskFactorItem generated by hbm2java
 */
@Alias("dic_risk_factor_item")
public class DicRiskFactorItem implements java.io.Serializable {

	private int item_id;
	private String item_value;
	private Byte item_status;

	public DicRiskFactorItem() {
	}

	public DicRiskFactorItem(int item_id, String item_value, Byte item_status) {
		this.item_id = item_id;
		this.item_value = item_value;
		this.item_status = item_status;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_value() {
		return item_value;
	}

	public void setItem_value(String item_value) {
		this.item_value = item_value;
	}

	public Byte getItem_status() {
		return item_status;
	}

	public void setItem_status(Byte item_status) {
		this.item_status = item_status;
	}
}
