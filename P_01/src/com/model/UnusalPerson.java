package com.model;

import java.util.Date;

//特殊人群
public class UnusalPerson {
	private Integer id;
	//区县
	private String district;
	//年度
	private Integer year = new Date().getYear();
	//user
	private User user;
	
	//义务教育阶段公办学校就读的学生总数
	private int studentTotal;
	
	//进城务工人员随迁子女:work
	
	//上年在公办学校就读进城务工人员随迁子女数
	private int workLastAmount;
	//本年在公办学校就读进城务工人员随迁子女数
	private int workThisAmount;
	//与上年相比新增在公办学校就读进城务工人员随迁子女数
	private int workIncAmount;
	//在公办学校就读的进城务工人员随迁子女比例
	private float workScale;
	//计(万元)
	private float workMoneyTotal;
	//其中:省本级(万元)
	private float workMoneyProvince;
	//其中:区县本级(万元)
	private float workMoneyDistrict;
	
	//特殊儿童:unique
	
	//新建改扩建特殊教育学校数
	private int uniqueSchool;
	//特殊教育学校覆盖区县数
	private int uniqueDistrict;
	//计(万元)
	private float uniqueMoneyTotal;
	//其中:省本级(万元)
	private float uniqueMoneyProvince;
	//其中:区县本级(万元)
	private float uniqueMoneyDistrict;
	
	//家庭经济困难学生:dif
	
	//建立义务教育阶段家庭经济困难学生帮扶资助体系的区县数
	private int difDistrict;
	//惠及学生数
	private int difStudent;
	//计(万元)
	private float difMoneyTotal;
	//其中:省本级(万元)
	private float difMoneyProvince;
	//其中:区县本级(万元)
	private float difMoneyDistrict;
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
	public int getStudentTotal() {
		return studentTotal;
	}
	public void setStudentTotal(int studentTotal) {
		this.studentTotal = studentTotal;
	}
	public int getWorkLastAmount() {
		return workLastAmount;
	}
	public void setWorkLastAmount(int workLastAmount) {
		this.workLastAmount = workLastAmount;
	}
	public int getWorkThisAmount() {
		return workThisAmount;
	}
	public void setWorkThisAmount(int workThisAmount) {
		this.workThisAmount = workThisAmount;
	}
	public int getWorkIncAmount() {
		return workIncAmount;
	}
	public void setWorkIncAmount(int workIncAmount) {
		this.workIncAmount = workIncAmount;
	}
	public float getWorkScale() {
		return workScale;
	}
	public void setWorkScale(float workScale) {
		this.workScale = workScale;
	}
	public float getWorkMoneyTotal() {
		return workMoneyTotal;
	}
	public void setWorkMoneyTotal(float workMoneyTotal) {
		this.workMoneyTotal = workMoneyTotal;
	}
	public float getWorkMoneyProvince() {
		return workMoneyProvince;
	}
	public void setWorkMoneyProvince(float workMoneyProvince) {
		this.workMoneyProvince = workMoneyProvince;
	}
	public float getWorkMoneyDistrict() {
		return workMoneyDistrict;
	}
	public void setWorkMoneyDistrict(float workMoneyDistrict) {
		this.workMoneyDistrict = workMoneyDistrict;
	}
	public int getUniqueSchool() {
		return uniqueSchool;
	}
	public void setUniqueSchool(int uniqueSchool) {
		this.uniqueSchool = uniqueSchool;
	}
	public int getUniqueDistrict() {
		return uniqueDistrict;
	}
	public void setUniqueDistrict(int uniqueDistrict) {
		this.uniqueDistrict = uniqueDistrict;
	}
	public float getUniqueMoneyTotal() {
		return uniqueMoneyTotal;
	}
	public void setUniqueMoneyTotal(float uniqueMoneyTotal) {
		this.uniqueMoneyTotal = uniqueMoneyTotal;
	}
	public float getUniqueMoneyProvince() {
		return uniqueMoneyProvince;
	}
	public void setUniqueMoneyProvince(float uniqueMoneyProvince) {
		this.uniqueMoneyProvince = uniqueMoneyProvince;
	}
	public float getUniqueMoneyDistrict() {
		return uniqueMoneyDistrict;
	}
	public void setUniqueMoneyDistrict(float uniqueMoneyDistrict) {
		this.uniqueMoneyDistrict = uniqueMoneyDistrict;
	}
	public int getDifDistrict() {
		return difDistrict;
	}
	public void setDifDistrict(int difDistrict) {
		this.difDistrict = difDistrict;
	}
	public int getDifStudent() {
		return difStudent;
	}
	public void setDifStudent(int difStudent) {
		this.difStudent = difStudent;
	}
	public float getDifMoneyTotal() {
		return difMoneyTotal;
	}
	public void setDifMoneyTotal(float difMoneyTotal) {
		this.difMoneyTotal = difMoneyTotal;
	}
	public float getDifMoneyProvince() {
		return difMoneyProvince;
	}
	public void setDifMoneyProvince(float difMoneyProvince) {
		this.difMoneyProvince = difMoneyProvince;
	}
	public float getDifMoneyDistrict() {
		return difMoneyDistrict;
	}
	public void setDifMoneyDistrict(float difMoneyDistrict) {
		this.difMoneyDistrict = difMoneyDistrict;
	}
	
	
}
