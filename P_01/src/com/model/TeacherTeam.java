package com.model;

import java.util.Date;

//师资队伍
public class TeacherTeam {

	private Integer id;
	//区县
	private String district;
	//年度
	private Integer year = new Date().getYear();
	//user
	private User user;
	
	//全区（县）义务教育阶段专任教师总数量（人）
	private int teacherTotal;
	
	//教师补充
	
	//数量(人):supply
	private int supplyAmount;
	//覆盖校数
	private int supplySchool;
	//占专任教师总数比例
	private float supplyScale;
	//投入经费
	//计(万元)
	private float supplyMoneyTotal;
	//其中:省本级(万元)
	private float supplyMoneyProvince;
	//其中:区县本级(万元)
	private float supplyMoneyDistrict;
	
	//教师流动:flow
	
	//数量(人)
	private int flowAmount;
	//覆盖校数
	private int flowSchool;
	//占专任教师总数比例
	private float flowScale;
	//投入经费
	//计(万元)
	private float flowMoneyTotal;
	//其中:省本级(万元)
	private float flowMoneyProvince;
	//其中:区县本级(万元)
	private float flowMoneyDistrict;
	
	//教师培训:train
	
	//数量(人)
	private int trainAmount;
	//覆盖校数
	private int trainSchool;
	//占专任教师总数比例
	private float trainScale;
	//投入经费
	//计(万元)
	private float trainMoneyTotal;
	//其中:省本级(万元)
	private float trainMoneyProvince;
	//其中:区县本级(万元)
	private float trainMoneyDistrict;
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
	public int getTeacherTotal() {
		return teacherTotal;
	}
	public void setTeacherTotal(int teacherTotal) {
		this.teacherTotal = teacherTotal;
	}
	public int getSupplyAmount() {
		return supplyAmount;
	}
	public void setSupplyAmount(int supplyAmount) {
		this.supplyAmount = supplyAmount;
	}
	public int getSupplySchool() {
		return supplySchool;
	}
	public void setSupplySchool(int supplySchool) {
		this.supplySchool = supplySchool;
	}
	public float getSupplyScale() {
		return supplyScale;
	}
	public void setSupplyScale(float supplyScale) {
		this.supplyScale = supplyScale;
	}
	public float getSupplyMoneyTotal() {
		return supplyMoneyTotal;
	}
	public void setSupplyMoneyTotal(float supplyMoneyTotal) {
		this.supplyMoneyTotal = supplyMoneyTotal;
	}
	public float getSupplyMoneyProvince() {
		return supplyMoneyProvince;
	}
	public void setSupplyMoneyProvince(float supplyMoneyProvince) {
		this.supplyMoneyProvince = supplyMoneyProvince;
	}
	public float getSupplyMoneyDistrict() {
		return supplyMoneyDistrict;
	}
	public void setSupplyMoneyDistrict(float supplyMoneyDistrict) {
		this.supplyMoneyDistrict = supplyMoneyDistrict;
	}
	public int getFlowAmount() {
		return flowAmount;
	}
	public void setFlowAmount(int flowAmount) {
		this.flowAmount = flowAmount;
	}
	public int getFlowSchool() {
		return flowSchool;
	}
	public void setFlowSchool(int flowSchool) {
		this.flowSchool = flowSchool;
	}
	public float getFlowScale() {
		return flowScale;
	}
	public void setFlowScale(float flowScale) {
		this.flowScale = flowScale;
	}
	public float getFlowMoneyTotal() {
		return flowMoneyTotal;
	}
	public void setFlowMoneyTotal(float flowMoneyTotal) {
		this.flowMoneyTotal = flowMoneyTotal;
	}
	public float getFlowMoneyProvince() {
		return flowMoneyProvince;
	}
	public void setFlowMoneyProvince(float flowMoneyProvince) {
		this.flowMoneyProvince = flowMoneyProvince;
	}
	public float getFlowMoneyDistrict() {
		return flowMoneyDistrict;
	}
	public void setFlowMoneyDistrict(float flowMoneyDistrict) {
		this.flowMoneyDistrict = flowMoneyDistrict;
	}
	public int getTrainAmount() {
		return trainAmount;
	}
	public void setTrainAmount(int trainAmount) {
		this.trainAmount = trainAmount;
	}
	public int getTrainSchool() {
		return trainSchool;
	}
	public void setTrainSchool(int trainSchool) {
		this.trainSchool = trainSchool;
	}
	public float getTrainScale() {
		return trainScale;
	}
	public void setTrainScale(float trainScale) {
		this.trainScale = trainScale;
	}
	public float getTrainMoneyTotal() {
		return trainMoneyTotal;
	}
	public void setTrainMoneyTotal(float trainMoneyTotal) {
		this.trainMoneyTotal = trainMoneyTotal;
	}
	public float getTrainMoneyProvince() {
		return trainMoneyProvince;
	}
	public void setTrainMoneyProvince(float trainMoneyProvince) {
		this.trainMoneyProvince = trainMoneyProvince;
	}
	public float getTrainMoneyDistrict() {
		return trainMoneyDistrict;
	}
	public void setTrainMoneyDistrict(float trainMoneyDistrict) {
		this.trainMoneyDistrict = trainMoneyDistrict;
	}

	
}
