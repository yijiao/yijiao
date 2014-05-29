package com.model;

import java.util.Date;

//工程项目情况
public class ProjectState {
	private Integer id;
	//区县
	private String district;
	//年度
	private Integer year = new Date().getYear();
	//user
	private User user;
	
	//项目名称
	private String name;
	//数量(平方米)
	private int amount;
	
	//经费投入(万元)
	
	//计
	private float moneyTotal;
	//中央资金
	private float moneyCenter;
	//市场经费
	private float moneyCity;
	//覆盖校数
	private int school;
	//备注
	private String remark;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public float getMoneyTotal() {
		return moneyTotal;
	}
	public void setMoneyTotal(float moneyTotal) {
		this.moneyTotal = moneyTotal;
	}
	public float getMoneyCenter() {
		return moneyCenter;
	}
	public void setMoneyCenter(float moneyCenter) {
		this.moneyCenter = moneyCenter;
	}
	public float getMoneyCity() {
		return moneyCity;
	}
	public void setMoneyCity(float moneyCity) {
		this.moneyCity = moneyCity;
	}
	public int getSchool() {
		return school;
	}
	public void setSchool(int school) {
		this.school = school;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
