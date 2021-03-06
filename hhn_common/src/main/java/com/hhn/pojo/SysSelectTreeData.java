package com.hhn.pojo;

// Generated 2014-12-2 15:40:14 by Hibernate Tools 3.4.0.CR1

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * SysSelectTreeData generated by hbm2java
 */
@Alias("sys_select_tree_data")
public class SysSelectTreeData implements java.io.Serializable {

	private Integer id;
	private Integer parent_id;
	private String name;
	private String code;
	private String path;
	private Date create_time;
	private Date update_time;
	private Byte data_status;
	private Integer create_user_id;
	private Integer update_user_id;
	private String remark;
	private Byte data_type_code;

	public SysSelectTreeData() {
	}

	public SysSelectTreeData(Integer id, Integer parent_id, String name, String code, String path, Date create_time, Date update_time, Byte data_status, Integer create_user_id, Integer update_user_id, String remark, Byte data_type_code) {
		this.id = id;
		this.parent_id = parent_id;
		this.name = name;
		this.code = code;
		this.path = path;
		this.create_time = create_time;
		this.update_time = update_time;
		this.data_status = data_status;
		this.create_user_id = create_user_id;
		this.update_user_id = update_user_id;
		this.remark = remark;
		this.data_type_code = data_type_code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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

	public Byte getData_status() {
		return data_status;
	}

	public void setData_status(Byte data_status) {
		this.data_status = data_status;
	}

	public Integer getCreate_user_id() {
		return create_user_id;
	}

	public void setCreate_user_id(Integer create_user_id) {
		this.create_user_id = create_user_id;
	}

	public Integer getUpdate_user_id() {
		return update_user_id;
	}

	public void setUpdate_user_id(Integer update_user_id) {
		this.update_user_id = update_user_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Byte getData_type_code() {
		return data_type_code;
	}

	public void setData_type_code(Byte data_type_code) {
		this.data_type_code = data_type_code;
	}
}
