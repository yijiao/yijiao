package com.model;

import java.util.Date;


//办学条件
public class EducationCondition {

	private Integer id;
	//区县
	private String district;
	//年度
	private Integer year = new Date().getYear();
	//user
	private User user;
	//新建改扩建校舍
	
	//数量(平方米)
	private Integer cshAmount;
	//覆盖区县
	private Integer cshDistrict;
	//覆盖校数
	private Integer cshSchool;
	//惠及学生(新增学位)
	private Integer cshStudent;
	//计(万元)
	private float cshMoneyTotal;
	//其中:省本级(万元)
	private float cshMoneyProvince;
	//其中:区县本级(万元)
	private float cshMoneyDistrict;
	
	//新建扩建宿舍
	
	//数量(平方米)
	private Integer shAmount;
	//覆盖区县
	private Integer shDistrict;
	//覆盖校数
	private Integer shSchool;
	//惠及学生(新增床位)
	private Integer shStudent;
	//计(万元)
	private float shMoneyTotal;
	//其中:省本级(万元)
	private float shMoneyProvince;
	//其中:区县本级(万元)
	private float shMoneyDistrict;
	
	//新增仪器设备
	
	//数量(台套)
	private Integer niAmount;
	//覆盖区县
	private Integer niDistrict;
	//覆盖校数
	private Integer niSchool;
	//计(万元)
	private float niMoneyTotal;
	//其中:省本级(万元)
	private float niMoneyProvince;
	//其中:区县本级(万元)
	private float niMoneyDistrict;
	
	//新增图书
	
	//数量(册套)
	private Integer nbAmount;
	//覆盖区县
	private Integer nbDistrict;
	//覆盖校数
	private Integer nbSchool;
	//计(万元)
	private float nbMoneyTotal;
	//其中:省本级(万元)
	private float nbMoneyProvince;
	//其中:区县本级(万元)
	private float nbMoneyDistrict;
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
	public Integer getCshAmount() {
		return cshAmount;
	}
	public void setCshAmount(Integer cshAmount) {
		this.cshAmount = cshAmount;
	}
	public Integer getCshDistrict() {
		return cshDistrict;
	}
	public void setCshDistrict(Integer cshDistrict) {
		this.cshDistrict = cshDistrict;
	}
	public Integer getCshSchool() {
		return cshSchool;
	}
	public void setCshSchool(Integer cshSchool) {
		this.cshSchool = cshSchool;
	}
	public Integer getCshStudent() {
		return cshStudent;
	}
	public void setCshStudent(Integer cshStudent) {
		this.cshStudent = cshStudent;
	}
	public float getCshMoneyTotal() {
		return cshMoneyTotal;
	}
	public void setCshMoneyTotal(float cshMoneyTotal) {
		this.cshMoneyTotal = cshMoneyTotal;
	}
	public float getCshMoneyProvince() {
		return cshMoneyProvince;
	}
	public void setCshMoneyProvince(float cshMoneyProvince) {
		this.cshMoneyProvince = cshMoneyProvince;
	}
	public float getCshMoneyDistrict() {
		return cshMoneyDistrict;
	}
	public void setCshMoneyDistrict(float cshMoneyDistrict) {
		this.cshMoneyDistrict = cshMoneyDistrict;
	}
	public Integer getShAmount() {
		return shAmount;
	}
	public void setShAmount(Integer shAmount) {
		this.shAmount = shAmount;
	}
	public Integer getShDistrict() {
		return shDistrict;
	}
	public void setShDistrict(Integer shDistrict) {
		this.shDistrict = shDistrict;
	}
	public Integer getShSchool() {
		return shSchool;
	}
	public void setShSchool(Integer shSchool) {
		this.shSchool = shSchool;
	}
	public Integer getShStudent() {
		return shStudent;
	}
	public void setShStudent(Integer shStudent) {
		this.shStudent = shStudent;
	}
	public float getShMoneyTotal() {
		return shMoneyTotal;
	}
	public void setShMoneyTotal(float shMoneyTotal) {
		this.shMoneyTotal = shMoneyTotal;
	}
	public float getShMoneyProvince() {
		return shMoneyProvince;
	}
	public void setShMoneyProvince(float shMoneyProvince) {
		this.shMoneyProvince = shMoneyProvince;
	}
	public float getShMoneyDistrict() {
		return shMoneyDistrict;
	}
	public void setShMoneyDistrict(float shMoneyDistrict) {
		this.shMoneyDistrict = shMoneyDistrict;
	}
	public Integer getNiAmount() {
		return niAmount;
	}
	public void setNiAmount(Integer niAmount) {
		this.niAmount = niAmount;
	}
	public Integer getNiDistrict() {
		return niDistrict;
	}
	public void setNiDistrict(Integer niDistrict) {
		this.niDistrict = niDistrict;
	}
	public Integer getNiSchool() {
		return niSchool;
	}
	public void setNiSchool(Integer niSchool) {
		this.niSchool = niSchool;
	}
	public float getNiMoneyTotal() {
		return niMoneyTotal;
	}
	public void setNiMoneyTotal(float niMoneyTotal) {
		this.niMoneyTotal = niMoneyTotal;
	}
	public float getNiMoneyProvince() {
		return niMoneyProvince;
	}
	public void setNiMoneyProvince(float niMoneyProvince) {
		this.niMoneyProvince = niMoneyProvince;
	}
	public float getNiMoneyDistrict() {
		return niMoneyDistrict;
	}
	public void setNiMoneyDistrict(float niMoneyDistrict) {
		this.niMoneyDistrict = niMoneyDistrict;
	}
	public Integer getNbAmount() {
		return nbAmount;
	}
	public void setNbAmount(Integer nbAmount) {
		this.nbAmount = nbAmount;
	}
	public Integer getNbDistrict() {
		return nbDistrict;
	}
	public void setNbDistrict(Integer nbDistrict) {
		this.nbDistrict = nbDistrict;
	}
	public Integer getNbSchool() {
		return nbSchool;
	}
	public void setNbSchool(Integer nbSchool) {
		this.nbSchool = nbSchool;
	}
	public float getNbMoneyTotal() {
		return nbMoneyTotal;
	}
	public void setNbMoneyTotal(float nbMoneyTotal) {
		this.nbMoneyTotal = nbMoneyTotal;
	}
	public float getNbMoneyProvince() {
		return nbMoneyProvince;
	}
	public void setNbMoneyProvince(float nbMoneyProvince) {
		this.nbMoneyProvince = nbMoneyProvince;
	}
	public float getNbMoneyDistrict() {
		return nbMoneyDistrict;
	}
	public void setNbMoneyDistrict(float nbMoneyDistrict) {
		this.nbMoneyDistrict = nbMoneyDistrict;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
}
