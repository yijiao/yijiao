package com.model;

import java.util.Date;

//教育经费
public class EducationMoney {

	private Integer id;
	//区县
	private String district;
	//年度
	private Integer year = new Date().getYear();
	//user
	private User user;
	
	//督导评估中追回的滞拨义务教育经费:hold
	
	//经费项目名称
	private String holdName;
	//金额(万元)
	private float holdMoney;
	
	//督导评估中追回的被挤占挪用的经费:own
	
	//经费项目名称
	private String ownName;
	//金额(万元)
	private float ownMoney;
	
	//督导评估中为消除薄弱环节增拨经费:inc
	//经费项目名称
	private String incName;
	//金额(万元)
	private float incMoney;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getHoldName() {
		return holdName;
	}
	public void setHoldName(String holdName) {
		this.holdName = holdName;
	}
	public float getHoldMoney() {
		return holdMoney;
	}
	public void setHoldMoney(float holdMoney) {
		this.holdMoney = holdMoney;
	}
	public String getOwnName() {
		return ownName;
	}
	public void setOwnName(String ownName) {
		this.ownName = ownName;
	}
	public float getOwnMoney() {
		return ownMoney;
	}
	public void setOwnMoney(float ownMoney) {
		this.ownMoney = ownMoney;
	}
	public String getIncName() {
		return incName;
	}
	public void setIncName(String incName) {
		this.incName = incName;
	}
	public float getIncMoney() {
		return incMoney;
	}
	public void setIncMoney(float incMoney) {
		this.incMoney = incMoney;
	}
	
}
